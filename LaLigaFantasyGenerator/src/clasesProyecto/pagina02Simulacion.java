package clasesProyecto;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class pagina02Simulacion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel pagina02Simulacion;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pagina02Simulacion frame = new pagina02Simulacion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public pagina02Simulacion() {
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
				pagina02Simulacion_Clasificacion ventanaClasificacion = new pagina02Simulacion_Clasificacion();
				ventanaClasificacion.setVisible(true);
				dispose();
			}
		});
		btnClasificacion.setBounds(217, 180, 111, 30);
		pagina02Simulacion.add(btnClasificacion);
		
		JButton btnResultados = new JButton("RESULTADOS");
		btnResultados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pagina02Simulacion_Jornada ventanaJornada = new pagina02Simulacion_Jornada();
				ventanaJornada.setVisible(true);
				dispose();
			}
		});
		btnResultados.setBounds(96, 180, 111, 30);
		pagina02Simulacion.add(btnResultados);
		
		JLabel lblFoto_02Simulacion = new JLabel("");
		lblFoto_02Simulacion.setIcon(new ImageIcon(pagina01Principal.class.getResource("/images/LaLiga_EA_Sports_2023_Vertical_Logo.png")));
		lblFoto_02Simulacion.setBounds(96, 11, 232, 158);
		pagina02Simulacion.add(lblFoto_02Simulacion);
		
		ImageIcon icono2 = new ImageIcon(pagina01Principal.class.getResource("/images/LaLiga_EA_Sports_2023_Vertical_Logo.png"));
		Image imagen2 = icono2.getImage().getScaledInstance(lblFoto_02Simulacion.getWidth(), lblFoto_02Simulacion.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon iconoAjustado2 = new ImageIcon(imagen2); 
		lblFoto_02Simulacion.setIcon(iconoAjustado2);
		
		JTextPane txtpnTemporada = new JTextPane();
		txtpnTemporada.setText("Temporada: ");
		txtpnTemporada.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnTemporada.setBackground(SystemColor.menu);
		txtpnTemporada.setBounds(130, 221, 93, 25);
		pagina02Simulacion.add(txtpnTemporada);
		
		JButton btnVolver_02Simulacion = new JButton("Volver");
		btnVolver_02Simulacion.setBounds(10, 227, 62, 23);
		btnVolver_02Simulacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pagina01Principal ventanaPrincipal = new pagina01Principal();
				ventanaPrincipal.setVisible(true);
				dispose();
			}
		});
		pagina02Simulacion.add(btnVolver_02Simulacion);	
	}
}
