package clasesProyecto;

import java.awt.EventQueue;
import java.awt.Image;
import java.sql.SQLException;

import javax.swing.*;

/**
 * Ventana que permite borrar todos los datos de la temporada generada en la base de datos.
 * Tras confirmar el borrado, regresa automáticamente a la página principal del programa.
 */
public class pagina03Borrar_Datos extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private ConexionMySQL conexion;

    /**
     * Constructor que inicializa la ventana para borrar datos.
     * 
     * @param conexion conexión activa a la base de datos, no puede ser null
     */
    public pagina03Borrar_Datos(ConexionMySQL conexion) {
        this.setConexion(conexion);

        setTitle("LaLiga Fantasy Simulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);

        JLabel lblFoto = new JLabel();
        lblFoto.setBounds(33, 39, 363, 113);
        ImageIcon icono = new ImageIcon(getClass().getResource("/images/RGB_Logotipo_LALIGA_color_positivevg.png"));
        Image imagen = icono.getImage().getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_SMOOTH);
        lblFoto.setIcon(new ImageIcon(imagen));
        contentPane.add(lblFoto);

        JButton btnBorrarTodas = new JButton("BORRAR TEMPORADA GENERADA");
        btnBorrarTodas.setBounds(70, 163, 284, 23);
        contentPane.add(btnBorrarTodas);

        JButton btnVolver = new JButton("Volver");
        btnVolver.setBounds(151, 198, 121, 23);
        contentPane.add(btnVolver);

        // --- Acción del botón BORRAR TEMPORADA GENERADA ---
        btnBorrarTodas.addActionListener(e -> {
            try {
                if (!conexion.estaConectado()) {
                    conexion.conectar();
                }

                int confirmacion = JOptionPane.showConfirmDialog(null, 
                    "¿Seguro que quieres eliminar todos los partidos?", "Confirmar", JOptionPane.YES_NO_OPTION);

                if (confirmacion == JOptionPane.YES_OPTION) {
                    int filas = conexion.ejecutarInsertDeleteUpdate("DELETE FROM partidos");
                    conexion.ejecutarInsertDeleteUpdate("ALTER TABLE partidos AUTO_INCREMENT = 1");

                    if (filas > 0) {
                        JOptionPane.showMessageDialog(null, "Todos los partidos eliminados correctamente.");

                        // Volver automáticamente a la página principal tras borrar
                        pagina01Principal principal = new pagina01Principal(conexion);
                        principal.setVisible(true);
                        dispose();

                    } else {
                        JOptionPane.showMessageDialog(null, "No había partidos para eliminar.");
                    }
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error de base de datos: " + ex.getMessage());
            }
        });

        // --- Acción del botón VOLVER ---
        btnVolver.addActionListener(e -> {
            pagina01Principal principal = new pagina01Principal(conexion);
            principal.setVisible(true);
            dispose();
        });
    }

    /**
     * Método principal para pruebas individuales.
     * Crea la conexión a la base de datos y muestra esta ventana.
     * 
     * @param args argumentos de línea de comandos (no se usan)
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                ConexionMySQL conexion = new ConexionMySQL("root", "1234", "laliga");
                conexion.conectar();
                new pagina03Borrar_Datos(conexion).setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Devuelve la conexión MySQL utilizada por esta ventana.
     * 
     * @return objeto ConexionMySQL activo
     */
    public ConexionMySQL getConexion() {
        return conexion;
    }

    /**
     * Establece la conexión MySQL que usará esta ventana.
     * 
     * @param conexion objeto ConexionMySQL, no debe ser null
     */
    public void setConexion(ConexionMySQL conexion) {
        this.conexion = conexion;
    }
}
