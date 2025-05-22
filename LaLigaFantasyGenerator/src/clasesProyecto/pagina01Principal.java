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
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class pagina01Principal extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    ArrayList<Equipo> equiposLaLiga = new ArrayList<>();
    private ConexionMySQL conexion;

    public pagina01Principal(ConexionMySQL conexion) {
        if (conexion == null) {
            throw new IllegalArgumentException("La conexión no puede ser null");
        }
        this.conexion = conexion;

        setTitle("LaLiga Fantasy Simulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 345);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setToolTipText("LaLiga Fantasy Simulator");
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnNewButton_Simular = new JButton("SIMULAR TEMPORADA");
        btnNewButton_Simular.setBounds(146, 159, 141, 23);
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
        lblNewLabel_Foto_01Principal.setBounds(136, 29, 163, 119);
        contentPane.add(lblNewLabel_Foto_01Principal);

        ImageIcon icono2 = new ImageIcon(pagina01Principal.class.getResource("/images/LaLiga_EA_Sports_2023_Vertical_Logo.png"));
        Image imagen2 = icono2.getImage().getScaledInstance(lblNewLabel_Foto_01Principal.getWidth(), lblNewLabel_Foto_01Principal.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon iconoAjustado2 = new ImageIcon(imagen2);
        lblNewLabel_Foto_01Principal.setIcon(iconoAjustado2);

        JButton btnNewButton_Salir = new JButton("SALIR");
        btnNewButton_Salir.setBounds(185, 261, 63, 23);
        contentPane.add(btnNewButton_Salir);
        btnNewButton_Salir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JButton btnNewButton = new JButton("ELIMINAR DATOS");
        btnNewButton.setBounds(158, 227, 117, 23);
        contentPane.add(btnNewButton);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pagina03Borrar_Datos ventanaBorrar = new pagina03Borrar_Datos(conexion);
                ventanaBorrar.setVisible(true);
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        ConexionMySQL conexion = new ConexionMySQL("root", "1234", "laliga");
        try {
            conexion.conectar();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos: " + e.getMessage());
            System.exit(1);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    pagina01Principal frame01Principal = new pagina01Principal(conexion);
                    frame01Principal.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

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

    public void borrarTemporadaExistente() {
        try {
            String eliminar = "DELETE FROM partidos";
            conexion.ejecutarInsertDeleteUpdate(eliminar);

            String reiniciarAutoIncrement = "ALTER TABLE partidos AUTO_INCREMENT = 1";
            conexion.ejecutarInsertDeleteUpdate(reiniciarAutoIncrement);

            System.out.println("Temporada anterior eliminada y AUTO_INCREMENT reiniciado.");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al borrar la temporada anterior: " + e.getMessage());
        }
    }

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

    public void simularTemporadaYGuardarPartidos() {
        int numEquipos = equiposLaLiga.size();
        int numJornadas = (numEquipos - 1) * 2;
        String temporadaActual = calcularTemporadaDesdeAnioActual();

        for (int jornada = 0; jornada < numJornadas; jornada++) {
            int numeroJornada = jornada + 1;

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

                float ventajaLocal = local.getValoracion() * 1.2f;
                int maxGolesLocal = Math.max(1, (int) (ventajaLocal / 10 + 1));
                int maxGolesVisitante = Math.max(1, (int) (visitante.getValoracion() / 10 + 1));

                int golesLocal = (int) (Math.random() * (maxGolesLocal + 1));
                int golesVisitante = (int) (Math.random() * (maxGolesVisitante + 1));

                local.actualizarDatos(golesLocal, golesVisitante);
                visitante.actualizarDatos(golesVisitante, golesLocal);

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
        }

        JOptionPane.showMessageDialog(null, "Temporada " + temporadaActual + " simulada y guardada.");
    }

    public String calcularTemporadaDesdeAnioActual() {
        int anioActual = Year.now().getValue() % 100;
        int siguienteAnio = (anioActual + 1) % 100;
        return String.format("%02d/%02d", anioActual, siguienteAnio);
    }
}
