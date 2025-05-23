package clasesProyecto;

import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Year;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/**
 * Clase principal de la aplicación LaLiga Fantasy Simulator.
 * Permite simular temporadas de LaLiga, gestionar la base de datos y mostrar resultados.
 */
public class pagina01Principal extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    ArrayList<Equipo> equiposLaLiga = new ArrayList<>();
    
    private ConexionMySQL conexion;
    private final Random random = new Random();

    /**
     * Constructor que inicializa la ventana principal con conexión a la base de datos.
     *
     * @param conexion Objeto ConexionMySQL ya conectado para operaciones BD.
     * @throws IllegalArgumentException si la conexión es null.
     */
    public pagina01Principal(ConexionMySQL conexion) {
        if (conexion == null) {
            throw new IllegalArgumentException("La conexión no puede ser null");
        }
        this.conexion = conexion;

        setTitle("LaLiga Fantasy Simulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 330);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setToolTipText("LaLiga Fantasy Simulator");
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnNewButton_Simular = new JButton("SIMULAR TEMPORADA");
        btnNewButton_Simular.setBounds(134, 151, 163, 23);
        contentPane.add(btnNewButton_Simular);
        btnNewButton_Simular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (hayTemporadaExistente()) {
                    int respuesta = JOptionPane.showConfirmDialog(
                            null,
                            "Ya existe una temporada simulada. ¿Deseas eliminarla y generar una nueva?",
                            "Temporada existente",
                            JOptionPane.YES_NO_OPTION
                    );

                    if (respuesta == JOptionPane.NO_OPTION) {
                        return;
                    }

                    borrarTemporadaExistente();
                }

                cargarEquiposDesdeBD();
                simularTemporadaYGuardarPartidos();

                pagina02Simulacion ventanaSimulacion = new pagina02Simulacion(conexion);
                ventanaSimulacion.setVisible(true);
                dispose();
            }
        });

        JLabel lblNewLabel_Foto_01Principal = new JLabel("");
        lblNewLabel_Foto_01Principal.setBounds(134, 21, 163, 119);
        contentPane.add(lblNewLabel_Foto_01Principal);

        ImageIcon icono2 = new ImageIcon(pagina01Principal.class.getResource("/images/LaLiga_EA_Sports_2023_Vertical_Logo.png"));
        Image imagen2 = icono2.getImage().getScaledInstance(lblNewLabel_Foto_01Principal.getWidth(), lblNewLabel_Foto_01Principal.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon iconoAjustado2 = new ImageIcon(imagen2);
        lblNewLabel_Foto_01Principal.setIcon(iconoAjustado2);

        
        JButton btnEliminar = new JButton("ELIMINAR DATOS");
        btnEliminar.setBounds(134, 219, 163, 23);
        contentPane.add(btnEliminar);
        btnEliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	pagina03Borrar_Datos ventanaBorrar = new pagina03Borrar_Datos(conexion);
                ventanaBorrar.setVisible(true);
                dispose();
                
            }
        });
        
        JButton btnVerTemporada = new JButton("VER TEMPORADA");
        btnVerTemporada.setBounds(134, 185, 163, 23);
        contentPane.add(btnVerTemporada);
        btnVerTemporada.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pagina02Simulacion ventanaSimulacion = new pagina02Simulacion(conexion);
                ventanaSimulacion.setVisible(true);
                dispose(); 
            }
        });
        
        JButton btnSalir = new JButton("SALIR");
        btnSalir.setBounds(134, 253, 163, 23);
        contentPane.add(btnSalir);
        btnSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
    
    

    /**
     * Método main para iniciar la aplicación.
     * Intenta conectar con la base de datos y muestra la ventana principal.
     *
     * @param args Argumentos de línea de comando (no usados).
     */
    public static void main(String[] args) {
        ConexionMySQL conexion = new ConexionMySQL("root", "1234", "laliga");
        try {
            conexion.conectar();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos: " + e.getMessage());
            System.exit(1);
        }

        EventQueue.invokeLater(() -> {
            try {
                pagina01Principal frame01Principal = new pagina01Principal(conexion);
                frame01Principal.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Carga la lista de equipos con sus valoraciones desde la base de datos.
     * Limpia la lista anterior y agrega los nuevos equipos cargados.
     */
    public void cargarEquiposDesdeBD() {
        equiposLaLiga.clear();
        try {
            String consulta = "SELECT nombre, valoración FROM equipos";
            ResultSet rs = conexion.ejecutarSelect(consulta);
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                float valoracion = rs.getFloat("valoración");
                Equipo equipo = new Equipo(nombre, valoracion, 0, 0, 0, 0, 0, 0, 0, 0);
                equiposLaLiga.add(equipo);
            }
            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al cargar los equipos: " + ex.getMessage());
        }
    }

    /**
     * Borra la temporada existente en la base de datos (tabla partidos) y reinicia el AUTO_INCREMENT.
     */
    public void borrarTemporadaExistente() {
        try {
            conexion.ejecutarInsertDeleteUpdate("DELETE FROM partidos");
            conexion.ejecutarInsertDeleteUpdate("ALTER TABLE partidos AUTO_INCREMENT = 1");
            System.out.println("Temporada anterior eliminada y AUTO_INCREMENT reiniciado.");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al borrar la temporada anterior: " + e.getMessage());
        }
    }

    /**
     * Verifica si ya hay una temporada simulada en la base de datos (si hay partidos registrados).
     *
     * @return true si existen partidos guardados, false en caso contrario.
     */
    public boolean hayTemporadaExistente() {
        try {
            ResultSet rs = conexion.ejecutarSelect("SELECT COUNT(*) AS total FROM partidos");
            if (rs.next()) {
                int total = rs.getInt("total");
                rs.close();
                return total > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * Simula toda la temporada generando los partidos, calculando los goles
     * y guardando los resultados en la base de datos.
     * Finalmente muestra la clasificación ordenada por puntos y diferencia de goles.
     */
    /**
     * Simula toda la temporada generando los partidos, calculando los goles
     * y guardando los resultados en la base de datos.
     * También guarda la clasificación final en DatosTemporada.
     */
    public void simularTemporadaYGuardarPartidos() {
        int numEquipos = equiposLaLiga.size();
        int numJornadas = (numEquipos - 1) * 2; // normalmente 38 jornadas para 20 equipos
        String temporadaActual = calcularTemporadaDesdeAnioActual();

        for (int jornada = 0; jornada < numJornadas; jornada++) {
            int numeroJornada = jornada + 1;
            System.out.println("\n=== Jornada " + numeroJornada + " ===");

            StringBuilder resultadosJornada = new StringBuilder();

            for (int i = 0; i < numEquipos / 2; i++) {
                int localIndex, visitanteIndex;

                if (jornada < numEquipos - 1) {
                    localIndex = (jornada + i) % (numEquipos - 1);
                    visitanteIndex = (numEquipos - 1 - i + jornada) % (numEquipos - 1);
                    if (i == 0) visitanteIndex = numEquipos - 1;
                } else {
                    visitanteIndex = (jornada - numEquipos + 1 + i) % (numEquipos - 1);
                    localIndex = (numEquipos - 1 - i + jornada - numEquipos + 1) % (numEquipos - 1);
                    if (i == 0) localIndex = numEquipos - 1;
                }

                Equipo local = equiposLaLiga.get(localIndex);
                Equipo visitante = equiposLaLiga.get(visitanteIndex);

                int golesLocal = calcularGolesRealista(local.getValoracion(), visitante.getValoracion(), true);
                int golesVisitante = calcularGolesRealista(visitante.getValoracion(), local.getValoracion(), false);

                local.actualizarDatos(golesLocal, golesVisitante);
                visitante.actualizarDatos(golesVisitante, golesLocal);

                resultadosJornada.append(String.format("%-20s %d - %d %s%n",
                        local.getNombre(), golesLocal, golesVisitante, visitante.getNombre()));

                String insert = String.format(
                        "INSERT INTO partidos (nombre_local, nombre_visitante, goles_local, goles_visitante, jornada, id_temporada) " +
                                "VALUES ('%s', '%s', %d, %d, %d, '%s')",
                        local.getNombre(), visitante.getNombre(), golesLocal, golesVisitante, numeroJornada, temporadaActual
                );

                try {
                    conexion.ejecutarInsertDeleteUpdate(insert);
                } catch (SQLException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error al insertar partido: " + e.getMessage());
                }
            }

            imprimirResultados.imprimirResultadosJornada(resultadosJornada.toString());

        }

        // Ordenar clasificación final por puntos y diferencia de goles
        equiposLaLiga.sort((e1, e2) -> {
            if (e2.getPuntos() != e1.getPuntos()) {
                return Integer.compare(e2.getPuntos(), e1.getPuntos());
            } else {
                int diferenciaGoles1 = e1.getGF() - e1.getGC();
                int diferenciaGoles2 = e2.getGF() - e2.getGC();
                return Integer.compare(diferenciaGoles2, diferenciaGoles1);
            }
        });

        // Guardar clasificación final en DatosTemporada
        DatosTemporada.clasificacionFinal.clear(); // Limpiar anteriores
        int posicion = 1;
        for (Equipo equipo : equiposLaLiga) {
            System.out.printf("%2d. %-20s | %2d | %2d | %2d | %2d | %2d | %2d | %2d | %+2d%n",
                    posicion++, equipo.getNombre(), equipo.getPuntos(), equipo.getPJ(),
                    equipo.getPG(), equipo.getPE(), equipo.getPP(),
                    equipo.getGF(), equipo.getGC(),
                    equipo.getGF() - equipo.getGC());

            // Añadir al array global
            ClasificacionEquipo clasificado = new ClasificacionEquipo(
                    equipo.getNombre(),
                    equipo.getPuntos(),
                    equipo.getPJ(),
                    equipo.getPG(),
                    equipo.getPE(),
                    equipo.getPP(),
                    equipo.getGF(),
                    equipo.getGC()
            );
            DatosTemporada.clasificacionFinal.add(clasificado);
        }

        JOptionPane.showMessageDialog(null, "Temporada " + temporadaActual + " simulada y guardada.");
    }


    /**
     * Calcula la temporada actual en formato "AA/AA" basado en el año actual.
     *
     * @return String con la temporada actual, por ejemplo "24/25".
     */
    public String calcularTemporadaDesdeAnioActual() {
        int anioActual = Year.now().getValue() % 100;
        int siguienteAnio = (anioActual + 1) % 100;
        return String.format("%02d/%02d", anioActual, siguienteAnio);
    }

    /**
     * Calcula de forma realista los goles que un equipo puede marcar frente a otro,
     * usando una distribución de Poisson aproximada, teniendo en cuenta la valoración
     * de ambos equipos y si juega en casa.
     *
     * @param valoracionEquipo Valoración del equipo local o visitante (según esLocal).
     * @param valoracionRival  Valoración del equipo rival.
     * @param esLocal          True si el equipo es local, false si es visitante.
     * @return Número entero de goles simulados.
     */
    private int calcularGolesRealista(float valoracionEquipo, float valoracionRival, boolean esLocal) {
        // Base mínima de goles para cualquier equipo
        float base = 0.8f;

        // Diferencia fuerte en valoración: multiplicamos por 2.0 para amplificar
        float diferencia = valoracionEquipo - valoracionRival;
        float mediaGoles = base + (diferencia * 2.0f);

        // Bonus por ser local
        if (esLocal) {
            mediaGoles += 0.5f;
        }

        // Limitar media para evitar extremos negativos o muy altos
        if (mediaGoles < 0.2f) mediaGoles = 0.2f;
        if (mediaGoles > 5.0f) mediaGoles = 5.0f;

        // Simulación de goles usando Poisson (aproximado)
        int goles = 0;
        double prob = Math.exp(-mediaGoles);
        double acumulado = prob;
        double randVal = random.nextDouble();

        while (randVal > acumulado && goles < 10) {
            goles++;
            prob = prob * mediaGoles / goles;
            acumulado += prob;
        }

        return goles;
    }
}
