package clasesProyecto;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.Image;

import java.awt.GridBagConstraints;
import java.awt.Insets;
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
		this.conexion = conexion;
		setTitle("LaLiga Fantasy Simulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		pagina02Simulacion_Jornada = new JPanel();
		pagina02Simulacion_Jornada.setBackground(UIManager.getColor("Menu.background"));
		pagina02Simulacion_Jornada.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(pagina02Simulacion_Jornada);
		GridBagLayout gbl_pagina02Simulacion_Jornada = new GridBagLayout();
		gbl_pagina02Simulacion_Jornada.columnWidths = new int[]{59, 59, 50, 50, 80, 30, 80, 50, 50, 63, 59, 0};
		gbl_pagina02Simulacion_Jornada.rowHeights = new int[]{0, 0, 0, 0, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 40, 0};
		gbl_pagina02Simulacion_Jornada.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pagina02Simulacion_Jornada.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		pagina02Simulacion_Jornada.setLayout(gbl_pagina02Simulacion_Jornada);
		
		
		ImageIcon icono2 = new ImageIcon(pagina02Simulacion_Jornada.class.getResource("/images/LaLiga_EA_Sports_2023_Vertical_Logo.png"));
		JLabel lblFoto_02Jornada = new JLabel("");
		
		Image imagen2 = icono2.getImage().getScaledInstance(205, 151, Image.SCALE_SMOOTH);
		
		JButton btnVolver_02SimulacionJornada = new JButton("Volver");
		btnVolver_02SimulacionJornada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pagina02Simulacion ventanaSimulacion = new pagina02Simulacion(conexion);
				ventanaSimulacion.setVisible(true);
				dispose();
			}
		});
		GridBagConstraints gbc_btnVolver_02SimulacionJornada = new GridBagConstraints();
		gbc_btnVolver_02SimulacionJornada.insets = new Insets(0, 0, 5, 5);
		gbc_btnVolver_02SimulacionJornada.gridx = 1;
		gbc_btnVolver_02SimulacionJornada.gridy = 1;
		pagina02Simulacion_Jornada.add(btnVolver_02SimulacionJornada, gbc_btnVolver_02SimulacionJornada);
		lblFoto_02Jornada.setIcon(new ImageIcon(imagen2));
		GridBagConstraints gbc_lblFoto_02Jornada = new GridBagConstraints();
		gbc_lblFoto_02Jornada.insets = new Insets(0, 0, 5, 5);
		gbc_lblFoto_02Jornada.gridx = 5;
		gbc_lblFoto_02Jornada.gridy = 2;
		pagina02Simulacion_Jornada.add(lblFoto_02Jornada, gbc_lblFoto_02Jornada);
		
		JLabel lblJornada_Seleccion = new JLabel("Jornada: ");
		GridBagConstraints gbc_lblJornada_Seleccion = new GridBagConstraints();
		gbc_lblJornada_Seleccion.insets = new Insets(0, 0, 5, 5);
		gbc_lblJornada_Seleccion.gridx = 4;
		gbc_lblJornada_Seleccion.gridy = 3;
		pagina02Simulacion_Jornada.add(lblJornada_Seleccion, gbc_lblJornada_Seleccion);
		
		JLabel lbl_Temporada = new JLabel("Temporada: ");
		GridBagConstraints gbc_lbl_Temporada = new GridBagConstraints();
		gbc_lbl_Temporada.insets = new Insets(0, 0, 5, 5);
		gbc_lbl_Temporada.gridx = 6;
		gbc_lbl_Temporada.gridy = 4;
		pagina02Simulacion_Jornada.add(lbl_Temporada, gbc_lbl_Temporada);
		
		JLabel lblEscudo_Local01 = new JLabel("Escudo 1");
		GridBagConstraints gbc_lblEscudo_Local01 = new GridBagConstraints();
		gbc_lblEscudo_Local01.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscudo_Local01.gridx = 2;
		gbc_lblEscudo_Local01.gridy = 5;
		pagina02Simulacion_Jornada.add(lblEscudo_Local01, gbc_lblEscudo_Local01);
		
		JLabel lblEquipo_Local01 = new JLabel("LOCAL");
		GridBagConstraints gbc_lblEquipo_Local01 = new GridBagConstraints();
		gbc_lblEquipo_Local01.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo_Local01.gridx = 3;
		gbc_lblEquipo_Local01.gridy = 5;
		pagina02Simulacion_Jornada.add(lblEquipo_Local01, gbc_lblEquipo_Local01);
		
		JLabel lblGoles_Local01 = new JLabel("Goles");
		GridBagConstraints gbc_lblGoles_Local01 = new GridBagConstraints();
		gbc_lblGoles_Local01.insets = new Insets(0, 0, 5, 5);
		gbc_lblGoles_Local01.gridx = 4;
		gbc_lblGoles_Local01.gridy = 5;
		pagina02Simulacion_Jornada.add(lblGoles_Local01, gbc_lblGoles_Local01);
		
		
		JLabel lblLabel_01 = new JLabel("-");
		GridBagConstraints gbc_lblLabel_01 = new GridBagConstraints();
		gbc_lblLabel_01.insets = new Insets(0, 0, 5, 5);
		gbc_lblLabel_01.gridx = 5;
		gbc_lblLabel_01.gridy = 5;
		pagina02Simulacion_Jornada.add(lblLabel_01, gbc_lblLabel_01);
		
		JLabel lblGoles_Visitante01 = new JLabel("Goles");
		GridBagConstraints gbc_lblGoles_Visitante01 = new GridBagConstraints();
		gbc_lblGoles_Visitante01.insets = new Insets(0, 0, 5, 5);
		gbc_lblGoles_Visitante01.gridx = 6;
		gbc_lblGoles_Visitante01.gridy = 5;
		pagina02Simulacion_Jornada.add(lblGoles_Visitante01, gbc_lblGoles_Visitante01);
		
		JLabel lblEquipo_Visitante01 = new JLabel("VISIT");
		GridBagConstraints gbc_lblEquipo_Visitante01 = new GridBagConstraints();
		gbc_lblEquipo_Visitante01.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo_Visitante01.gridx = 7;
		gbc_lblEquipo_Visitante01.gridy = 5;
		pagina02Simulacion_Jornada.add(lblEquipo_Visitante01, gbc_lblEquipo_Visitante01);
		
		JLabel lblEscudo_Visitante01 = new JLabel("Escudo 2");
		GridBagConstraints gbc_lblEscudo_Visitante01 = new GridBagConstraints();
		gbc_lblEscudo_Visitante01.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscudo_Visitante01.gridx = 8;
		gbc_lblEscudo_Visitante01.gridy = 5;
		pagina02Simulacion_Jornada.add(lblEscudo_Visitante01, gbc_lblEscudo_Visitante01);
		
		JLabel lblEscudo_Local02 = new JLabel("Escudo 3");
		GridBagConstraints gbc_lblEscudo_Local02 = new GridBagConstraints();
		gbc_lblEscudo_Local02.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscudo_Local02.gridx = 2;
		gbc_lblEscudo_Local02.gridy = 6;
		pagina02Simulacion_Jornada.add(lblEscudo_Local02, gbc_lblEscudo_Local02);
		
		JLabel lblEquipo_Local02 = new JLabel("LOCAL");
		GridBagConstraints gbc_lblEquipo_Local02 = new GridBagConstraints();
		gbc_lblEquipo_Local02.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo_Local02.gridx = 3;
		gbc_lblEquipo_Local02.gridy = 6;
		pagina02Simulacion_Jornada.add(lblEquipo_Local02, gbc_lblEquipo_Local02);
		
		JLabel lblGoles_Local02 = new JLabel("Goles");
		GridBagConstraints gbc_lblGoles_Local02 = new GridBagConstraints();
		gbc_lblGoles_Local02.insets = new Insets(0, 0, 5, 5);
		gbc_lblGoles_Local02.gridx = 4;
		gbc_lblGoles_Local02.gridy = 6;
		pagina02Simulacion_Jornada.add(lblGoles_Local02, gbc_lblGoles_Local02);
		
		JLabel lblLabel_02 = new JLabel("-");
		GridBagConstraints gbc_lblLabel_02 = new GridBagConstraints();
		gbc_lblLabel_02.insets = new Insets(0, 0, 5, 5);
		gbc_lblLabel_02.gridx = 5;
		gbc_lblLabel_02.gridy = 6;
		pagina02Simulacion_Jornada.add(lblLabel_02, gbc_lblLabel_02);
		
		JLabel lblGoles_Visitante02 = new JLabel("Goles");
		GridBagConstraints gbc_lblGoles_Visitante02 = new GridBagConstraints();
		gbc_lblGoles_Visitante02.insets = new Insets(0, 0, 5, 5);
		gbc_lblGoles_Visitante02.gridx = 6;
		gbc_lblGoles_Visitante02.gridy = 6;
		pagina02Simulacion_Jornada.add(lblGoles_Visitante02, gbc_lblGoles_Visitante02);
		
		JLabel lblEquipo_Visitante02 = new JLabel("VISIT");
		GridBagConstraints gbc_lblEquipo_Visitante02 = new GridBagConstraints();
		gbc_lblEquipo_Visitante02.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo_Visitante02.gridx = 7;
		gbc_lblEquipo_Visitante02.gridy = 6;
		pagina02Simulacion_Jornada.add(lblEquipo_Visitante02, gbc_lblEquipo_Visitante02);
		
		JLabel lblEscudo_Visitante02 = new JLabel("Escudo 4");
		GridBagConstraints gbc_lblEscudo_Visitante02 = new GridBagConstraints();
		gbc_lblEscudo_Visitante02.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscudo_Visitante02.gridx = 8;
		gbc_lblEscudo_Visitante02.gridy = 6;
		pagina02Simulacion_Jornada.add(lblEscudo_Visitante02, gbc_lblEscudo_Visitante02);
		
		JLabel lblEscudo_Local03 = new JLabel("Escudo 5");
		GridBagConstraints gbc_lblEscudo_Local03 = new GridBagConstraints();
		gbc_lblEscudo_Local03.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscudo_Local03.gridx = 2;
		gbc_lblEscudo_Local03.gridy = 7;
		pagina02Simulacion_Jornada.add(lblEscudo_Local03, gbc_lblEscudo_Local03);
		
		JLabel lblEquipo_Local03 = new JLabel("LOCAL");
		GridBagConstraints gbc_lblEquipo_Local03 = new GridBagConstraints();
		gbc_lblEquipo_Local03.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo_Local03.gridx = 3;
		gbc_lblEquipo_Local03.gridy = 7;
		pagina02Simulacion_Jornada.add(lblEquipo_Local03, gbc_lblEquipo_Local03);
		
		JLabel lblGoles_Local03 = new JLabel("Goles");
		GridBagConstraints gbc_lblGoles_Local03 = new GridBagConstraints();
		gbc_lblGoles_Local03.insets = new Insets(0, 0, 5, 5);
		gbc_lblGoles_Local03.gridx = 4;
		gbc_lblGoles_Local03.gridy = 7;
		pagina02Simulacion_Jornada.add(lblGoles_Local03, gbc_lblGoles_Local03);
		
		JLabel lblNewLabel_11_1_1_2 = new JLabel("-");
		GridBagConstraints gbc_lblNewLabel_11_1_1_2 = new GridBagConstraints();
		gbc_lblNewLabel_11_1_1_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_11_1_1_2.gridx = 5;
		gbc_lblNewLabel_11_1_1_2.gridy = 7;
		pagina02Simulacion_Jornada.add(lblNewLabel_11_1_1_2, gbc_lblNewLabel_11_1_1_2);
		
		JLabel lblGoles_Visitante03 = new JLabel("Goles");
		GridBagConstraints gbc_lblGoles_Visitante03 = new GridBagConstraints();
		gbc_lblGoles_Visitante03.insets = new Insets(0, 0, 5, 5);
		gbc_lblGoles_Visitante03.gridx = 6;
		gbc_lblGoles_Visitante03.gridy = 7;
		pagina02Simulacion_Jornada.add(lblGoles_Visitante03, gbc_lblGoles_Visitante03);
		
		JLabel lblEquipo_Visitante03 = new JLabel("VISIT");
		GridBagConstraints gbc_lblEquipo_Visitante03 = new GridBagConstraints();
		gbc_lblEquipo_Visitante03.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo_Visitante03.gridx = 7;
		gbc_lblEquipo_Visitante03.gridy = 7;
		pagina02Simulacion_Jornada.add(lblEquipo_Visitante03, gbc_lblEquipo_Visitante03);
		
		JLabel lblEscudo_Visitante03 = new JLabel("Escudo 6");
		GridBagConstraints gbc_lblEscudo_Visitante03 = new GridBagConstraints();
		gbc_lblEscudo_Visitante03.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscudo_Visitante03.gridx = 8;
		gbc_lblEscudo_Visitante03.gridy = 7;
		pagina02Simulacion_Jornada.add(lblEscudo_Visitante03, gbc_lblEscudo_Visitante03);
		
		JLabel lblEscudo_Local04 = new JLabel("Escudo 7");
		GridBagConstraints gbc_lblEscudo_Local04 = new GridBagConstraints();
		gbc_lblEscudo_Local04.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscudo_Local04.gridx = 2;
		gbc_lblEscudo_Local04.gridy = 8;
		pagina02Simulacion_Jornada.add(lblEscudo_Local04, gbc_lblEscudo_Local04);
		
		JLabel lblEquipo_Local04 = new JLabel("LOCAL");
		GridBagConstraints gbc_lblEquipo_Local04 = new GridBagConstraints();
		gbc_lblEquipo_Local04.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo_Local04.gridx = 3;
		gbc_lblEquipo_Local04.gridy = 8;
		pagina02Simulacion_Jornada.add(lblEquipo_Local04, gbc_lblEquipo_Local04);
		
		JLabel lblGoles_Local04 = new JLabel("Goles");
		GridBagConstraints gbc_lblGoles_Local04 = new GridBagConstraints();
		gbc_lblGoles_Local04.insets = new Insets(0, 0, 5, 5);
		gbc_lblGoles_Local04.gridx = 4;
		gbc_lblGoles_Local04.gridy = 8;
		pagina02Simulacion_Jornada.add(lblGoles_Local04, gbc_lblGoles_Local04);
		
		JLabel lblLabel_04 = new JLabel("-");
		GridBagConstraints gbc_lblLabel_04 = new GridBagConstraints();
		gbc_lblLabel_04.insets = new Insets(0, 0, 5, 5);
		gbc_lblLabel_04.gridx = 5;
		gbc_lblLabel_04.gridy = 8;
		pagina02Simulacion_Jornada.add(lblLabel_04, gbc_lblLabel_04);
		
		JLabel lblGoles_Visitante04 = new JLabel("Goles");
		GridBagConstraints gbc_lblGoles_Visitante04 = new GridBagConstraints();
		gbc_lblGoles_Visitante04.insets = new Insets(0, 0, 5, 5);
		gbc_lblGoles_Visitante04.gridx = 6;
		gbc_lblGoles_Visitante04.gridy = 8;
		pagina02Simulacion_Jornada.add(lblGoles_Visitante04, gbc_lblGoles_Visitante04);
		
		JLabel lblEquipo_Visitante04 = new JLabel("VISIT");
		GridBagConstraints gbc_lblEquipo_Visitante04 = new GridBagConstraints();
		gbc_lblEquipo_Visitante04.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo_Visitante04.gridx = 7;
		gbc_lblEquipo_Visitante04.gridy = 8;
		pagina02Simulacion_Jornada.add(lblEquipo_Visitante04, gbc_lblEquipo_Visitante04);
		
		JLabel lblEscudo_Visitante04 = new JLabel("Escudo 8");
		GridBagConstraints gbc_lblEscudo_Visitante04 = new GridBagConstraints();
		gbc_lblEscudo_Visitante04.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscudo_Visitante04.gridx = 8;
		gbc_lblEscudo_Visitante04.gridy = 8;
		pagina02Simulacion_Jornada.add(lblEscudo_Visitante04, gbc_lblEscudo_Visitante04);
		
		JLabel lblEscudo_Local05 = new JLabel("Escudo 9");
		GridBagConstraints gbc_lblEscudo_Local05 = new GridBagConstraints();
		gbc_lblEscudo_Local05.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscudo_Local05.gridx = 2;
		gbc_lblEscudo_Local05.gridy = 9;
		pagina02Simulacion_Jornada.add(lblEscudo_Local05, gbc_lblEscudo_Local05);
		
		JLabel lblEquipo_Local05 = new JLabel("LOCAL");
		GridBagConstraints gbc_lblEquipo_Local05 = new GridBagConstraints();
		gbc_lblEquipo_Local05.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo_Local05.gridx = 3;
		gbc_lblEquipo_Local05.gridy = 9;
		pagina02Simulacion_Jornada.add(lblEquipo_Local05, gbc_lblEquipo_Local05);
		
		JLabel lblGoles_Local05 = new JLabel("Goles");
		GridBagConstraints gbc_lblGoles_Local05 = new GridBagConstraints();
		gbc_lblGoles_Local05.insets = new Insets(0, 0, 5, 5);
		gbc_lblGoles_Local05.gridx = 4;
		gbc_lblGoles_Local05.gridy = 9;
		pagina02Simulacion_Jornada.add(lblGoles_Local05, gbc_lblGoles_Local05);
		
		JLabel lblLabel_05 = new JLabel("-");
		GridBagConstraints gbc_lblLabel_05 = new GridBagConstraints();
		gbc_lblLabel_05.insets = new Insets(0, 0, 5, 5);
		gbc_lblLabel_05.gridx = 5;
		gbc_lblLabel_05.gridy = 9;
		pagina02Simulacion_Jornada.add(lblLabel_05, gbc_lblLabel_05);
		
		JLabel lblGoles_Visitante05 = new JLabel("Goles");
		GridBagConstraints gbc_lblGoles_Visitante05 = new GridBagConstraints();
		gbc_lblGoles_Visitante05.insets = new Insets(0, 0, 5, 5);
		gbc_lblGoles_Visitante05.gridx = 6;
		gbc_lblGoles_Visitante05.gridy = 9;
		pagina02Simulacion_Jornada.add(lblGoles_Visitante05, gbc_lblGoles_Visitante05);
		
		JLabel lblEquipo_Visitante05 = new JLabel("VISIT");
		GridBagConstraints gbc_lblEquipo_Visitante05 = new GridBagConstraints();
		gbc_lblEquipo_Visitante05.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo_Visitante05.gridx = 7;
		gbc_lblEquipo_Visitante05.gridy = 9;
		pagina02Simulacion_Jornada.add(lblEquipo_Visitante05, gbc_lblEquipo_Visitante05);
		
		JLabel lblEscudo_Visitante05 = new JLabel("Escudo 10");
		GridBagConstraints gbc_lblEscudo_Visitante05 = new GridBagConstraints();
		gbc_lblEscudo_Visitante05.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscudo_Visitante05.gridx = 8;
		gbc_lblEscudo_Visitante05.gridy = 9;
		pagina02Simulacion_Jornada.add(lblEscudo_Visitante05, gbc_lblEscudo_Visitante05);
		
		JLabel lblEscudo_Local06 = new JLabel("Escudo 11");
		GridBagConstraints gbc_lblEscudo_Local06 = new GridBagConstraints();
		gbc_lblEscudo_Local06.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscudo_Local06.gridx = 2;
		gbc_lblEscudo_Local06.gridy = 10;
		pagina02Simulacion_Jornada.add(lblEscudo_Local06, gbc_lblEscudo_Local06);
		
		JLabel lblEquipo_Local06 = new JLabel("LOCAL");
		GridBagConstraints gbc_lblEquipo_Local06 = new GridBagConstraints();
		gbc_lblEquipo_Local06.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo_Local06.gridx = 3;
		gbc_lblEquipo_Local06.gridy = 10;
		pagina02Simulacion_Jornada.add(lblEquipo_Local06, gbc_lblEquipo_Local06);
		
		JLabel lblGoles_Local06 = new JLabel("Goles");
		GridBagConstraints gbc_lblGoles_Local06 = new GridBagConstraints();
		gbc_lblGoles_Local06.insets = new Insets(0, 0, 5, 5);
		gbc_lblGoles_Local06.gridx = 4;
		gbc_lblGoles_Local06.gridy = 10;
		pagina02Simulacion_Jornada.add(lblGoles_Local06, gbc_lblGoles_Local06);
		
		JLabel lblLabel_06 = new JLabel("-");
		GridBagConstraints gbc_lblLabel_06 = new GridBagConstraints();
		gbc_lblLabel_06.insets = new Insets(0, 0, 5, 5);
		gbc_lblLabel_06.gridx = 5;
		gbc_lblLabel_06.gridy = 10;
		pagina02Simulacion_Jornada.add(lblLabel_06, gbc_lblLabel_06);
		
		JLabel lblGoles_Visitante06 = new JLabel("Goles");
		GridBagConstraints gbc_lblGoles_Visitante06 = new GridBagConstraints();
		gbc_lblGoles_Visitante06.insets = new Insets(0, 0, 5, 5);
		gbc_lblGoles_Visitante06.gridx = 6;
		gbc_lblGoles_Visitante06.gridy = 10;
		pagina02Simulacion_Jornada.add(lblGoles_Visitante06, gbc_lblGoles_Visitante06);
		
		JLabel lblEquipo_Visitante06 = new JLabel("VISIT");
		GridBagConstraints gbc_lblEquipo_Visitante06 = new GridBagConstraints();
		gbc_lblEquipo_Visitante06.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo_Visitante06.gridx = 7;
		gbc_lblEquipo_Visitante06.gridy = 10;
		pagina02Simulacion_Jornada.add(lblEquipo_Visitante06, gbc_lblEquipo_Visitante06);
		
		JLabel lblEscudo_Visitante06 = new JLabel("Escudo 12");
		GridBagConstraints gbc_lblEscudo_Visitante06 = new GridBagConstraints();
		gbc_lblEscudo_Visitante06.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscudo_Visitante06.gridx = 8;
		gbc_lblEscudo_Visitante06.gridy = 10;
		pagina02Simulacion_Jornada.add(lblEscudo_Visitante06, gbc_lblEscudo_Visitante06);
		
		JLabel lblEscudo_Local07 = new JLabel("Escudo 13");
		GridBagConstraints gbc_lblEscudo_Local07 = new GridBagConstraints();
		gbc_lblEscudo_Local07.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscudo_Local07.gridx = 2;
		gbc_lblEscudo_Local07.gridy = 11;
		pagina02Simulacion_Jornada.add(lblEscudo_Local07, gbc_lblEscudo_Local07);
		
		JLabel lblEquipo_Local07 = new JLabel("LOCAL");
		GridBagConstraints gbc_lblEquipo_Local07 = new GridBagConstraints();
		gbc_lblEquipo_Local07.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo_Local07.gridx = 3;
		gbc_lblEquipo_Local07.gridy = 11;
		pagina02Simulacion_Jornada.add(lblEquipo_Local07, gbc_lblEquipo_Local07);
		
		JLabel lblGoles_Local07 = new JLabel("Goles");
		GridBagConstraints gbc_lblGoles_Local07 = new GridBagConstraints();
		gbc_lblGoles_Local07.insets = new Insets(0, 0, 5, 5);
		gbc_lblGoles_Local07.gridx = 4;
		gbc_lblGoles_Local07.gridy = 11;
		pagina02Simulacion_Jornada.add(lblGoles_Local07, gbc_lblGoles_Local07);
		
		JLabel lblLabel_07 = new JLabel("-");
		GridBagConstraints gbc_lblLabel_07 = new GridBagConstraints();
		gbc_lblLabel_07.insets = new Insets(0, 0, 5, 5);
		gbc_lblLabel_07.gridx = 5;
		gbc_lblLabel_07.gridy = 11;
		pagina02Simulacion_Jornada.add(lblLabel_07, gbc_lblLabel_07);
		
		JLabel lblGoles_Visitante07 = new JLabel("Goles");
		GridBagConstraints gbc_lblGoles_Visitante07 = new GridBagConstraints();
		gbc_lblGoles_Visitante07.insets = new Insets(0, 0, 5, 5);
		gbc_lblGoles_Visitante07.gridx = 6;
		gbc_lblGoles_Visitante07.gridy = 11;
		pagina02Simulacion_Jornada.add(lblGoles_Visitante07, gbc_lblGoles_Visitante07);
		
		JLabel lblEquipo_Visitante07 = new JLabel("VISIT");
		GridBagConstraints gbc_lblEquipo_Visitante07 = new GridBagConstraints();
		gbc_lblEquipo_Visitante07.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo_Visitante07.gridx = 7;
		gbc_lblEquipo_Visitante07.gridy = 11;
		pagina02Simulacion_Jornada.add(lblEquipo_Visitante07, gbc_lblEquipo_Visitante07);
		
		JLabel lblEscudo_Visitante07 = new JLabel("Escudo 14");
		GridBagConstraints gbc_lblEscudo_Visitante07 = new GridBagConstraints();
		gbc_lblEscudo_Visitante07.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscudo_Visitante07.gridx = 8;
		gbc_lblEscudo_Visitante07.gridy = 11;
		pagina02Simulacion_Jornada.add(lblEscudo_Visitante07, gbc_lblEscudo_Visitante07);
		
		JLabel lblEscudo_Local08 = new JLabel("Escudo 15");
		GridBagConstraints gbc_lblEscudo_Local08 = new GridBagConstraints();
		gbc_lblEscudo_Local08.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscudo_Local08.gridx = 2;
		gbc_lblEscudo_Local08.gridy = 12;
		pagina02Simulacion_Jornada.add(lblEscudo_Local08, gbc_lblEscudo_Local08);
		
		JLabel lblEquipo_Local08 = new JLabel("LOCAL");
		GridBagConstraints gbc_lblEquipo_Local08 = new GridBagConstraints();
		gbc_lblEquipo_Local08.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo_Local08.gridx = 3;
		gbc_lblEquipo_Local08.gridy = 12;
		pagina02Simulacion_Jornada.add(lblEquipo_Local08, gbc_lblEquipo_Local08);
		
		JLabel lblGoles_Local08 = new JLabel("Goles");
		GridBagConstraints gbc_lblGoles_Local08 = new GridBagConstraints();
		gbc_lblGoles_Local08.insets = new Insets(0, 0, 5, 5);
		gbc_lblGoles_Local08.gridx = 4;
		gbc_lblGoles_Local08.gridy = 12;
		pagina02Simulacion_Jornada.add(lblGoles_Local08, gbc_lblGoles_Local08);
		
		JLabel lblLabel_08 = new JLabel("-");
		GridBagConstraints gbc_lblLabel_08 = new GridBagConstraints();
		gbc_lblLabel_08.insets = new Insets(0, 0, 5, 5);
		gbc_lblLabel_08.gridx = 5;
		gbc_lblLabel_08.gridy = 12;
		pagina02Simulacion_Jornada.add(lblLabel_08, gbc_lblLabel_08);
		
		JLabel lblGoles_Visitante08 = new JLabel("Goles");
		GridBagConstraints gbc_lblGoles_Visitante08 = new GridBagConstraints();
		gbc_lblGoles_Visitante08.insets = new Insets(0, 0, 5, 5);
		gbc_lblGoles_Visitante08.gridx = 6;
		gbc_lblGoles_Visitante08.gridy = 12;
		pagina02Simulacion_Jornada.add(lblGoles_Visitante08, gbc_lblGoles_Visitante08);
		
		JLabel lblEquipo_Visitante08 = new JLabel("VISIT");
		GridBagConstraints gbc_lblEquipo_Visitante08 = new GridBagConstraints();
		gbc_lblEquipo_Visitante08.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo_Visitante08.gridx = 7;
		gbc_lblEquipo_Visitante08.gridy = 12;
		pagina02Simulacion_Jornada.add(lblEquipo_Visitante08, gbc_lblEquipo_Visitante08);
		
		JLabel lblEscudo_Visitante08 = new JLabel("Escudo 16");
		GridBagConstraints gbc_lblEscudo_Visitante08 = new GridBagConstraints();
		gbc_lblEscudo_Visitante08.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscudo_Visitante08.gridx = 8;
		gbc_lblEscudo_Visitante08.gridy = 12;
		pagina02Simulacion_Jornada.add(lblEscudo_Visitante08, gbc_lblEscudo_Visitante08);
		
		JLabel lblEscudo_Local09 = new JLabel("Escudo 17");
		GridBagConstraints gbc_lblEscudo_Local09 = new GridBagConstraints();
		gbc_lblEscudo_Local09.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscudo_Local09.gridx = 2;
		gbc_lblEscudo_Local09.gridy = 13;
		pagina02Simulacion_Jornada.add(lblEscudo_Local09, gbc_lblEscudo_Local09);
		
		JLabel lblEquipo_Local09 = new JLabel("LOCAL");
		GridBagConstraints gbc_lblEquipo_Local09 = new GridBagConstraints();
		gbc_lblEquipo_Local09.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo_Local09.gridx = 3;
		gbc_lblEquipo_Local09.gridy = 13;
		pagina02Simulacion_Jornada.add(lblEquipo_Local09, gbc_lblEquipo_Local09);
		
		JLabel lblGoles_Local09 = new JLabel("Goles");
		GridBagConstraints gbc_lblGoles_Local09 = new GridBagConstraints();
		gbc_lblGoles_Local09.insets = new Insets(0, 0, 5, 5);
		gbc_lblGoles_Local09.gridx = 4;
		gbc_lblGoles_Local09.gridy = 13;
		pagina02Simulacion_Jornada.add(lblGoles_Local09, gbc_lblGoles_Local09);
		
		JLabel lblLabel_09 = new JLabel("-");
		GridBagConstraints gbc_lblLabel_09 = new GridBagConstraints();
		gbc_lblLabel_09.insets = new Insets(0, 0, 5, 5);
		gbc_lblLabel_09.gridx = 5;
		gbc_lblLabel_09.gridy = 13;
		pagina02Simulacion_Jornada.add(lblLabel_09, gbc_lblLabel_09);
		
		JLabel lblGoles_Visitante09 = new JLabel("Goles");
		GridBagConstraints gbc_lblGoles_Visitante09 = new GridBagConstraints();
		gbc_lblGoles_Visitante09.insets = new Insets(0, 0, 5, 5);
		gbc_lblGoles_Visitante09.gridx = 6;
		gbc_lblGoles_Visitante09.gridy = 13;
		pagina02Simulacion_Jornada.add(lblGoles_Visitante09, gbc_lblGoles_Visitante09);
		
		JLabel lblEquipo_Visitante09 = new JLabel("VISIT");
		GridBagConstraints gbc_lblEquipo_Visitante09 = new GridBagConstraints();
		gbc_lblEquipo_Visitante09.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo_Visitante09.gridx = 7;
		gbc_lblEquipo_Visitante09.gridy = 13;
		pagina02Simulacion_Jornada.add(lblEquipo_Visitante09, gbc_lblEquipo_Visitante09);
		
		JLabel lblEscudo_Visitante09 = new JLabel("Escudo 18");
		GridBagConstraints gbc_lblEscudo_Visitante09 = new GridBagConstraints();
		gbc_lblEscudo_Visitante09.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscudo_Visitante09.gridx = 8;
		gbc_lblEscudo_Visitante09.gridy = 13;
		pagina02Simulacion_Jornada.add(lblEscudo_Visitante09, gbc_lblEscudo_Visitante09);
		
		JLabel lblEscudo_Local10 = new JLabel("Escudo 19");
		GridBagConstraints gbc_lblEscudo_Local10 = new GridBagConstraints();
		gbc_lblEscudo_Local10.insets = new Insets(0, 0, 0, 5);
		gbc_lblEscudo_Local10.gridx = 2;
		gbc_lblEscudo_Local10.gridy = 14;
		pagina02Simulacion_Jornada.add(lblEscudo_Local10, gbc_lblEscudo_Local10);
		
		JLabel lblEquipo_Local10 = new JLabel("LOCAL");
		GridBagConstraints gbc_lblEquipo_Local10 = new GridBagConstraints();
		gbc_lblEquipo_Local10.insets = new Insets(0, 0, 0, 5);
		gbc_lblEquipo_Local10.gridx = 3;
		gbc_lblEquipo_Local10.gridy = 14;
		pagina02Simulacion_Jornada.add(lblEquipo_Local10, gbc_lblEquipo_Local10);
		
		JLabel lblGoles_Local10 = new JLabel("Goles");
		GridBagConstraints gbc_lblGoles_Local10 = new GridBagConstraints();
		gbc_lblGoles_Local10.insets = new Insets(0, 0, 0, 5);
		gbc_lblGoles_Local10.gridx = 4;
		gbc_lblGoles_Local10.gridy = 14;
		pagina02Simulacion_Jornada.add(lblGoles_Local10, gbc_lblGoles_Local10);
		
		JLabel lblLabel_10 = new JLabel("-");
		GridBagConstraints gbc_lblLabel_10 = new GridBagConstraints();
		gbc_lblLabel_10.insets = new Insets(0, 0, 0, 5);
		gbc_lblLabel_10.gridx = 5;
		gbc_lblLabel_10.gridy = 14;
		pagina02Simulacion_Jornada.add(lblLabel_10, gbc_lblLabel_10);
		
		JLabel lblGoles_Visitante10 = new JLabel("Goles");
		GridBagConstraints gbc_lblGoles_Visitante10 = new GridBagConstraints();
		gbc_lblGoles_Visitante10.insets = new Insets(0, 0, 0, 5);
		gbc_lblGoles_Visitante10.gridx = 6;
		gbc_lblGoles_Visitante10.gridy = 14;
		pagina02Simulacion_Jornada.add(lblGoles_Visitante10, gbc_lblGoles_Visitante10);
		
		JLabel lblEquipo_Visitante10 = new JLabel("VISIT");
		GridBagConstraints gbc_lblEquipo_Visitante10 = new GridBagConstraints();
		gbc_lblEquipo_Visitante10.insets = new Insets(0, 0, 0, 5);
		gbc_lblEquipo_Visitante10.gridx = 7;
		gbc_lblEquipo_Visitante10.gridy = 14;
		pagina02Simulacion_Jornada.add(lblEquipo_Visitante10, gbc_lblEquipo_Visitante10);
		
		JLabel lblEscudo_Visitante10 = new JLabel("Escudo 20");
		GridBagConstraints gbc_lblEscudo_Visitante10 = new GridBagConstraints();
		gbc_lblEscudo_Visitante10.insets = new Insets(0, 0, 0, 5);
		gbc_lblEscudo_Visitante10.gridx = 8;
		gbc_lblEscudo_Visitante10.gridy = 14;
		pagina02Simulacion_Jornada.add(lblEscudo_Visitante10, gbc_lblEscudo_Visitante10);
	}
}
