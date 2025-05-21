package clasesProyecto;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class pagina04Borrar_Datos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel pagina03Consulta_Temporada;
	private JTextField textField_TemporadaAConsultar;
	private ConexionMySQL conexion;
	
	public static void main(String[] args) {
		ConexionMySQL conexion = new ConexionMySQL("root", "1234", "laliga");
		try {
			conexion.conectar();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pagina04Borrar_Datos frame04Borrar_Datos = new pagina04Borrar_Datos(conexion);
					frame04Borrar_Datos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public pagina04Borrar_Datos(ConexionMySQL conexion) {
		this.conexion = conexion;
		setTitle("LaLiga Fantasy Simulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		pagina03Consulta_Temporada = new JPanel();
		pagina03Consulta_Temporada.setToolTipText("LaLiga Fantasy Simulator");
		pagina03Consulta_Temporada.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(pagina03Consulta_Temporada);
		pagina03Consulta_Temporada.setLayout(null);
		
		textField_TemporadaAConsultar = new JTextField();
		textField_TemporadaAConsultar.setBounds(157, 137, 98, 20);
		pagina03Consulta_Temporada.add(textField_TemporadaAConsultar);
		textField_TemporadaAConsultar.setColumns(10);
		
		JLabel lblFoto_03Consulta_Temporada = new JLabel("");
		lblFoto_03Consulta_Temporada.setIcon(new ImageIcon(pagina01Principal.class.getResource("/images/RGB_Logotipo_LALIGA_color_positivevg.png")));
		lblFoto_03Consulta_Temporada.setBounds(33, 0, 363, 113);
		pagina03Consulta_Temporada.add(lblFoto_03Consulta_Temporada);
		
		ImageIcon icono2 = new ImageIcon(pagina01Principal.class.getResource("/images/RGB_Logotipo_LALIGA_color_positivevg.png"));
		Image imagen2 = icono2.getImage().getScaledInstance(lblFoto_03Consulta_Temporada.getWidth(), lblFoto_03Consulta_Temporada.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon iconoAjustado2 = new ImageIcon(imagen2); 
		lblFoto_03Consulta_Temporada.setIcon(iconoAjustado2);
		
		JButton btnBorrar = new JButton("BORRAR");
		btnBorrar.setBounds(157, 168, 98, 23);
		pagina03Consulta_Temporada.add(btnBorrar);
		
		JButton btnVolver_03ConsultaTemporada = new JButton("Volver");
		btnVolver_03ConsultaTemporada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pagina01Principal ventanaPrincipal = new pagina01Principal(conexion);
				ventanaPrincipal.setVisible(true);
				dispose();
			}
		});
		btnVolver_03ConsultaTemporada.setBounds(10, 227, 68, 23);
		pagina03Consulta_Temporada.add(btnVolver_03ConsultaTemporada);
		
		JButton btnBorrarTodas = new JButton("BORRAR TODAS LAS TEMPORADAS");
		btnBorrarTodas.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String borrarPartidos = "DELETE FROM partidos";
		        String borrarTemporadas = "DELETE FROM temporadas";
		        String reiniciarAutoIncrement = "ALTER TABLE partidos AUTO_INCREMENT = 1";

		        try {
		            // Primero borrar partidos
		            conexion.ejecutarInsertDeleteUpdate(borrarPartidos);
		            // Luego borrar temporadas
		            int filasAfectadas = conexion.ejecutarInsertDeleteUpdate(borrarTemporadas);
		            //Reiniciamos el incremento de idpartidos
		            conexion.ejecutarInsertDeleteUpdate(reiniciarAutoIncrement);
		            

		            if (filasAfectadas > 0) {
		                JOptionPane.showMessageDialog(null, "Todas las temporadas y partidos han sido eliminados.");
		            } else {
		                JOptionPane.showMessageDialog(null, "No hay temporadas para eliminar.");
		            }
		        } catch (SQLException ex) {
		            ex.printStackTrace();
		            JOptionPane.showMessageDialog(null, "Error al eliminar los datos: " + ex.getMessage());
		        }
		    }
		});
		btnBorrarTodas.setBounds(101, 202, 212, 23);
		pagina03Consulta_Temporada.add(btnBorrarTodas);
		
		JLabel lblLabel = new JLabel("¿Qué temporada quieres borrar?");
		lblLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblLabel.setBounds(113, 103, 187, 23);
		pagina03Consulta_Temporada.add(lblLabel);
		
		btnBorrar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String tempBorrar = textField_TemporadaAConsultar.getText();

		        // Suponiendo que "tempBorrar" es el nombre o ID de la temporada
		        // Asegúrate de que coincida con el campo correspondiente en tu tabla (por ejemplo, "nombre_temporada" o "id_temporada")
		        String consulta = "DELETE FROM temporadas WHERE nombre_temporada = '" + tempBorrar + "'";

		        try {
		            int filasAfectadas = conexion.ejecutarInsertDeleteUpdate(consulta);
		            if (filasAfectadas > 0) {
		                JOptionPane.showMessageDialog(null, "Temporada eliminada correctamente.");
		            } else {
		                JOptionPane.showMessageDialog(null, "No se encontró ninguna temporada con ese nombre.");
		            }
		        } catch (SQLException ex) {
		            ex.printStackTrace();
		            JOptionPane.showMessageDialog(null, "Error al eliminar la temporada: " + ex.getMessage());
		        }
		    }
		});
	}
}
