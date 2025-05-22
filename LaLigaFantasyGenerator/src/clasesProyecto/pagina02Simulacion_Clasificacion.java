package clasesProyecto;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class pagina02Simulacion_Clasificacion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel pagina02Simulacion_clasificacion;
	private ConexionMySQL conexion;

	public pagina02Simulacion_Clasificacion(ConexionMySQL conexion) {
		if (conexion == null) {
			throw new IllegalArgumentException("La conexión no puede ser null");
		}
		this.setConexion(conexion);
		setTitle("LaLiga Fantasy Simulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 588);
		pagina02Simulacion_clasificacion = new JPanel();
		pagina02Simulacion_clasificacion.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(pagina02Simulacion_clasificacion);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.setBounds(34, 29, 63, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pagina02Simulacion ventanaSimulacion = new pagina02Simulacion(conexion);
				ventanaSimulacion.setVisible(true);
				dispose();
			}
		});
		pagina02Simulacion_clasificacion.setLayout(null);
		pagina02Simulacion_clasificacion.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel(" 1. FC BARCELONA         | Pts: 105 | PJ: 38 | G: 34 | E:  3 | P:  1 | GF: 145 | GC:  9 | DG: +136");
		lblNewLabel.setBounds(34, 80, 461, 23);
		pagina02Simulacion_clasificacion.add(lblNewLabel);
		
		JLabel lblNewLabel_5 = new JLabel(" 1. FC BARCELONA         | Pts: 105 | PJ: 38 | G: 34 | E:  3 | P:  1 | GF: 145 | GC:  9 | DG: +136");
		lblNewLabel_5.setBounds(34, 57, 461, 23);
		pagina02Simulacion_clasificacion.add(lblNewLabel_5);
		
	}

	// --- Metodo MAIN para pruebas individuales ---
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

	public ConexionMySQL getConexion() {
		return conexion;
	}

	public void setConexion(ConexionMySQL conexion) {
		this.conexion = conexion;
	}
}
