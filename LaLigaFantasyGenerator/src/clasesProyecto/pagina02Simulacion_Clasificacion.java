package clasesProyecto;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Ventana que muestra la clasificación final de la temporada simulada de LaLiga Fantasy.
 * Muestra la tabla de posiciones con puntos, partidos jugados, ganados, empatados, perdidos, goles y diferencia.
 */
public class pagina02Simulacion_Clasificacion extends JFrame {

    private static final long serialVersionUID = 1L;

    /**
     * Panel principal de la ventana.
     */
    private JPanel pagina02Simulacion_clasificacion;

    /**
     * Objeto para manejar la conexión a la base de datos MySQL.
     */
    private ConexionMySQL conexion;

    /**
     * Constructor que crea la ventana de clasificación.
     * 
     * @param conexion la conexión activa a la base de datos, no puede ser null
     * @throws IllegalArgumentException si la conexión es null
     */
    public pagina02Simulacion_Clasificacion(ConexionMySQL conexion) {
        if (conexion == null) {
            throw new IllegalArgumentException("La conexión no puede ser null");
        }
        this.setConexion(conexion);
        setTitle("LaLiga Fantasy Simulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 668, 533);
        pagina02Simulacion_clasificacion = new JPanel();
        pagina02Simulacion_clasificacion.setBorder(new EmptyBorder(5, 5, 5, 5));
        setLocationRelativeTo(null);
        setContentPane(pagina02Simulacion_clasificacion);
        pagina02Simulacion_clasificacion.setLayout(null);

        // Botón para volver a la ventana de simulación
        JButton btnNewButton = new JButton("Volver");
        btnNewButton.setBounds(34, 29, 81, 23);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pagina02Simulacion ventanaSimulacion = new pagina02Simulacion(conexion);
                ventanaSimulacion.setVisible(true);
                dispose();
            }
        });
        pagina02Simulacion_clasificacion.add(btnNewButton);

        // JTextArea para mostrar la clasificación en formato monoespaciado
        JTextArea txtClasificacion = new JTextArea();
        txtClasificacion.setEditable(false);
        txtClasificacion.setFont(new Font("Monospaced", Font.PLAIN, 12));
        txtClasificacion.setBackground(pagina02Simulacion_clasificacion.getBackground());
        txtClasificacion.setBounds(49, 81, 560, 402);

        // Construcción del texto con cabecera y datos alineados
        StringBuilder sb = new StringBuilder();

        // Línea de cabecera con etiquetas de columna, alineadas con los datos
        sb.append(String.format("%-4s %-20s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %4s%n",
            "Pos", "Equipo", "Pts", "PJ", "PG", "PE", "PP", "GF", "GC", "DF"));

        // Línea separadora para mejorar lectura
        sb.append("--------------------------------------------------------------------------\n");

        int posicion = 1;
        for (ClasificacionEquipo equipo : DatosTemporada.clasificacionFinal) {
            sb.append(String.format("%-4d %-20s | %3d | %3d | %3d | %3d | %3d | %3d | %3d | %+4d%n",
                    posicion++,
                    equipo.getNombre(),
                    equipo.getPuntos(),
                    equipo.getPJ(),
                    equipo.getPG(),
                    equipo.getPE(),
                    equipo.getPP(),
                    equipo.getGF(),
                    equipo.getGC(),
                    equipo.getDF()
            ));
        }

        txtClasificacion.setText(sb.toString());

        pagina02Simulacion_clasificacion.add(txtClasificacion);
    }

    /**
     * Método principal para ejecutar esta ventana de forma independiente para pruebas.
     * Establece la conexión a la base de datos y abre la ventana de clasificación.
     * 
     * @param args argumentos de línea de comandos (no se usan)
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                ConexionMySQL conexion = new ConexionMySQL("root", "1234", "laliga");
                conexion.conectar();
                new pagina02Simulacion_Clasificacion(conexion).setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Devuelve la conexión MySQL usada.
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
