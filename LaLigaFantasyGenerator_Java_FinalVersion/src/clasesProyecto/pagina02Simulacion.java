package clasesProyecto;

import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pagina02Simulacion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel pagina02Simulacion;
	private ConexionMySQL conexion;

	// Constructor con conexión para evitar null
	public pagina02Simulacion(ConexionMySQL conexion) {
		if (conexion == null) {
			throw new IllegalArgumentException("La conexión no puede ser null");
		}
		this.setConexion(conexion);
		setTitle("LaLiga Fantasy Simulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		pagina02Simulacion = new JPanel();
		pagina02Simulacion.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(pagina02Simulacion);
		pagina02Simulacion.setLayout(null);

		JButton btnClasificacion = new JButton("CLASIFICACIÓN");
		btnClasificacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pagina02Simulacion_Clasificacion ventanaClasificacion = new pagina02Simulacion_Clasificacion(conexion);
				ventanaClasificacion.setVisible(true);
				dispose();
			}
		});
		btnClasificacion.setBounds(122, 221, 180, 30);
		pagina02Simulacion.add(btnClasificacion);

		JButton btnResultados = new JButton("RESULTADOS");
		btnResultados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pagina02Simulacion_Jornada ventanaJornada = new pagina02Simulacion_Jornada(conexion);
				ventanaJornada.setVisible(true);
				dispose();
			}
		});
		btnResultados.setBounds(122, 180, 180, 30);
		pagina02Simulacion.add(btnResultados);

		JLabel lblFoto_02Simulacion = new JLabel("");
		lblFoto_02Simulacion.setIcon(new ImageIcon(pagina02Simulacion.class.getResource("/images/LaLiga_EA_Sports_2023_Vertical_Logo.png")));
		lblFoto_02Simulacion.setBounds(96, 11, 232, 158);
		pagina02Simulacion.add(lblFoto_02Simulacion);

		ImageIcon iconoLaLiga = new ImageIcon(pagina02Simulacion.class.getResource("/images/LaLiga_EA_Sports_2023_Vertical_Logo.png"));
		Image imagen2 = iconoLaLiga.getImage().getScaledInstance(lblFoto_02Simulacion.getWidth(), lblFoto_02Simulacion.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon iconoAjustado2 = new ImageIcon(imagen2);
		lblFoto_02Simulacion.setIcon(iconoAjustado2);

		JButton btnVolver_02Simulacion = new JButton("Volver");
		btnVolver_02Simulacion.setBounds(10, 11, 83, 23);
		btnVolver_02Simulacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pagina01Principal ventanaPrincipal = new pagina01Principal(conexion);
				ventanaPrincipal.setVisible(true);
				dispose();
			}
		});
		pagina02Simulacion.add(btnVolver_02Simulacion);
	}

	// --- Metodo MAIN para pruebas individuales ---
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				ConexionMySQL conexion = new ConexionMySQL("root", "1234", "laliga");
				conexion.conectar();
				new pagina02Simulacion(conexion).setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public ConexionMySQL getConexion() {
		return conexion;
	}

	public void setConexion(ConexionMySQL conexion) {
		this.conexion = conexion;
	}
}
