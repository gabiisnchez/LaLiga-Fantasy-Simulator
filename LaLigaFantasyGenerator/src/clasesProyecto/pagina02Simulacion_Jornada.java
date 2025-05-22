package clasesProyecto;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Image;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.JButton;

public class pagina02Simulacion_Jornada extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel pagina02Simulacion_Jornada;
	private ConexionMySQL conexion;

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



		setContentPane(pagina02Simulacion_Jornada);
		
		
		ImageIcon icono2 = new ImageIcon(pagina02Simulacion_Jornada.class.getResource("/images/LaLiga_EA_Sports_2023_Vertical_Logo.png"));
		JLabel lblFoto_02Jornada = new JLabel("");
		lblFoto_02Jornada.setBounds(363, 63, 205, 151);
		
		Image imagen2 = icono2.getImage().getScaledInstance(205, 151, Image.SCALE_SMOOTH);
		
		JButton btnVolver_02SimulacionJornada = new JButton("Volver");
		btnVolver_02SimulacionJornada.setBounds(64, 35, 63, 23);
		btnVolver_02SimulacionJornada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pagina02Simulacion ventanaSimulacion = new pagina02Simulacion(conexion);
				ventanaSimulacion.setVisible(true);
				dispose();
			}
		});
		pagina02Simulacion_Jornada.setLayout(null);
		pagina02Simulacion_Jornada.add(btnVolver_02SimulacionJornada);
		lblFoto_02Jornada.setIcon(new ImageIcon(imagen2));
		pagina02Simulacion_Jornada.add(lblFoto_02Jornada);
	}

	// --- Metodo MAIN para pruebas individuales ---
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

	public ConexionMySQL getConexion() {
		return conexion;
	}

	public void setConexion(ConexionMySQL conexion) {
		this.conexion = conexion;
	}
}
