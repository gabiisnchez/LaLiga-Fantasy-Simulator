package clasesProyecto;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * JFrame que muestra la simulación de jornadas de LaLiga Fantasy,
 * listando los partidos y resultados en un área de texto con formato monoespaciado.
 * Utiliza una conexión a base de datos MySQL para obtener los datos.
 */
public class pagina02Simulacion_Jornada extends JFrame {

    private static final long serialVersionUID = 1L;

    /** Panel principal de la ventana */
    private JPanel pagina02Simulacion_Jornada;

    /** Objeto para gestionar la conexión a la base de datos */
    private ConexionMySQL conexion;

    /** Área de texto para mostrar los resultados de las jornadas */
    private JTextArea areaResultados;

    /**
     * Constructor que inicializa la ventana con la conexión a base de datos.
     * @param conexion La conexión a base de datos, no puede ser null.
     * @throws IllegalArgumentException si la conexión es null.
     */
    public pagina02Simulacion_Jornada(ConexionMySQL conexion) {
        if (conexion == null) {
            throw new IllegalArgumentException("La conexión no puede ser null");
        }
        this.setConexion(conexion);

        setTitle("LaLiga Fantasy Simulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 900, 700);

        pagina02Simulacion_Jornada = new JPanel();
        pagina02Simulacion_Jornada.setBackground(UIManager.getColor("Menu.background"));
        pagina02Simulacion_Jornada.setBorder(new EmptyBorder(5, 5, 5, 5));
        setLocationRelativeTo(null);
        pagina02Simulacion_Jornada.setLayout(null);
        setContentPane(pagina02Simulacion_Jornada);

        // Imagen del logo de LaLiga
        ImageIcon icono2 = new ImageIcon(pagina02Simulacion_Jornada.class.getResource("/images/LaLiga_EA_Sports_2023_Vertical_Logo.png"));
        JLabel lblFoto_02Jornada = new JLabel("");
        lblFoto_02Jornada.setBounds(333, 63, 205, 151);
        Image imagen2 = icono2.getImage().getScaledInstance(205, 151, Image.SCALE_SMOOTH);
        lblFoto_02Jornada.setIcon(new ImageIcon(imagen2));
        pagina02Simulacion_Jornada.add(lblFoto_02Jornada);

        // Botón para volver a la ventana anterior
        JButton btnVolver_02SimulacionJornada = new JButton("Volver");
        btnVolver_02SimulacionJornada.setBounds(64, 35, 100, 25);
        btnVolver_02SimulacionJornada.addActionListener(e -> {
            pagina02Simulacion ventanaSimulacion = new pagina02Simulacion(conexion);
            ventanaSimulacion.setVisible(true);
            dispose();
        });
        pagina02Simulacion_Jornada.add(btnVolver_02SimulacionJornada);

        // Área de texto para mostrar los resultados con fuente monoespaciada
        areaResultados = new JTextArea();
        areaResultados.setEditable(false);
        areaResultados.setFont(new Font("Monospaced", Font.PLAIN, 14)); // Fuente clave para alineación
        JScrollPane scrollPane = new JScrollPane(areaResultados);
        scrollPane.setBounds(100, 250, 700, 350);
        pagina02Simulacion_Jornada.add(scrollPane);

        // Carga y muestra los resultados de las jornadas
        cargarYMostrarJornadas();
    }

    /**
     * Consulta la base de datos para obtener los resultados de partidos
     * y los muestra en el JTextArea con formato alineado y organizado por jornada.
     */
    private void cargarYMostrarJornadas() {
        try {
            String query = "SELECT * FROM partidos ORDER BY CAST(jornada AS UNSIGNED), idpartidos";
            var rs = conexion.ejecutarSelect(query);

            StringBuilder sb = new StringBuilder();
            int jornadaActual = -1;

            while (rs.next()) {
                int jornada = rs.getInt("jornada");
                String local = rs.getString("nombre_local");
                String visitante = rs.getString("nombre_visitante");
                int golesLocal = rs.getInt("goles_local");
                int golesVisitante = rs.getInt("goles_visitante");

                if (jornada != jornadaActual) {
                    if (jornadaActual != -1) {
                        sb.append("\n"); // Línea en blanco entre jornadas
                    }
                    sb.append(String.format("                 ================== JORNADA %2d ===================%n", jornada));
                    jornadaActual = jornada;
                }

                // Formato: equipo local (izquierda), resultado (centrado), equipo visitante (derecha)
                sb.append(String.format("                 %-20s %-7s %20s%n", local, golesLocal + " - " + golesVisitante, visitante));
            }

            rs.close();

            areaResultados.setText(sb.toString());
            // Posiciona el scroll al principio del texto
            areaResultados.setCaretPosition(0);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al cargar las jornadas: " + e.getMessage());
        }
    }

    /**
     * Método main para ejecutar la ventana de simulación de jornadas de forma independiente para pruebas.
     * @param args argumentos de línea de comandos (no usados).
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                ConexionMySQL conexion = new ConexionMySQL("root", "1234", "laliga");
                conexion.conectar();
                new pagina02Simulacion_Jornada(conexion).setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /** @return la conexión actual a base de datos */
    public ConexionMySQL getConexion() {
        return conexion;
    }

    /** 
     * Establece la conexión a base de datos para la clase
     * @param conexion conexión a base de datos MySQL
     */
    public void setConexion(ConexionMySQL conexion) {
        this.conexion = conexion;
    }
}
