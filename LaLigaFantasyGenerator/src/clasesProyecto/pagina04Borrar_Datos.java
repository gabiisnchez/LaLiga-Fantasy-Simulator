package clasesProyecto;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class pagina04Borrar_Datos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel pagina03Consulta_Temporada;
	private JTextField textField_TemporadaAConsultar;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pagina04Borrar_Datos frame = new pagina04Borrar_Datos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public pagina04Borrar_Datos() {
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
		
		JTextPane txtTemporada = new JTextPane();
		txtTemporada.setBackground(SystemColor.menu);
		txtTemporada.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtTemporada.setText("¿Qué temporada quieres borrar?");
		txtTemporada.setBounds(87, 101, 238, 25);
		pagina03Consulta_Temporada.add(txtTemporada);
		
		JButton btnConsultar = new JButton("BORRAR");
		btnConsultar.setBounds(157, 168, 98, 23);
		pagina03Consulta_Temporada.add(btnConsultar);
		
		JButton btnVolver_03ConsultaTemporada = new JButton("Volver");
		btnVolver_03ConsultaTemporada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pagina01Principal ventanaPrincipal = new pagina01Principal();
				ventanaPrincipal.setVisible(true);
				dispose();
			}
		});
		btnVolver_03ConsultaTemporada.setBounds(10, 227, 68, 23);
		pagina03Consulta_Temporada.add(btnVolver_03ConsultaTemporada);
		
		JButton btnBorrarTodasLas = new JButton("BORRAR TODAS LAS TEMPORADAS");
		btnBorrarTodasLas.setBounds(101, 202, 212, 23);
		pagina03Consulta_Temporada.add(btnBorrarTodasLas);
	}
}
