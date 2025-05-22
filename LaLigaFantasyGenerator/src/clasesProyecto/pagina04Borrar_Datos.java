package clasesProyecto;

import java.awt.EventQueue;
import java.awt.Image;
import java.sql.SQLException;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class pagina04Borrar_Datos extends JFrame {

	private JPanel contentPane;
	private JTextField textField_TemporadaAConsultar;
	private ConexionMySQL conexion;

	public pagina04Borrar_Datos(ConexionMySQL conexion) {
		this.conexion = conexion;

		setTitle("LaLiga Fantasy Simulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JLabel lblFoto = new JLabel();
		lblFoto.setBounds(33, 0, 363, 113);
		ImageIcon icono = new ImageIcon(getClass().getResource("/images/RGB_Logotipo_LALIGA_color_positivevg.png"));
		Image imagen = icono.getImage().getScaledInstance(lblFoto.getWidth(), lblFoto.getHeight(), Image.SCALE_SMOOTH);
		lblFoto.setIcon(new ImageIcon(imagen));
		contentPane.add(lblFoto);

		JLabel lblLabel = new JLabel("¿Qué temporada quieres borrar?");
		lblLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblLabel.setBounds(113, 103, 200, 23);
		contentPane.add(lblLabel);

		textField_TemporadaAConsultar = new JTextField();
		textField_TemporadaAConsultar.setBounds(157, 137, 98, 20);
		contentPane.add(textField_TemporadaAConsultar);
		textField_TemporadaAConsultar.setColumns(10);

		JButton btnBorrar = new JButton("BORRAR");
		btnBorrar.setBounds(157, 168, 98, 23);
		contentPane.add(btnBorrar);

		JButton btnBorrarTodas = new JButton("BORRAR TODAS LAS TEMPORADAS");
		btnBorrarTodas.setBounds(101, 202, 212, 23);
		contentPane.add(btnBorrarTodas);

		JButton btnVolver = new JButton("Volver");
		btnVolver.setBounds(10, 227, 68, 23);
		contentPane.add(btnVolver);

		// --- Acción del botón BORRAR ---
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (!conexion.estaConectado()) {
						conexion.conectar();
					}

					String temporada = textField_TemporadaAConsultar.getText().trim();
					if (temporada.isEmpty()) {
						JOptionPane.showMessageDialog(null, "Debes introducir una temporada.");
						return;
					}

					String sql = "DELETE FROM partidos WHERE temporada = '" + temporada + "'";
					int filas = conexion.ejecutarInsertDeleteUpdate(sql);

					if (filas > 0) {
						JOptionPane.showMessageDialog(null, "Partidos de la temporada " + temporada + " eliminados correctamente.");
					} else {
						JOptionPane.showMessageDialog(null, "No se encontraron partidos para esa temporada.");
					}

				} catch (SQLException ex) {
					ex.printStackTrace();
					JOptionPane.showMessageDialog(null, "Error de base de datos: " + ex.getMessage());
				}
			}
		});

		// --- Acción del botón BORRAR TODAS ---
		btnBorrarTodas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (!conexion.estaConectado()) {
						conexion.conectar();
					}

					int confirmacion = JOptionPane.showConfirmDialog(null, "¿Seguro que quieres eliminar todos los partidos?", "Confirmar", JOptionPane.YES_NO_OPTION);
					if (confirmacion == JOptionPane.YES_OPTION) {
						int filas = conexion.ejecutarInsertDeleteUpdate("DELETE FROM partidos");
						conexion.ejecutarInsertDeleteUpdate("ALTER TABLE partidos AUTO_INCREMENT = 1");

						if (filas > 0) {
							JOptionPane.showMessageDialog(null, "Todos los partidos eliminados correctamente.");
						} else {
							JOptionPane.showMessageDialog(null, "No había partidos para eliminar.");
						}
					}

				} catch (SQLException ex) {
					ex.printStackTrace();
					JOptionPane.showMessageDialog(null, "Error de base de datos: " + ex.getMessage());
				}
			}
		});

		// --- Acción del botón VOLVER ---
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pagina01Principal principal = new pagina01Principal(conexion);
				principal.setVisible(true);
				dispose();
			}
		});
	}

	// --- Metodo MAIN para pruebas individuales ---
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				ConexionMySQL conexion = new ConexionMySQL("root", "1234", "laliga");
				conexion.conectar();
				new pagina04Borrar_Datos(conexion).setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}
}
