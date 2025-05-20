package clasesProyecto;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class pagina01Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pagina01Principal frame01Principal = new pagina01Principal();
					frame01Principal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public pagina01Principal() {
		setTitle("LaLiga Fantasy Simulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 345);
		contentPane = new JPanel();
		contentPane.setToolTipText("LaLiga Fantasy Simulator");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_Simular = new JButton("SIMULAR TEMPORADA");
		btnNewButton_Simular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pagina02Simulacion ventanaSimulacion = new pagina02Simulacion();
				ventanaSimulacion.setVisible(true);
				dispose();
			}
		});
		btnNewButton_Simular.setBounds(146, 159, 141, 23);
		contentPane.add(btnNewButton_Simular);
		
		JLabel lblNewLabel_Foto_01Principal = new JLabel("");
		lblNewLabel_Foto_01Principal.setIcon(new ImageIcon(pagina01Principal.class.getResource("/images/LaLiga_EA_Sports_2023_Vertical_Logo.png")));
		lblNewLabel_Foto_01Principal.setBounds(136, 29, 163, 119);
		contentPane.add(lblNewLabel_Foto_01Principal);
		
		ImageIcon icono2 = new ImageIcon(pagina01Principal.class.getResource("/images/LaLiga_EA_Sports_2023_Vertical_Logo.png"));
		Image imagen2 = icono2.getImage().getScaledInstance(lblNewLabel_Foto_01Principal.getWidth(), lblNewLabel_Foto_01Principal.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon iconoAjustado2 = new ImageIcon(imagen2); 
		lblNewLabel_Foto_01Principal.setIcon(iconoAjustado2);
		
		JButton btnNewButton_Consultar = new JButton("CONSULTAR TEMPORADAS");
		btnNewButton_Consultar.setBounds(136, 193, 163, 23);
		contentPane.add(btnNewButton_Consultar);
		btnNewButton_Consultar.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				pagina03Consulta_Temporada ventanaConsulta = new pagina03Consulta_Temporada();
				ventanaConsulta.setVisible(true);
				dispose();
			}
		});
		
		JButton btnNewButton_Salir = new JButton("SALIR");
		btnNewButton_Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_Salir.setBounds(185, 261, 63, 23);
		contentPane.add(btnNewButton_Salir);
		
		JButton btnNewButton = new JButton("ELIMINAR DATOS");
		btnNewButton.setBounds(158, 227, 117, 23);
		contentPane.add(btnNewButton);
	}
}
