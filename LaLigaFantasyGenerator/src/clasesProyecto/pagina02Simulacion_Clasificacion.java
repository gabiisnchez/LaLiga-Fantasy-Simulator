package clasesProyecto;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.Image;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class pagina02Simulacion_Clasificacion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel pagina02Simulacion_clasificacion;
	private ConexionMySQL conexion;

	public pagina02Simulacion_Clasificacion(ConexionMySQL conexion) {
		if (conexion == null) {
			throw new IllegalArgumentException("La conexión no puede ser null");
		}
		this.conexion = conexion;
		setTitle("LaLiga Fantasy Simulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 725);
		pagina02Simulacion_clasificacion = new JPanel();
		pagina02Simulacion_clasificacion.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(pagina02Simulacion_clasificacion);
		GridBagLayout gbl_pagina02Simulacion_clasificacion = new GridBagLayout();
		gbl_pagina02Simulacion_clasificacion.columnWidths = new int[]{0, 0, 30, 30, 100, 30, 30, 30, 30, 30, 30, 30, 30, 30, 0, 0};
		gbl_pagina02Simulacion_clasificacion.rowHeights = new int[]{0, 0, 0, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 0, 0};
		gbl_pagina02Simulacion_clasificacion.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pagina02Simulacion_clasificacion.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pagina02Simulacion_clasificacion.setLayout(gbl_pagina02Simulacion_clasificacion);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pagina02Simulacion ventanaSimulacion = new pagina02Simulacion(conexion);
				ventanaSimulacion.setVisible(true);
				dispose();
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 2;
		pagina02Simulacion_clasificacion.add(btnNewButton, gbc_btnNewButton);
		
		JLabel lblEquipo = new JLabel("Equipo");
		GridBagConstraints gbc_lblEquipo = new GridBagConstraints();
		gbc_lblEquipo.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo.gridx = 4;
		gbc_lblEquipo.gridy = 3;
		pagina02Simulacion_clasificacion.add(lblEquipo, gbc_lblEquipo);
		
		JLabel lblPuntos = new JLabel("Puntos");
		GridBagConstraints gbc_lblPuntos = new GridBagConstraints();
		gbc_lblPuntos.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuntos.gridx = 5;
		gbc_lblPuntos.gridy = 3;
		pagina02Simulacion_clasificacion.add(lblPuntos, gbc_lblPuntos);
		
		JLabel lblPJ = new JLabel("PJ");
		GridBagConstraints gbc_lblPJ = new GridBagConstraints();
		gbc_lblPJ.insets = new Insets(0, 0, 5, 5);
		gbc_lblPJ.gridx = 6;
		gbc_lblPJ.gridy = 3;
		pagina02Simulacion_clasificacion.add(lblPJ, gbc_lblPJ);
		
		JLabel lblPG = new JLabel("PG");
		GridBagConstraints gbc_lblPG = new GridBagConstraints();
		gbc_lblPG.insets = new Insets(0, 0, 5, 5);
		gbc_lblPG.gridx = 7;
		gbc_lblPG.gridy = 3;
		pagina02Simulacion_clasificacion.add(lblPG, gbc_lblPG);
		
		JLabel lblPE = new JLabel("PE");
		GridBagConstraints gbc_lblPE = new GridBagConstraints();
		gbc_lblPE.insets = new Insets(0, 0, 5, 5);
		gbc_lblPE.gridx = 8;
		gbc_lblPE.gridy = 3;
		pagina02Simulacion_clasificacion.add(lblPE, gbc_lblPE);
		
		JLabel lblPP = new JLabel("PP");
		GridBagConstraints gbc_lblPP = new GridBagConstraints();
		gbc_lblPP.insets = new Insets(0, 0, 5, 5);
		gbc_lblPP.gridx = 9;
		gbc_lblPP.gridy = 3;
		pagina02Simulacion_clasificacion.add(lblPP, gbc_lblPP);
		
		JLabel lblGF = new JLabel("GF");
		GridBagConstraints gbc_lblGF = new GridBagConstraints();
		gbc_lblGF.insets = new Insets(0, 0, 5, 5);
		gbc_lblGF.gridx = 10;
		gbc_lblGF.gridy = 3;
		pagina02Simulacion_clasificacion.add(lblGF, gbc_lblGF);
		
		JLabel lblGC = new JLabel("GC");
		GridBagConstraints gbc_lblGC = new GridBagConstraints();
		gbc_lblGC.insets = new Insets(0, 0, 5, 5);
		gbc_lblGC.gridx = 11;
		gbc_lblGC.gridy = 3;
		pagina02Simulacion_clasificacion.add(lblGC, gbc_lblGC);
		
		JLabel lblDG = new JLabel("DG");
		GridBagConstraints gbc_lblDG = new GridBagConstraints();
		gbc_lblDG.insets = new Insets(0, 0, 5, 5);
		gbc_lblDG.gridx = 12;
		gbc_lblDG.gridy = 3;
		pagina02Simulacion_clasificacion.add(lblDG, gbc_lblDG);
		
		JLabel lblPosicion_01 = new JLabel("1");
		GridBagConstraints gbc_lblPosicion_01 = new GridBagConstraints();
		gbc_lblPosicion_01.insets = new Insets(0, 0, 5, 5);
		gbc_lblPosicion_01.gridx = 2;
		gbc_lblPosicion_01.gridy = 4;
		pagina02Simulacion_clasificacion.add(lblPosicion_01, gbc_lblPosicion_01);
		
		JLabel lblEscudos_01 = new JLabel("");
		lblEscudos_01.setIcon(new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/alaves.png")));
		lblEscudos_01.setBounds(136, 29, 163, 119);
		pagina02Simulacion_clasificacion.add(lblEscudos_01);
		
		ImageIcon iconoEscudo_01 = new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/alaves.png"));
		Image imagenEscudo_01 = iconoEscudo_01.getImage().getScaledInstance(30, 25, Image.SCALE_SMOOTH);
		ImageIcon iconoAjustado_01 = new ImageIcon(imagenEscudo_01); 
		lblEscudos_01.setIcon(iconoAjustado_01);
		
		GridBagConstraints gbc_lblEscudos_01 = new GridBagConstraints();
		gbc_lblEscudos_01.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscudos_01.gridx = 3;
		gbc_lblEscudos_01.gridy = 4;
		pagina02Simulacion_clasificacion.add(lblEscudos_01, gbc_lblEscudos_01);
			
		JLabel lblEquipo_01 = new JLabel("");
		GridBagConstraints gbc_lblEquipo_01 = new GridBagConstraints();
		gbc_lblEquipo_01.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo_01.gridx = 4;
		gbc_lblEquipo_01.gridy = 4;
		pagina02Simulacion_clasificacion.add(lblEquipo_01, gbc_lblEquipo_01);
		
		JLabel lblPuntos_01 = new JLabel("");
		GridBagConstraints gbc_lblPuntos_01 = new GridBagConstraints();
		gbc_lblPuntos_01.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuntos_01.gridx = 5;
		gbc_lblPuntos_01.gridy = 4;
		pagina02Simulacion_clasificacion.add(lblPuntos_01, gbc_lblPuntos_01);
		
		JLabel lblPJ_01 = new JLabel("");
		GridBagConstraints gbc_lblPJ_01 = new GridBagConstraints();
		gbc_lblPJ_01.insets = new Insets(0, 0, 5, 5);
		gbc_lblPJ_01.gridx = 6;
		gbc_lblPJ_01.gridy = 4;
		pagina02Simulacion_clasificacion.add(lblPJ_01, gbc_lblPJ_01);
		
		JLabel lblPG_01 = new JLabel("");
		GridBagConstraints gbc_lblPG_01 = new GridBagConstraints();
		gbc_lblPG_01.insets = new Insets(0, 0, 5, 5);
		gbc_lblPG_01.gridx = 7;
		gbc_lblPG_01.gridy = 4;
		pagina02Simulacion_clasificacion.add(lblPG_01, gbc_lblPG_01);
		
		JLabel lblPE_01 = new JLabel("");
		GridBagConstraints gbc_lblPE_01 = new GridBagConstraints();
		gbc_lblPE_01.insets = new Insets(0, 0, 5, 5);
		gbc_lblPE_01.gridx = 8;
		gbc_lblPE_01.gridy = 4;
		pagina02Simulacion_clasificacion.add(lblPE_01, gbc_lblPE_01);
		
		JLabel lblPP_01 = new JLabel("");
		GridBagConstraints gbc_lblPP_01 = new GridBagConstraints();
		gbc_lblPP_01.insets = new Insets(0, 0, 5, 5);
		gbc_lblPP_01.gridx = 9;
		gbc_lblPP_01.gridy = 4;
		pagina02Simulacion_clasificacion.add(lblPP_01, gbc_lblPP_01);
		
		JLabel lblGF_01 = new JLabel("");
		GridBagConstraints gbc_lblGF_01 = new GridBagConstraints();
		gbc_lblGF_01.insets = new Insets(0, 0, 5, 5);
		gbc_lblGF_01.gridx = 10;
		gbc_lblGF_01.gridy = 4;
		pagina02Simulacion_clasificacion.add(lblGF_01, gbc_lblGF_01);
		
		JLabel lblGC_01 = new JLabel("");
		GridBagConstraints gbc_lblGC_01 = new GridBagConstraints();
		gbc_lblGC_01.insets = new Insets(0, 0, 5, 5);
		gbc_lblGC_01.gridx = 11;
		gbc_lblGC_01.gridy = 4;
		pagina02Simulacion_clasificacion.add(lblGC_01, gbc_lblGC_01);
		
		JLabel lblDG_01 = new JLabel("");
		GridBagConstraints gbc_lblDG_01 = new GridBagConstraints();
		gbc_lblDG_01.insets = new Insets(0, 0, 5, 5);
		gbc_lblDG_01.gridx = 12;
		gbc_lblDG_01.gridy = 4;
		pagina02Simulacion_clasificacion.add(lblDG_01, gbc_lblDG_01);
		
		JLabel lblPosicion_02 = new JLabel("2");
		GridBagConstraints gbc_lblPosicion_02 = new GridBagConstraints();
		gbc_lblPosicion_02.insets = new Insets(0, 0, 5, 5);
		gbc_lblPosicion_02.gridx = 2;
		gbc_lblPosicion_02.gridy = 5;
		pagina02Simulacion_clasificacion.add(lblPosicion_02, gbc_lblPosicion_02);
		
		JLabel lblEscudos_02 = new JLabel("");
		lblEscudos_02.setIcon(new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/athletic.png")));
		lblEscudos_02.setBounds(136, 29, 163, 119);
		pagina02Simulacion_clasificacion.add(lblEscudos_02);

		ImageIcon iconoEscudo_02 = new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/athletic.png"));
		Image imagenEscudo_02 = iconoEscudo_02.getImage().getScaledInstance(30, 25, Image.SCALE_SMOOTH);
		ImageIcon iconoAjustado_02 = new ImageIcon(imagenEscudo_02); 
		lblEscudos_02.setIcon(iconoAjustado_02);

		GridBagConstraints gbc_lblEscudos_02 = new GridBagConstraints();
		gbc_lblEscudos_02.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscudos_02.gridx = 3;
		gbc_lblEscudos_02.gridy = 5;
		pagina02Simulacion_clasificacion.add(lblEscudos_02, gbc_lblEscudos_02);
		
		JLabel lblEquipo_02 = new JLabel("");
		GridBagConstraints gbc_lblEquipo_02 = new GridBagConstraints();
		gbc_lblEquipo_02.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo_02.gridx = 4;
		gbc_lblEquipo_02.gridy = 5;
		pagina02Simulacion_clasificacion.add(lblEquipo_02, gbc_lblEquipo_02);
		
		JLabel lblPuntos_02 = new JLabel("");
		GridBagConstraints gbc_lblPuntos_02 = new GridBagConstraints();
		gbc_lblPuntos_02.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuntos_02.gridx = 5;
		gbc_lblPuntos_02.gridy = 5;
		pagina02Simulacion_clasificacion.add(lblPuntos_02, gbc_lblPuntos_02);
		
		JLabel lblPJ_02 = new JLabel("");
		GridBagConstraints gbc_lblPJ_02 = new GridBagConstraints();
		gbc_lblPJ_02.insets = new Insets(0, 0, 5, 5);
		gbc_lblPJ_02.gridx = 6;
		gbc_lblPJ_02.gridy = 5;
		pagina02Simulacion_clasificacion.add(lblPJ_02, gbc_lblPJ_02);
		
		JLabel lblPG_02 = new JLabel("");
		GridBagConstraints gbc_lblPG_02 = new GridBagConstraints();
		gbc_lblPG_02.insets = new Insets(0, 0, 5, 5);
		gbc_lblPG_02.gridx = 7;
		gbc_lblPG_02.gridy = 5;
		pagina02Simulacion_clasificacion.add(lblPG_02, gbc_lblPG_02);
		
		JLabel lblPE_02 = new JLabel("");
		GridBagConstraints gbc_lblPE_02 = new GridBagConstraints();
		gbc_lblPE_02.insets = new Insets(0, 0, 5, 5);
		gbc_lblPE_02.gridx = 8;
		gbc_lblPE_02.gridy = 5;
		pagina02Simulacion_clasificacion.add(lblPE_02, gbc_lblPE_02);
		
		JLabel lblPP_02 = new JLabel("");
		GridBagConstraints gbc_lblPP_02 = new GridBagConstraints();
		gbc_lblPP_02.insets = new Insets(0, 0, 5, 5);
		gbc_lblPP_02.gridx = 9;
		gbc_lblPP_02.gridy = 5;
		pagina02Simulacion_clasificacion.add(lblPP_02, gbc_lblPP_02);
		
		JLabel lblGF_02 = new JLabel("");
		GridBagConstraints gbc_lblGF_02 = new GridBagConstraints();
		gbc_lblGF_02.insets = new Insets(0, 0, 5, 5);
		gbc_lblGF_02.gridx = 10;
		gbc_lblGF_02.gridy = 5;
		pagina02Simulacion_clasificacion.add(lblGF_02, gbc_lblGF_02);
		
		JLabel lblGC_02 = new JLabel("");
		GridBagConstraints gbc_lblGC_02 = new GridBagConstraints();
		gbc_lblGC_02.insets = new Insets(0, 0, 5, 5);
		gbc_lblGC_02.gridx = 11;
		gbc_lblGC_02.gridy = 5;
		pagina02Simulacion_clasificacion.add(lblGC_02, gbc_lblGC_02);
		
		JLabel lblDG_02 = new JLabel("");
		GridBagConstraints gbc_lblDG_02 = new GridBagConstraints();
		gbc_lblDG_02.insets = new Insets(0, 0, 5, 5);
		gbc_lblDG_02.gridx = 12;
		gbc_lblDG_02.gridy = 5;
		pagina02Simulacion_clasificacion.add(lblDG_02, gbc_lblDG_02);
		
		JLabel lblPosicion_03 = new JLabel("3");
		GridBagConstraints gbc_lblPosicion_03 = new GridBagConstraints();
		gbc_lblPosicion_03.insets = new Insets(0, 0, 5, 5);
		gbc_lblPosicion_03.gridx = 2;
		gbc_lblPosicion_03.gridy = 6;
		pagina02Simulacion_clasificacion.add(lblPosicion_03, gbc_lblPosicion_03);
		
		JLabel lblEscudos_03 = new JLabel("");
		lblEscudos_03.setIcon(new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/atletico.png")));
		lblEscudos_03.setBounds(136, 29, 163, 119);
		pagina02Simulacion_clasificacion.add(lblEscudos_03);

		ImageIcon iconoEscudo_03 = new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/atletico.png"));
		Image imagenEscudo_03 = iconoEscudo_03.getImage().getScaledInstance(30, 25, Image.SCALE_SMOOTH);
		ImageIcon iconoAjustado_03 = new ImageIcon(imagenEscudo_03); 
		lblEscudos_03.setIcon(iconoAjustado_03);

		GridBagConstraints gbc_lblEscudos_03 = new GridBagConstraints();
		gbc_lblEscudos_03.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscudos_03.gridx = 3;
		gbc_lblEscudos_03.gridy = 6;
		pagina02Simulacion_clasificacion.add(lblEscudos_03, gbc_lblEscudos_03);
		
		JLabel lblEquipo_03 = new JLabel("");
		GridBagConstraints gbc_lblEquipo_03 = new GridBagConstraints();
		gbc_lblEquipo_03.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo_03.gridx = 4;
		gbc_lblEquipo_03.gridy = 6;
		pagina02Simulacion_clasificacion.add(lblEquipo_03, gbc_lblEquipo_03);
		
		JLabel lblPuntos_03 = new JLabel("");
		GridBagConstraints gbc_lblPuntos_03 = new GridBagConstraints();
		gbc_lblPuntos_03.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuntos_03.gridx = 5;
		gbc_lblPuntos_03.gridy = 6;
		pagina02Simulacion_clasificacion.add(lblPuntos_03, gbc_lblPuntos_03);
		
		JLabel lblPJ_03 = new JLabel("");
		GridBagConstraints gbc_lblPJ_03 = new GridBagConstraints();
		gbc_lblPJ_03.insets = new Insets(0, 0, 5, 5);
		gbc_lblPJ_03.gridx = 6;
		gbc_lblPJ_03.gridy = 6;
		pagina02Simulacion_clasificacion.add(lblPJ_03, gbc_lblPJ_03);
		
		JLabel lblPG_03 = new JLabel("");
		GridBagConstraints gbc_lblPG_03 = new GridBagConstraints();
		gbc_lblPG_03.insets = new Insets(0, 0, 5, 5);
		gbc_lblPG_03.gridx = 7;
		gbc_lblPG_03.gridy = 6;
		pagina02Simulacion_clasificacion.add(lblPG_03, gbc_lblPG_03);
		
		JLabel lblPE_03 = new JLabel("");
		GridBagConstraints gbc_lblPE_03 = new GridBagConstraints();
		gbc_lblPE_03.insets = new Insets(0, 0, 5, 5);
		gbc_lblPE_03.gridx = 8;
		gbc_lblPE_03.gridy = 6;
		pagina02Simulacion_clasificacion.add(lblPE_03, gbc_lblPE_03);
		
		JLabel lblPP_03 = new JLabel("");
		GridBagConstraints gbc_lblPP_03 = new GridBagConstraints();
		gbc_lblPP_03.insets = new Insets(0, 0, 5, 5);
		gbc_lblPP_03.gridx = 9;
		gbc_lblPP_03.gridy = 6;
		pagina02Simulacion_clasificacion.add(lblPP_03, gbc_lblPP_03);
		
		JLabel lblGF_03 = new JLabel("");
		GridBagConstraints gbc_lblGF_03 = new GridBagConstraints();
		gbc_lblGF_03.insets = new Insets(0, 0, 5, 5);
		gbc_lblGF_03.gridx = 10;
		gbc_lblGF_03.gridy = 6;
		pagina02Simulacion_clasificacion.add(lblGF_03, gbc_lblGF_03);
		
		JLabel lblGC_03 = new JLabel("");
		GridBagConstraints gbc_lblGC_03 = new GridBagConstraints();
		gbc_lblGC_03.insets = new Insets(0, 0, 5, 5);
		gbc_lblGC_03.gridx = 11;
		gbc_lblGC_03.gridy = 6;
		pagina02Simulacion_clasificacion.add(lblGC_03, gbc_lblGC_03);
		
		JLabel lblDG_03 = new JLabel("");
		GridBagConstraints gbc_lblDG_03 = new GridBagConstraints();
		gbc_lblDG_03.insets = new Insets(0, 0, 5, 5);
		gbc_lblDG_03.gridx = 12;
		gbc_lblDG_03.gridy = 6;
		pagina02Simulacion_clasificacion.add(lblDG_03, gbc_lblDG_03);
		
		JLabel lblPosicion_04 = new JLabel("4");
		GridBagConstraints gbc_lblPosicion_04 = new GridBagConstraints();
		gbc_lblPosicion_04.insets = new Insets(0, 0, 5, 5);
		gbc_lblPosicion_04.gridx = 2;
		gbc_lblPosicion_04.gridy = 7;
		pagina02Simulacion_clasificacion.add(lblPosicion_04, gbc_lblPosicion_04);
		
		JLabel lblEscudos_04 = new JLabel("");
		lblEscudos_04.setIcon(new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/barcelona.png")));
		lblEscudos_04.setBounds(136, 29, 163, 119);
		pagina02Simulacion_clasificacion.add(lblEscudos_04);

		ImageIcon iconoEscudo_04 = new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/barcelona.png"));
		Image imagenEscudo_04 = iconoEscudo_04.getImage().getScaledInstance(30, 25, Image.SCALE_SMOOTH);
		ImageIcon iconoAjustado_04 = new ImageIcon(imagenEscudo_04); 
		lblEscudos_04.setIcon(iconoAjustado_04);

		GridBagConstraints gbc_lblEscudos_04 = new GridBagConstraints();
		gbc_lblEscudos_04.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscudos_04.gridx = 3;
		gbc_lblEscudos_04.gridy = 7;
		pagina02Simulacion_clasificacion.add(lblEscudos_04, gbc_lblEscudos_04);
		
		JLabel lblEquipo_04 = new JLabel("");
		GridBagConstraints gbc_lblEquipo_04 = new GridBagConstraints();
		gbc_lblEquipo_04.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo_04.gridx = 4;
		gbc_lblEquipo_04.gridy = 7;
		pagina02Simulacion_clasificacion.add(lblEquipo_04, gbc_lblEquipo_04);
		
		JLabel lblPuntos_04 = new JLabel("");
		GridBagConstraints gbc_lblPuntos_04 = new GridBagConstraints();
		gbc_lblPuntos_04.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuntos_04.gridx = 5;
		gbc_lblPuntos_04.gridy = 7;
		pagina02Simulacion_clasificacion.add(lblPuntos_04, gbc_lblPuntos_04);
		
		JLabel lblPJ_04 = new JLabel("");
		GridBagConstraints gbc_lblPJ_04 = new GridBagConstraints();
		gbc_lblPJ_04.insets = new Insets(0, 0, 5, 5);
		gbc_lblPJ_04.gridx = 6;
		gbc_lblPJ_04.gridy = 7;
		pagina02Simulacion_clasificacion.add(lblPJ_04, gbc_lblPJ_04);
		
		JLabel lblPG_04 = new JLabel("");
		GridBagConstraints gbc_lblPG_04 = new GridBagConstraints();
		gbc_lblPG_04.insets = new Insets(0, 0, 5, 5);
		gbc_lblPG_04.gridx = 7;
		gbc_lblPG_04.gridy = 7;
		pagina02Simulacion_clasificacion.add(lblPG_04, gbc_lblPG_04);
		
		JLabel lblPE_04 = new JLabel("");
		GridBagConstraints gbc_lblPE_04 = new GridBagConstraints();
		gbc_lblPE_04.insets = new Insets(0, 0, 5, 5);
		gbc_lblPE_04.gridx = 8;
		gbc_lblPE_04.gridy = 7;
		pagina02Simulacion_clasificacion.add(lblPE_04, gbc_lblPE_04);
		
		JLabel lblPP_04 = new JLabel("");
		GridBagConstraints gbc_lblPP_04 = new GridBagConstraints();
		gbc_lblPP_04.insets = new Insets(0, 0, 5, 5);
		gbc_lblPP_04.gridx = 9;
		gbc_lblPP_04.gridy = 7;
		pagina02Simulacion_clasificacion.add(lblPP_04, gbc_lblPP_04);
		
		JLabel lblGF_04 = new JLabel("");
		GridBagConstraints gbc_lblGF_04 = new GridBagConstraints();
		gbc_lblGF_04.insets = new Insets(0, 0, 5, 5);
		gbc_lblGF_04.gridx = 10;
		gbc_lblGF_04.gridy = 7;
		pagina02Simulacion_clasificacion.add(lblGF_04, gbc_lblGF_04);
		
		JLabel lblGC_04 = new JLabel("");
		GridBagConstraints gbc_lblGC_04 = new GridBagConstraints();
		gbc_lblGC_04.insets = new Insets(0, 0, 5, 5);
		gbc_lblGC_04.gridx = 11;
		gbc_lblGC_04.gridy = 7;
		pagina02Simulacion_clasificacion.add(lblGC_04, gbc_lblGC_04);
		
		JLabel lblDG_04 = new JLabel("");
		GridBagConstraints gbc_lblDG_04 = new GridBagConstraints();
		gbc_lblDG_04.insets = new Insets(0, 0, 5, 5);
		gbc_lblDG_04.gridx = 12;
		gbc_lblDG_04.gridy = 7;
		pagina02Simulacion_clasificacion.add(lblDG_04, gbc_lblDG_04);
		
		JLabel lblPosicion_05 = new JLabel("5");
		GridBagConstraints gbc_lblPosicion_05 = new GridBagConstraints();
		gbc_lblPosicion_05.insets = new Insets(0, 0, 5, 5);
		gbc_lblPosicion_05.gridx = 2;
		gbc_lblPosicion_05.gridy = 8;
		pagina02Simulacion_clasificacion.add(lblPosicion_05, gbc_lblPosicion_05);
		
		JLabel lblEscudos_05 = new JLabel("");
		lblEscudos_05.setIcon(new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/betis.png")));
		lblEscudos_05.setBounds(136, 29, 163, 119);
		pagina02Simulacion_clasificacion.add(lblEscudos_05);

		ImageIcon iconoEscudo_05 = new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/betis.png"));
		Image imagenEscudo_05 = iconoEscudo_05.getImage().getScaledInstance(30, 25, Image.SCALE_SMOOTH);
		ImageIcon iconoAjustado_05 = new ImageIcon(imagenEscudo_05); 
		lblEscudos_05.setIcon(iconoAjustado_05);

		GridBagConstraints gbc_lblEscudos_05 = new GridBagConstraints();
		gbc_lblEscudos_05.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscudos_05.gridx = 3;
		gbc_lblEscudos_05.gridy = 8;
		pagina02Simulacion_clasificacion.add(lblEscudos_05, gbc_lblEscudos_05);
		
		JLabel lblEquipo_05 = new JLabel("");
		GridBagConstraints gbc_lblEquipo_05 = new GridBagConstraints();
		gbc_lblEquipo_05.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo_05.gridx = 4;
		gbc_lblEquipo_05.gridy = 8;
		pagina02Simulacion_clasificacion.add(lblEquipo_05, gbc_lblEquipo_05);
		
		JLabel lblPuntos_05 = new JLabel("");
		GridBagConstraints gbc_lblPuntos_05 = new GridBagConstraints();
		gbc_lblPuntos_05.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuntos_05.gridx = 5;
		gbc_lblPuntos_05.gridy = 8;
		pagina02Simulacion_clasificacion.add(lblPuntos_05, gbc_lblPuntos_05);
		
		JLabel lblPJ_05 = new JLabel("");
		GridBagConstraints gbc_lblPJ_05 = new GridBagConstraints();
		gbc_lblPJ_05.insets = new Insets(0, 0, 5, 5);
		gbc_lblPJ_05.gridx = 6;
		gbc_lblPJ_05.gridy = 8;
		pagina02Simulacion_clasificacion.add(lblPJ_05, gbc_lblPJ_05);
		
		JLabel lblPG_05 = new JLabel("");
		GridBagConstraints gbc_lblPG_05 = new GridBagConstraints();
		gbc_lblPG_05.insets = new Insets(0, 0, 5, 5);
		gbc_lblPG_05.gridx = 7;
		gbc_lblPG_05.gridy = 8;
		pagina02Simulacion_clasificacion.add(lblPG_05, gbc_lblPG_05);
		
		JLabel lblPE_05 = new JLabel("");
		GridBagConstraints gbc_lblPE_05 = new GridBagConstraints();
		gbc_lblPE_05.insets = new Insets(0, 0, 5, 5);
		gbc_lblPE_05.gridx = 8;
		gbc_lblPE_05.gridy = 8;
		pagina02Simulacion_clasificacion.add(lblPE_05, gbc_lblPE_05);
		
		JLabel lblPP_05 = new JLabel("");
		GridBagConstraints gbc_lblPP_05 = new GridBagConstraints();
		gbc_lblPP_05.insets = new Insets(0, 0, 5, 5);
		gbc_lblPP_05.gridx = 9;
		gbc_lblPP_05.gridy = 8;
		pagina02Simulacion_clasificacion.add(lblPP_05, gbc_lblPP_05);
		
		JLabel lblGF_05 = new JLabel("");
		GridBagConstraints gbc_lblGF_05 = new GridBagConstraints();
		gbc_lblGF_05.insets = new Insets(0, 0, 5, 5);
		gbc_lblGF_05.gridx = 10;
		gbc_lblGF_05.gridy = 8;
		pagina02Simulacion_clasificacion.add(lblGF_05, gbc_lblGF_05);
		
		JLabel lblGC_05 = new JLabel("");
		GridBagConstraints gbc_lblGC_05 = new GridBagConstraints();
		gbc_lblGC_05.insets = new Insets(0, 0, 5, 5);
		gbc_lblGC_05.gridx = 11;
		gbc_lblGC_05.gridy = 8;
		pagina02Simulacion_clasificacion.add(lblGC_05, gbc_lblGC_05);
		
		JLabel lblDG_05 = new JLabel("");
		GridBagConstraints gbc_lblDG_05 = new GridBagConstraints();
		gbc_lblDG_05.insets = new Insets(0, 0, 5, 5);
		gbc_lblDG_05.gridx = 12;
		gbc_lblDG_05.gridy = 8;
		pagina02Simulacion_clasificacion.add(lblDG_05, gbc_lblDG_05);
		
		JLabel lblPosicion_06 = new JLabel("6");
		GridBagConstraints gbc_lblPosicion_06 = new GridBagConstraints();
		gbc_lblPosicion_06.insets = new Insets(0, 0, 5, 5);
		gbc_lblPosicion_06.gridx = 2;
		gbc_lblPosicion_06.gridy = 9;
		pagina02Simulacion_clasificacion.add(lblPosicion_06, gbc_lblPosicion_06);
		
		JLabel lblEscudos_06 = new JLabel("");
		lblEscudos_06.setIcon(new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/celta.png")));
		lblEscudos_06.setBounds(136, 29, 163, 119);
		pagina02Simulacion_clasificacion.add(lblEscudos_06);

		ImageIcon iconoEscudo_06 = new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/celta.png"));
		Image imagenEscudo_06 = iconoEscudo_06.getImage().getScaledInstance(30, 25, Image.SCALE_SMOOTH);
		ImageIcon iconoAjustado_06 = new ImageIcon(imagenEscudo_06); 
		lblEscudos_06.setIcon(iconoAjustado_06);

		GridBagConstraints gbc_lblEscudos_06 = new GridBagConstraints();
		gbc_lblEscudos_06.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscudos_06.gridx = 3;
		gbc_lblEscudos_06.gridy = 9;
		pagina02Simulacion_clasificacion.add(lblEscudos_06, gbc_lblEscudos_06);
		
		JLabel lblEquipo_06 = new JLabel("");
		GridBagConstraints gbc_lblEquipo_06 = new GridBagConstraints();
		gbc_lblEquipo_06.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo_06.gridx = 4;
		gbc_lblEquipo_06.gridy = 9;
		pagina02Simulacion_clasificacion.add(lblEquipo_06, gbc_lblEquipo_06);
		
		JLabel lblPuntos_06 = new JLabel("");
		GridBagConstraints gbc_lblPuntos_06 = new GridBagConstraints();
		gbc_lblPuntos_06.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuntos_06.gridx = 5;
		gbc_lblPuntos_06.gridy = 9;
		pagina02Simulacion_clasificacion.add(lblPuntos_06, gbc_lblPuntos_06);
		
		JLabel lblPJ_06 = new JLabel("");
		GridBagConstraints gbc_lblPJ_06 = new GridBagConstraints();
		gbc_lblPJ_06.insets = new Insets(0, 0, 5, 5);
		gbc_lblPJ_06.gridx = 6;
		gbc_lblPJ_06.gridy = 9;
		pagina02Simulacion_clasificacion.add(lblPJ_06, gbc_lblPJ_06);
		
		JLabel lblPG_06 = new JLabel("");
		GridBagConstraints gbc_lblPG_06 = new GridBagConstraints();
		gbc_lblPG_06.insets = new Insets(0, 0, 5, 5);
		gbc_lblPG_06.gridx = 7;
		gbc_lblPG_06.gridy = 9;
		pagina02Simulacion_clasificacion.add(lblPG_06, gbc_lblPG_06);
		
		JLabel lblPE_06 = new JLabel("");
		GridBagConstraints gbc_lblPE_06 = new GridBagConstraints();
		gbc_lblPE_06.insets = new Insets(0, 0, 5, 5);
		gbc_lblPE_06.gridx = 8;
		gbc_lblPE_06.gridy = 9;
		pagina02Simulacion_clasificacion.add(lblPE_06, gbc_lblPE_06);
		
		JLabel lblPP_06 = new JLabel("");
		GridBagConstraints gbc_lblPP_06 = new GridBagConstraints();
		gbc_lblPP_06.insets = new Insets(0, 0, 5, 5);
		gbc_lblPP_06.gridx = 9;
		gbc_lblPP_06.gridy = 9;
		pagina02Simulacion_clasificacion.add(lblPP_06, gbc_lblPP_06);
		
		JLabel lblGF_06 = new JLabel("");
		GridBagConstraints gbc_lblGF_06 = new GridBagConstraints();
		gbc_lblGF_06.insets = new Insets(0, 0, 5, 5);
		gbc_lblGF_06.gridx = 10;
		gbc_lblGF_06.gridy = 9;
		pagina02Simulacion_clasificacion.add(lblGF_06, gbc_lblGF_06);
		
		JLabel lblGC_06 = new JLabel("");
		GridBagConstraints gbc_lblGC_06 = new GridBagConstraints();
		gbc_lblGC_06.insets = new Insets(0, 0, 5, 5);
		gbc_lblGC_06.gridx = 11;
		gbc_lblGC_06.gridy = 9;
		pagina02Simulacion_clasificacion.add(lblGC_06, gbc_lblGC_06);
		
		JLabel lblDG_06 = new JLabel("");
		GridBagConstraints gbc_lblDG_06 = new GridBagConstraints();
		gbc_lblDG_06.insets = new Insets(0, 0, 5, 5);
		gbc_lblDG_06.gridx = 12;
		gbc_lblDG_06.gridy = 9;
		pagina02Simulacion_clasificacion.add(lblDG_06, gbc_lblDG_06);
		
		JLabel lblPosicion_07 = new JLabel("7");
		GridBagConstraints gbc_lblPosicion_07 = new GridBagConstraints();
		gbc_lblPosicion_07.insets = new Insets(0, 0, 5, 5);
		gbc_lblPosicion_07.gridx = 2;
		gbc_lblPosicion_07.gridy = 10;
		pagina02Simulacion_clasificacion.add(lblPosicion_07, gbc_lblPosicion_07);
		
		JLabel lblEscudos_07 = new JLabel("");
		lblEscudos_07.setIcon(new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/espanyol.png")));
		lblEscudos_07.setBounds(136, 29, 163, 119);
		pagina02Simulacion_clasificacion.add(lblEscudos_07);

		ImageIcon iconoEscudo_07 = new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/espanyol.png"));
		Image imagenEscudo_07 = iconoEscudo_07.getImage().getScaledInstance(30, 25, Image.SCALE_SMOOTH);
		ImageIcon iconoAjustado_07 = new ImageIcon(imagenEscudo_07); 
		lblEscudos_07.setIcon(iconoAjustado_07);

		GridBagConstraints gbc_lblEscudos_07 = new GridBagConstraints();
		gbc_lblEscudos_07.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscudos_07.gridx = 3;
		gbc_lblEscudos_07.gridy = 10;
		pagina02Simulacion_clasificacion.add(lblEscudos_07, gbc_lblEscudos_07);
		
		JLabel lblEquipo_07 = new JLabel("");
		GridBagConstraints gbc_lblEquipo_07 = new GridBagConstraints();
		gbc_lblEquipo_07.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo_07.gridx = 4;
		gbc_lblEquipo_07.gridy = 10;
		pagina02Simulacion_clasificacion.add(lblEquipo_07, gbc_lblEquipo_07);
		
		JLabel lblPuntos_07 = new JLabel("");
		GridBagConstraints gbc_lblPuntos_07 = new GridBagConstraints();
		gbc_lblPuntos_07.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuntos_07.gridx = 5;
		gbc_lblPuntos_07.gridy = 10;
		pagina02Simulacion_clasificacion.add(lblPuntos_07, gbc_lblPuntos_07);
		
		JLabel lblPJ_07 = new JLabel("");
		GridBagConstraints gbc_lblPJ_07 = new GridBagConstraints();
		gbc_lblPJ_07.insets = new Insets(0, 0, 5, 5);
		gbc_lblPJ_07.gridx = 6;
		gbc_lblPJ_07.gridy = 10;
		pagina02Simulacion_clasificacion.add(lblPJ_07, gbc_lblPJ_07);
		
		JLabel lblPG_07 = new JLabel("");
		GridBagConstraints gbc_lblPG_07 = new GridBagConstraints();
		gbc_lblPG_07.insets = new Insets(0, 0, 5, 5);
		gbc_lblPG_07.gridx = 7;
		gbc_lblPG_07.gridy = 10;
		pagina02Simulacion_clasificacion.add(lblPG_07, gbc_lblPG_07);
		
		JLabel lblPE_07 = new JLabel("");
		GridBagConstraints gbc_lblPE_07 = new GridBagConstraints();
		gbc_lblPE_07.insets = new Insets(0, 0, 5, 5);
		gbc_lblPE_07.gridx = 8;
		gbc_lblPE_07.gridy = 10;
		pagina02Simulacion_clasificacion.add(lblPE_07, gbc_lblPE_07);
		
		JLabel lblPP_07 = new JLabel("");
		GridBagConstraints gbc_lblPP_07 = new GridBagConstraints();
		gbc_lblPP_07.insets = new Insets(0, 0, 5, 5);
		gbc_lblPP_07.gridx = 9;
		gbc_lblPP_07.gridy = 10;
		pagina02Simulacion_clasificacion.add(lblPP_07, gbc_lblPP_07);
		
		JLabel lblGF_07 = new JLabel("");
		GridBagConstraints gbc_lblGF_07 = new GridBagConstraints();
		gbc_lblGF_07.insets = new Insets(0, 0, 5, 5);
		gbc_lblGF_07.gridx = 10;
		gbc_lblGF_07.gridy = 10;
		pagina02Simulacion_clasificacion.add(lblGF_07, gbc_lblGF_07);
		
		JLabel lblGC_07 = new JLabel("");
		GridBagConstraints gbc_lblGC_07 = new GridBagConstraints();
		gbc_lblGC_07.insets = new Insets(0, 0, 5, 5);
		gbc_lblGC_07.gridx = 11;
		gbc_lblGC_07.gridy = 10;
		pagina02Simulacion_clasificacion.add(lblGC_07, gbc_lblGC_07);
		
		JLabel lblDG_07 = new JLabel("");
		GridBagConstraints gbc_lblDG_07 = new GridBagConstraints();
		gbc_lblDG_07.insets = new Insets(0, 0, 5, 5);
		gbc_lblDG_07.gridx = 12;
		gbc_lblDG_07.gridy = 10;
		pagina02Simulacion_clasificacion.add(lblDG_07, gbc_lblDG_07);
		
		JLabel lblPosicion_08 = new JLabel("8");
		GridBagConstraints gbc_lblPosicion_08 = new GridBagConstraints();
		gbc_lblPosicion_08.insets = new Insets(0, 0, 5, 5);
		gbc_lblPosicion_08.gridx = 2;
		gbc_lblPosicion_08.gridy = 11;
		pagina02Simulacion_clasificacion.add(lblPosicion_08, gbc_lblPosicion_08);
		
		JLabel lblEscudos_08 = new JLabel("");
		lblEscudos_08.setIcon(new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/getafe.png")));
		lblEscudos_08.setBounds(136, 29, 163, 119);
		pagina02Simulacion_clasificacion.add(lblEscudos_08);

		ImageIcon iconoEscudo_08 = new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/getafe.png"));
		Image imagenEscudo_08 = iconoEscudo_08.getImage().getScaledInstance(30, 25, Image.SCALE_SMOOTH);
		ImageIcon iconoAjustado_08 = new ImageIcon(imagenEscudo_08); 
		lblEscudos_08.setIcon(iconoAjustado_08);

		GridBagConstraints gbc_lblEscudos_08 = new GridBagConstraints();
		gbc_lblEscudos_08.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscudos_08.gridx = 3;
		gbc_lblEscudos_08.gridy = 11;
		pagina02Simulacion_clasificacion.add(lblEscudos_08, gbc_lblEscudos_08);
		
		JLabel lblEquipo_08 = new JLabel("");
		GridBagConstraints gbc_lblEquipo_08 = new GridBagConstraints();
		gbc_lblEquipo_08.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo_08.gridx = 4;
		gbc_lblEquipo_08.gridy = 11;
		pagina02Simulacion_clasificacion.add(lblEquipo_08, gbc_lblEquipo_08);
		
		JLabel lblPuntos_08 = new JLabel("");
		GridBagConstraints gbc_lblPuntos_08 = new GridBagConstraints();
		gbc_lblPuntos_08.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuntos_08.gridx = 5;
		gbc_lblPuntos_08.gridy = 11;
		pagina02Simulacion_clasificacion.add(lblPuntos_08, gbc_lblPuntos_08);
		
		JLabel lblPJ_08 = new JLabel("");
		GridBagConstraints gbc_lblPJ_08 = new GridBagConstraints();
		gbc_lblPJ_08.insets = new Insets(0, 0, 5, 5);
		gbc_lblPJ_08.gridx = 6;
		gbc_lblPJ_08.gridy = 11;
		pagina02Simulacion_clasificacion.add(lblPJ_08, gbc_lblPJ_08);
		
		JLabel lblPG_08 = new JLabel("");
		GridBagConstraints gbc_lblPG_08 = new GridBagConstraints();
		gbc_lblPG_08.insets = new Insets(0, 0, 5, 5);
		gbc_lblPG_08.gridx = 7;
		gbc_lblPG_08.gridy = 11;
		pagina02Simulacion_clasificacion.add(lblPG_08, gbc_lblPG_08);
		
		JLabel lblPE_08 = new JLabel("");
		GridBagConstraints gbc_lblPE_08 = new GridBagConstraints();
		gbc_lblPE_08.insets = new Insets(0, 0, 5, 5);
		gbc_lblPE_08.gridx = 8;
		gbc_lblPE_08.gridy = 11;
		pagina02Simulacion_clasificacion.add(lblPE_08, gbc_lblPE_08);
		
		JLabel lblPP_08 = new JLabel("");
		GridBagConstraints gbc_lblPP_08 = new GridBagConstraints();
		gbc_lblPP_08.insets = new Insets(0, 0, 5, 5);
		gbc_lblPP_08.gridx = 9;
		gbc_lblPP_08.gridy = 11;
		pagina02Simulacion_clasificacion.add(lblPP_08, gbc_lblPP_08);
		
		JLabel lblGF_08 = new JLabel("");
		GridBagConstraints gbc_lblGF_08 = new GridBagConstraints();
		gbc_lblGF_08.insets = new Insets(0, 0, 5, 5);
		gbc_lblGF_08.gridx = 10;
		gbc_lblGF_08.gridy = 11;
		pagina02Simulacion_clasificacion.add(lblGF_08, gbc_lblGF_08);
		
		JLabel lblGC_08 = new JLabel("");
		GridBagConstraints gbc_lblGC_08 = new GridBagConstraints();
		gbc_lblGC_08.insets = new Insets(0, 0, 5, 5);
		gbc_lblGC_08.gridx = 11;
		gbc_lblGC_08.gridy = 11;
		pagina02Simulacion_clasificacion.add(lblGC_08, gbc_lblGC_08);
		
		JLabel lblDG_08 = new JLabel("");
		GridBagConstraints gbc_lblDG_08 = new GridBagConstraints();
		gbc_lblDG_08.insets = new Insets(0, 0, 5, 5);
		gbc_lblDG_08.gridx = 12;
		gbc_lblDG_08.gridy = 11;
		pagina02Simulacion_clasificacion.add(lblDG_08, gbc_lblDG_08);
		
		JLabel lblPosicion_09 = new JLabel("9");
		GridBagConstraints gbc_lblPosicion_09 = new GridBagConstraints();
		gbc_lblPosicion_09.insets = new Insets(0, 0, 5, 5);
		gbc_lblPosicion_09.gridx = 2;
		gbc_lblPosicion_09.gridy = 12;
		pagina02Simulacion_clasificacion.add(lblPosicion_09, gbc_lblPosicion_09);
		
		JLabel lblEscudos_09 = new JLabel("");
		lblEscudos_09.setIcon(new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/girona.png")));
		lblEscudos_09.setBounds(136, 29, 163, 119);
		pagina02Simulacion_clasificacion.add(lblEscudos_09);

		ImageIcon iconoEscudo_09 = new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/girona.png"));
		Image imagenEscudo_09 = iconoEscudo_09.getImage().getScaledInstance(30, 25, Image.SCALE_SMOOTH);
		ImageIcon iconoAjustado_09 = new ImageIcon(imagenEscudo_09); 
		lblEscudos_09.setIcon(iconoAjustado_09);

		GridBagConstraints gbc_lblEscudos_09 = new GridBagConstraints();
		gbc_lblEscudos_09.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscudos_09.gridx = 3;
		gbc_lblEscudos_09.gridy = 12;
		pagina02Simulacion_clasificacion.add(lblEscudos_09, gbc_lblEscudos_09);
		
		JLabel lblEquipo_09 = new JLabel("");
		GridBagConstraints gbc_lblEquipo_09 = new GridBagConstraints();
		gbc_lblEquipo_09.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo_09.gridx = 4;
		gbc_lblEquipo_09.gridy = 12;
		pagina02Simulacion_clasificacion.add(lblEquipo_09, gbc_lblEquipo_09);
		
		JLabel lblPuntos_09 = new JLabel("");
		GridBagConstraints gbc_lblPuntos_09 = new GridBagConstraints();
		gbc_lblPuntos_09.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuntos_09.gridx = 5;
		gbc_lblPuntos_09.gridy = 12;
		pagina02Simulacion_clasificacion.add(lblPuntos_09, gbc_lblPuntos_09);
		
		JLabel lblPJ_09 = new JLabel("");
		GridBagConstraints gbc_lblPJ_09 = new GridBagConstraints();
		gbc_lblPJ_09.insets = new Insets(0, 0, 5, 5);
		gbc_lblPJ_09.gridx = 6;
		gbc_lblPJ_09.gridy = 12;
		pagina02Simulacion_clasificacion.add(lblPJ_09, gbc_lblPJ_09);
		
		JLabel lblPG_09 = new JLabel("");
		GridBagConstraints gbc_lblPG_09 = new GridBagConstraints();
		gbc_lblPG_09.insets = new Insets(0, 0, 5, 5);
		gbc_lblPG_09.gridx = 7;
		gbc_lblPG_09.gridy = 12;
		pagina02Simulacion_clasificacion.add(lblPG_09, gbc_lblPG_09);
		
		JLabel lblPE_09 = new JLabel("");
		GridBagConstraints gbc_lblPE_09 = new GridBagConstraints();
		gbc_lblPE_09.insets = new Insets(0, 0, 5, 5);
		gbc_lblPE_09.gridx = 8;
		gbc_lblPE_09.gridy = 12;
		pagina02Simulacion_clasificacion.add(lblPE_09, gbc_lblPE_09);
		
		JLabel lblPP_09 = new JLabel("");
		GridBagConstraints gbc_lblPP_09 = new GridBagConstraints();
		gbc_lblPP_09.insets = new Insets(0, 0, 5, 5);
		gbc_lblPP_09.gridx = 9;
		gbc_lblPP_09.gridy = 12;
		pagina02Simulacion_clasificacion.add(lblPP_09, gbc_lblPP_09);
		
		JLabel lblGF_09 = new JLabel("");
		GridBagConstraints gbc_lblGF_09 = new GridBagConstraints();
		gbc_lblGF_09.insets = new Insets(0, 0, 5, 5);
		gbc_lblGF_09.gridx = 10;
		gbc_lblGF_09.gridy = 12;
		pagina02Simulacion_clasificacion.add(lblGF_09, gbc_lblGF_09);
		
		JLabel lblGC_09 = new JLabel("");
		GridBagConstraints gbc_lblGC_09 = new GridBagConstraints();
		gbc_lblGC_09.insets = new Insets(0, 0, 5, 5);
		gbc_lblGC_09.gridx = 11;
		gbc_lblGC_09.gridy = 12;
		pagina02Simulacion_clasificacion.add(lblGC_09, gbc_lblGC_09);
		
		JLabel lblDG_09 = new JLabel("");
		GridBagConstraints gbc_lblDG_09 = new GridBagConstraints();
		gbc_lblDG_09.insets = new Insets(0, 0, 5, 5);
		gbc_lblDG_09.gridx = 12;
		gbc_lblDG_09.gridy = 12;
		pagina02Simulacion_clasificacion.add(lblDG_09, gbc_lblDG_09);
		
		JLabel lblPosicion_10 = new JLabel("10");
		GridBagConstraints gbc_lblPosicion_10 = new GridBagConstraints();
		gbc_lblPosicion_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblPosicion_10.gridx = 2;
		gbc_lblPosicion_10.gridy = 13;
		pagina02Simulacion_clasificacion.add(lblPosicion_10, gbc_lblPosicion_10);
		
		JLabel lblEscudos_10 = new JLabel("");
		lblEscudos_10.setIcon(new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/las_palmas.png")));
		lblEscudos_10.setBounds(136, 29, 163, 119);
		pagina02Simulacion_clasificacion.add(lblEscudos_10);

		ImageIcon iconoEscudo_10 = new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/las_palmas.png"));
		Image imagenEscudo_10 = iconoEscudo_10.getImage().getScaledInstance(30, 25, Image.SCALE_SMOOTH);
		ImageIcon iconoAjustado_10 = new ImageIcon(imagenEscudo_10); 
		lblEscudos_10.setIcon(iconoAjustado_10);

		GridBagConstraints gbc_lblEscudos_10 = new GridBagConstraints();
		gbc_lblEscudos_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscudos_10.gridx = 3;
		gbc_lblEscudos_10.gridy = 13;
		pagina02Simulacion_clasificacion.add(lblEscudos_10, gbc_lblEscudos_10);
		
		JLabel lblEquipo_10 = new JLabel("");
		GridBagConstraints gbc_lblEquipo_10 = new GridBagConstraints();
		gbc_lblEquipo_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo_10.gridx = 4;
		gbc_lblEquipo_10.gridy = 13;
		pagina02Simulacion_clasificacion.add(lblEquipo_10, gbc_lblEquipo_10);
		
		JLabel lblPuntos_10 = new JLabel("");
		GridBagConstraints gbc_lblPuntos_10 = new GridBagConstraints();
		gbc_lblPuntos_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuntos_10.gridx = 5;
		gbc_lblPuntos_10.gridy = 13;
		pagina02Simulacion_clasificacion.add(lblPuntos_10, gbc_lblPuntos_10);
		
		JLabel lblPJ_10 = new JLabel("");
		GridBagConstraints gbc_lblPJ_10 = new GridBagConstraints();
		gbc_lblPJ_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblPJ_10.gridx = 6;
		gbc_lblPJ_10.gridy = 13;
		pagina02Simulacion_clasificacion.add(lblPJ_10, gbc_lblPJ_10);
		
		JLabel lblPG_10 = new JLabel("");
		GridBagConstraints gbc_lblPG_10 = new GridBagConstraints();
		gbc_lblPG_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblPG_10.gridx = 7;
		gbc_lblPG_10.gridy = 13;
		pagina02Simulacion_clasificacion.add(lblPG_10, gbc_lblPG_10);
		
		JLabel lblPE_10 = new JLabel("");
		GridBagConstraints gbc_lblPE_10 = new GridBagConstraints();
		gbc_lblPE_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblPE_10.gridx = 8;
		gbc_lblPE_10.gridy = 13;
		pagina02Simulacion_clasificacion.add(lblPE_10, gbc_lblPE_10);
		
		JLabel lblPP_10 = new JLabel("");
		GridBagConstraints gbc_lblPP_10 = new GridBagConstraints();
		gbc_lblPP_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblPP_10.gridx = 9;
		gbc_lblPP_10.gridy = 13;
		pagina02Simulacion_clasificacion.add(lblPP_10, gbc_lblPP_10);
		
		JLabel lblGF_10 = new JLabel("");
		GridBagConstraints gbc_lblGF_10 = new GridBagConstraints();
		gbc_lblGF_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblGF_10.gridx = 10;
		gbc_lblGF_10.gridy = 13;
		pagina02Simulacion_clasificacion.add(lblGF_10, gbc_lblGF_10);
		
		JLabel lblGC_10 = new JLabel("");
		GridBagConstraints gbc_lblGC_10 = new GridBagConstraints();
		gbc_lblGC_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblGC_10.gridx = 11;
		gbc_lblGC_10.gridy = 13;
		pagina02Simulacion_clasificacion.add(lblGC_10, gbc_lblGC_10);
		
		JLabel lblDG_10 = new JLabel("");
		GridBagConstraints gbc_lblDG_10 = new GridBagConstraints();
		gbc_lblDG_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblDG_10.gridx = 12;
		gbc_lblDG_10.gridy = 13;
		pagina02Simulacion_clasificacion.add(lblDG_10, gbc_lblDG_10);
		
		JLabel lblPosicion_11 = new JLabel("11");
		GridBagConstraints gbc_lblPosicion_11 = new GridBagConstraints();
		gbc_lblPosicion_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblPosicion_11.gridx = 2;
		gbc_lblPosicion_11.gridy = 14;
		pagina02Simulacion_clasificacion.add(lblPosicion_11, gbc_lblPosicion_11);
		
		JLabel lblEscudos_11 = new JLabel("");
		lblEscudos_11.setIcon(new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/leganes.png")));
		lblEscudos_11.setBounds(136, 29, 163, 119);
		pagina02Simulacion_clasificacion.add(lblEscudos_11);

		ImageIcon iconoEscudo_11 = new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/leganes.png"));
		Image imagenEscudo_11 = iconoEscudo_11.getImage().getScaledInstance(30, 25, Image.SCALE_SMOOTH);
		ImageIcon iconoAjustado_11 = new ImageIcon(imagenEscudo_11); 
		lblEscudos_11.setIcon(iconoAjustado_11);

		GridBagConstraints gbc_lblEscudos_11 = new GridBagConstraints();
		gbc_lblEscudos_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscudos_11.gridx = 3;
		gbc_lblEscudos_11.gridy = 14;
		pagina02Simulacion_clasificacion.add(lblEscudos_11, gbc_lblEscudos_11);
		
		JLabel lblEquipo_11 = new JLabel("");
		GridBagConstraints gbc_lblEquipo_11 = new GridBagConstraints();
		gbc_lblEquipo_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo_11.gridx = 4;
		gbc_lblEquipo_11.gridy = 14;
		pagina02Simulacion_clasificacion.add(lblEquipo_11, gbc_lblEquipo_11);
		
		JLabel lblPuntos_11 = new JLabel("");
		GridBagConstraints gbc_lblPuntos_11 = new GridBagConstraints();
		gbc_lblPuntos_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuntos_11.gridx = 5;
		gbc_lblPuntos_11.gridy = 14;
		pagina02Simulacion_clasificacion.add(lblPuntos_11, gbc_lblPuntos_11);
		
		JLabel lblPJ_11 = new JLabel("");
		GridBagConstraints gbc_lblPJ_11 = new GridBagConstraints();
		gbc_lblPJ_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblPJ_11.gridx = 6;
		gbc_lblPJ_11.gridy = 14;
		pagina02Simulacion_clasificacion.add(lblPJ_11, gbc_lblPJ_11);
		
		JLabel lblPG_11 = new JLabel("");
		GridBagConstraints gbc_lblPG_11 = new GridBagConstraints();
		gbc_lblPG_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblPG_11.gridx = 7;
		gbc_lblPG_11.gridy = 14;
		pagina02Simulacion_clasificacion.add(lblPG_11, gbc_lblPG_11);
		
		JLabel lblPE_11 = new JLabel("");
		GridBagConstraints gbc_lblPE_11 = new GridBagConstraints();
		gbc_lblPE_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblPE_11.gridx = 8;
		gbc_lblPE_11.gridy = 14;
		pagina02Simulacion_clasificacion.add(lblPE_11, gbc_lblPE_11);
		
		JLabel lblPP_11 = new JLabel("");
		GridBagConstraints gbc_lblPP_11 = new GridBagConstraints();
		gbc_lblPP_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblPP_11.gridx = 9;
		gbc_lblPP_11.gridy = 14;
		pagina02Simulacion_clasificacion.add(lblPP_11, gbc_lblPP_11);
		
		JLabel lblGF_11 = new JLabel("");
		GridBagConstraints gbc_lblGF_11 = new GridBagConstraints();
		gbc_lblGF_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblGF_11.gridx = 10;
		gbc_lblGF_11.gridy = 14;
		pagina02Simulacion_clasificacion.add(lblGF_11, gbc_lblGF_11);
		
		JLabel lblGC_11 = new JLabel("");
		GridBagConstraints gbc_lblGC_11 = new GridBagConstraints();
		gbc_lblGC_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblGC_11.gridx = 11;
		gbc_lblGC_11.gridy = 14;
		pagina02Simulacion_clasificacion.add(lblGC_11, gbc_lblGC_11);
		
		JLabel lblDG_11 = new JLabel("");
		GridBagConstraints gbc_lblDG_11 = new GridBagConstraints();
		gbc_lblDG_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblDG_11.gridx = 12;
		gbc_lblDG_11.gridy = 14;
		pagina02Simulacion_clasificacion.add(lblDG_11, gbc_lblDG_11);
		
		JLabel lblPosicion_12 = new JLabel("12");
		GridBagConstraints gbc_lblPosicion_12 = new GridBagConstraints();
		gbc_lblPosicion_12.insets = new Insets(0, 0, 5, 5);
		gbc_lblPosicion_12.gridx = 2;
		gbc_lblPosicion_12.gridy = 15;
		pagina02Simulacion_clasificacion.add(lblPosicion_12, gbc_lblPosicion_12);
		
		JLabel lblEscudos_12 = new JLabel("");
		lblEscudos_12.setIcon(new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/mallorca.png")));
		lblEscudos_12.setBounds(136, 29, 163, 119);
		pagina02Simulacion_clasificacion.add(lblEscudos_12);

		ImageIcon iconoEscudo_12 = new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/mallorca.png"));
		Image imagenEscudo_12 = iconoEscudo_12.getImage().getScaledInstance(30, 25, Image.SCALE_SMOOTH);
		ImageIcon iconoAjustado_12 = new ImageIcon(imagenEscudo_12); 
		lblEscudos_12.setIcon(iconoAjustado_12);

		GridBagConstraints gbc_lblEscudos_12 = new GridBagConstraints();
		gbc_lblEscudos_12.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscudos_12.gridx = 3;
		gbc_lblEscudos_12.gridy = 15;
		pagina02Simulacion_clasificacion.add(lblEscudos_12, gbc_lblEscudos_12);
		
		JLabel lblEquipo_12 = new JLabel("");
		GridBagConstraints gbc_lblEquipo_12 = new GridBagConstraints();
		gbc_lblEquipo_12.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo_12.gridx = 4;
		gbc_lblEquipo_12.gridy = 15;
		pagina02Simulacion_clasificacion.add(lblEquipo_12, gbc_lblEquipo_12);
		
		JLabel lblPuntos_12 = new JLabel("");
		GridBagConstraints gbc_lblPuntos_12 = new GridBagConstraints();
		gbc_lblPuntos_12.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuntos_12.gridx = 5;
		gbc_lblPuntos_12.gridy = 15;
		pagina02Simulacion_clasificacion.add(lblPuntos_12, gbc_lblPuntos_12);
		
		JLabel lblPJ_12 = new JLabel("");
		GridBagConstraints gbc_lblPJ_12 = new GridBagConstraints();
		gbc_lblPJ_12.insets = new Insets(0, 0, 5, 5);
		gbc_lblPJ_12.gridx = 6;
		gbc_lblPJ_12.gridy = 15;
		pagina02Simulacion_clasificacion.add(lblPJ_12, gbc_lblPJ_12);
		
		JLabel lblPG_12 = new JLabel("");
		GridBagConstraints gbc_lblPG_12 = new GridBagConstraints();
		gbc_lblPG_12.insets = new Insets(0, 0, 5, 5);
		gbc_lblPG_12.gridx = 7;
		gbc_lblPG_12.gridy = 15;
		pagina02Simulacion_clasificacion.add(lblPG_12, gbc_lblPG_12);
		
		JLabel lblPE_12 = new JLabel("");
		GridBagConstraints gbc_lblPE_12 = new GridBagConstraints();
		gbc_lblPE_12.insets = new Insets(0, 0, 5, 5);
		gbc_lblPE_12.gridx = 8;
		gbc_lblPE_12.gridy = 15;
		pagina02Simulacion_clasificacion.add(lblPE_12, gbc_lblPE_12);
		
		JLabel lblPP_12 = new JLabel("");
		GridBagConstraints gbc_lblPP_12 = new GridBagConstraints();
		gbc_lblPP_12.insets = new Insets(0, 0, 5, 5);
		gbc_lblPP_12.gridx = 9;
		gbc_lblPP_12.gridy = 15;
		pagina02Simulacion_clasificacion.add(lblPP_12, gbc_lblPP_12);
		
		JLabel lblGF_12 = new JLabel("");
		GridBagConstraints gbc_lblGF_12 = new GridBagConstraints();
		gbc_lblGF_12.insets = new Insets(0, 0, 5, 5);
		gbc_lblGF_12.gridx = 10;
		gbc_lblGF_12.gridy = 15;
		pagina02Simulacion_clasificacion.add(lblGF_12, gbc_lblGF_12);
		
		JLabel lblGC_12 = new JLabel("");
		GridBagConstraints gbc_lblGC_12 = new GridBagConstraints();
		gbc_lblGC_12.insets = new Insets(0, 0, 5, 5);
		gbc_lblGC_12.gridx = 11;
		gbc_lblGC_12.gridy = 15;
		pagina02Simulacion_clasificacion.add(lblGC_12, gbc_lblGC_12);
		
		JLabel lblDG_12 = new JLabel("");
		GridBagConstraints gbc_lblDG_12 = new GridBagConstraints();
		gbc_lblDG_12.insets = new Insets(0, 0, 5, 5);
		gbc_lblDG_12.gridx = 12;
		gbc_lblDG_12.gridy = 15;
		pagina02Simulacion_clasificacion.add(lblDG_12, gbc_lblDG_12);
		
		JLabel lblPosicion_13 = new JLabel("13");
		GridBagConstraints gbc_lblPosicion_13 = new GridBagConstraints();
		gbc_lblPosicion_13.insets = new Insets(0, 0, 5, 5);
		gbc_lblPosicion_13.gridx = 2;
		gbc_lblPosicion_13.gridy = 16;
		pagina02Simulacion_clasificacion.add(lblPosicion_13, gbc_lblPosicion_13);
		
		JLabel lblEscudos_13 = new JLabel("");
		lblEscudos_13.setIcon(new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/osasuna.png")));
		lblEscudos_13.setBounds(136, 29, 163, 119);
		pagina02Simulacion_clasificacion.add(lblEscudos_13);

		ImageIcon iconoEscudo_13 = new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/osasuna.png"));
		Image imagenEscudo_13 = iconoEscudo_13.getImage().getScaledInstance(30, 25, Image.SCALE_SMOOTH);
		ImageIcon iconoAjustado_13 = new ImageIcon(imagenEscudo_13); 
		lblEscudos_13.setIcon(iconoAjustado_13);

		GridBagConstraints gbc_lblEscudos_13 = new GridBagConstraints();
		gbc_lblEscudos_13.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscudos_13.gridx = 3;
		gbc_lblEscudos_13.gridy = 16;
		pagina02Simulacion_clasificacion.add(lblEscudos_13, gbc_lblEscudos_13);
		
		JLabel lblEquipo_13 = new JLabel("");
		GridBagConstraints gbc_lblEquipo_13 = new GridBagConstraints();
		gbc_lblEquipo_13.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo_13.gridx = 4;
		gbc_lblEquipo_13.gridy = 16;
		pagina02Simulacion_clasificacion.add(lblEquipo_13, gbc_lblEquipo_13);
		
		JLabel lblPuntos_13 = new JLabel("");
		GridBagConstraints gbc_lblPuntos_13 = new GridBagConstraints();
		gbc_lblPuntos_13.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuntos_13.gridx = 5;
		gbc_lblPuntos_13.gridy = 16;
		pagina02Simulacion_clasificacion.add(lblPuntos_13, gbc_lblPuntos_13);
		
		JLabel lblPJ_13 = new JLabel("");
		GridBagConstraints gbc_lblPJ_13 = new GridBagConstraints();
		gbc_lblPJ_13.insets = new Insets(0, 0, 5, 5);
		gbc_lblPJ_13.gridx = 6;
		gbc_lblPJ_13.gridy = 16;
		pagina02Simulacion_clasificacion.add(lblPJ_13, gbc_lblPJ_13);
		
		JLabel lblPG_13 = new JLabel("");
		GridBagConstraints gbc_lblPG_13 = new GridBagConstraints();
		gbc_lblPG_13.insets = new Insets(0, 0, 5, 5);
		gbc_lblPG_13.gridx = 7;
		gbc_lblPG_13.gridy = 16;
		pagina02Simulacion_clasificacion.add(lblPG_13, gbc_lblPG_13);
		
		JLabel lblPE_13 = new JLabel("");
		GridBagConstraints gbc_lblPE_13 = new GridBagConstraints();
		gbc_lblPE_13.insets = new Insets(0, 0, 5, 5);
		gbc_lblPE_13.gridx = 8;
		gbc_lblPE_13.gridy = 16;
		pagina02Simulacion_clasificacion.add(lblPE_13, gbc_lblPE_13);
		
		JLabel lblPP_13 = new JLabel("");
		GridBagConstraints gbc_lblPP_13 = new GridBagConstraints();
		gbc_lblPP_13.insets = new Insets(0, 0, 5, 5);
		gbc_lblPP_13.gridx = 9;
		gbc_lblPP_13.gridy = 16;
		pagina02Simulacion_clasificacion.add(lblPP_13, gbc_lblPP_13);
		
		JLabel lblGF_13 = new JLabel("");
		GridBagConstraints gbc_lblGF_13 = new GridBagConstraints();
		gbc_lblGF_13.insets = new Insets(0, 0, 5, 5);
		gbc_lblGF_13.gridx = 10;
		gbc_lblGF_13.gridy = 16;
		pagina02Simulacion_clasificacion.add(lblGF_13, gbc_lblGF_13);
		
		JLabel lblGC_13 = new JLabel("");
		GridBagConstraints gbc_lblGC_13 = new GridBagConstraints();
		gbc_lblGC_13.insets = new Insets(0, 0, 5, 5);
		gbc_lblGC_13.gridx = 11;
		gbc_lblGC_13.gridy = 16;
		pagina02Simulacion_clasificacion.add(lblGC_13, gbc_lblGC_13);
		
		JLabel lblDG_13 = new JLabel("");
		GridBagConstraints gbc_lblDG_13 = new GridBagConstraints();
		gbc_lblDG_13.insets = new Insets(0, 0, 5, 5);
		gbc_lblDG_13.gridx = 12;
		gbc_lblDG_13.gridy = 16;
		pagina02Simulacion_clasificacion.add(lblDG_13, gbc_lblDG_13);
		
		JLabel lblPosicion_14 = new JLabel("14");
		GridBagConstraints gbc_lblPosicion_14 = new GridBagConstraints();
		gbc_lblPosicion_14.insets = new Insets(0, 0, 5, 5);
		gbc_lblPosicion_14.gridx = 2;
		gbc_lblPosicion_14.gridy = 17;
		pagina02Simulacion_clasificacion.add(lblPosicion_14, gbc_lblPosicion_14);
		
		JLabel lblEscudos_14 = new JLabel("");
		lblEscudos_14.setIcon(new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/rayo.png")));
		lblEscudos_14.setBounds(136, 29, 163, 119);
		pagina02Simulacion_clasificacion.add(lblEscudos_14);

		ImageIcon iconoEscudo_14 = new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/rayo.png"));
		Image imagenEscudo_14 = iconoEscudo_14.getImage().getScaledInstance(30, 25, Image.SCALE_SMOOTH);
		ImageIcon iconoAjustado_14 = new ImageIcon(imagenEscudo_14); 
		lblEscudos_14.setIcon(iconoAjustado_14);

		GridBagConstraints gbc_lblEscudos_14 = new GridBagConstraints();
		gbc_lblEscudos_14.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscudos_14.gridx = 3;
		gbc_lblEscudos_14.gridy = 17;
		pagina02Simulacion_clasificacion.add(lblEscudos_14, gbc_lblEscudos_14);
		
		JLabel lblEquipo_14 = new JLabel("");
		GridBagConstraints gbc_lblEquipo_14 = new GridBagConstraints();
		gbc_lblEquipo_14.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo_14.gridx = 4;
		gbc_lblEquipo_14.gridy = 17;
		pagina02Simulacion_clasificacion.add(lblEquipo_14, gbc_lblEquipo_14);
		
		JLabel lblPuntos_14 = new JLabel("");
		GridBagConstraints gbc_lblPuntos_14 = new GridBagConstraints();
		gbc_lblPuntos_14.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuntos_14.gridx = 5;
		gbc_lblPuntos_14.gridy = 17;
		pagina02Simulacion_clasificacion.add(lblPuntos_14, gbc_lblPuntos_14);
		
		JLabel lblPJ_14 = new JLabel("");
		GridBagConstraints gbc_lblPJ_14 = new GridBagConstraints();
		gbc_lblPJ_14.insets = new Insets(0, 0, 5, 5);
		gbc_lblPJ_14.gridx = 6;
		gbc_lblPJ_14.gridy = 17;
		pagina02Simulacion_clasificacion.add(lblPJ_14, gbc_lblPJ_14);
		
		JLabel lblPG_14 = new JLabel("");
		GridBagConstraints gbc_lblPG_14 = new GridBagConstraints();
		gbc_lblPG_14.insets = new Insets(0, 0, 5, 5);
		gbc_lblPG_14.gridx = 7;
		gbc_lblPG_14.gridy = 17;
		pagina02Simulacion_clasificacion.add(lblPG_14, gbc_lblPG_14);
		
		JLabel lblPE_14 = new JLabel("");
		GridBagConstraints gbc_lblPE_14 = new GridBagConstraints();
		gbc_lblPE_14.insets = new Insets(0, 0, 5, 5);
		gbc_lblPE_14.gridx = 8;
		gbc_lblPE_14.gridy = 17;
		pagina02Simulacion_clasificacion.add(lblPE_14, gbc_lblPE_14);
		
		JLabel lblPP_14 = new JLabel("");
		GridBagConstraints gbc_lblPP_14 = new GridBagConstraints();
		gbc_lblPP_14.insets = new Insets(0, 0, 5, 5);
		gbc_lblPP_14.gridx = 9;
		gbc_lblPP_14.gridy = 17;
		pagina02Simulacion_clasificacion.add(lblPP_14, gbc_lblPP_14);
		
		JLabel lblGF_14 = new JLabel("");
		GridBagConstraints gbc_lblGF_14 = new GridBagConstraints();
		gbc_lblGF_14.insets = new Insets(0, 0, 5, 5);
		gbc_lblGF_14.gridx = 10;
		gbc_lblGF_14.gridy = 17;
		pagina02Simulacion_clasificacion.add(lblGF_14, gbc_lblGF_14);
		
		JLabel lblGC_14 = new JLabel("");
		GridBagConstraints gbc_lblGC_14 = new GridBagConstraints();
		gbc_lblGC_14.insets = new Insets(0, 0, 5, 5);
		gbc_lblGC_14.gridx = 11;
		gbc_lblGC_14.gridy = 17;
		pagina02Simulacion_clasificacion.add(lblGC_14, gbc_lblGC_14);
		
		JLabel lblDG_14 = new JLabel("");
		GridBagConstraints gbc_lblDG_14 = new GridBagConstraints();
		gbc_lblDG_14.insets = new Insets(0, 0, 5, 5);
		gbc_lblDG_14.gridx = 12;
		gbc_lblDG_14.gridy = 17;
		pagina02Simulacion_clasificacion.add(lblDG_14, gbc_lblDG_14);
		
		JLabel lblPosicion_15 = new JLabel("15");
		GridBagConstraints gbc_lblPosicion_15 = new GridBagConstraints();
		gbc_lblPosicion_15.insets = new Insets(0, 0, 5, 5);
		gbc_lblPosicion_15.gridx = 2;
		gbc_lblPosicion_15.gridy = 18;
		pagina02Simulacion_clasificacion.add(lblPosicion_15, gbc_lblPosicion_15);
		
		JLabel lblEscudos_15 = new JLabel("");
		lblEscudos_15.setIcon(new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/real_madrid.png")));
		lblEscudos_15.setBounds(136, 29, 163, 119);
		pagina02Simulacion_clasificacion.add(lblEscudos_15);

		ImageIcon iconoEscudo_15 = new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/real_madrid.png"));
		Image imagenEscudo_15 = iconoEscudo_15.getImage().getScaledInstance(30, 25, Image.SCALE_SMOOTH);
		ImageIcon iconoAjustado_15 = new ImageIcon(imagenEscudo_15); 
		lblEscudos_15.setIcon(iconoAjustado_15);

		GridBagConstraints gbc_lblEscudos_15 = new GridBagConstraints();
		gbc_lblEscudos_15.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscudos_15.gridx = 3;
		gbc_lblEscudos_15.gridy = 18;
		pagina02Simulacion_clasificacion.add(lblEscudos_15, gbc_lblEscudos_15);
		
		JLabel lblEquipo_15 = new JLabel("");
		GridBagConstraints gbc_lblEquipo_15 = new GridBagConstraints();
		gbc_lblEquipo_15.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo_15.gridx = 4;
		gbc_lblEquipo_15.gridy = 18;
		pagina02Simulacion_clasificacion.add(lblEquipo_15, gbc_lblEquipo_15);
		
		JLabel lblPuntos_15 = new JLabel("");
		GridBagConstraints gbc_lblPuntos_15 = new GridBagConstraints();
		gbc_lblPuntos_15.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuntos_15.gridx = 5;
		gbc_lblPuntos_15.gridy = 18;
		pagina02Simulacion_clasificacion.add(lblPuntos_15, gbc_lblPuntos_15);
		
		JLabel lblPJ_15 = new JLabel("");
		GridBagConstraints gbc_lblPJ_15 = new GridBagConstraints();
		gbc_lblPJ_15.insets = new Insets(0, 0, 5, 5);
		gbc_lblPJ_15.gridx = 6;
		gbc_lblPJ_15.gridy = 18;
		pagina02Simulacion_clasificacion.add(lblPJ_15, gbc_lblPJ_15);
		
		JLabel lblPG_15 = new JLabel("");
		GridBagConstraints gbc_lblPG_15 = new GridBagConstraints();
		gbc_lblPG_15.insets = new Insets(0, 0, 5, 5);
		gbc_lblPG_15.gridx = 7;
		gbc_lblPG_15.gridy = 18;
		pagina02Simulacion_clasificacion.add(lblPG_15, gbc_lblPG_15);
		
		JLabel lblPE_15 = new JLabel("");
		GridBagConstraints gbc_lblPE_15 = new GridBagConstraints();
		gbc_lblPE_15.insets = new Insets(0, 0, 5, 5);
		gbc_lblPE_15.gridx = 8;
		gbc_lblPE_15.gridy = 18;
		pagina02Simulacion_clasificacion.add(lblPE_15, gbc_lblPE_15);
		
		JLabel lblPP_15 = new JLabel("");
		GridBagConstraints gbc_lblPP_15 = new GridBagConstraints();
		gbc_lblPP_15.insets = new Insets(0, 0, 5, 5);
		gbc_lblPP_15.gridx = 9;
		gbc_lblPP_15.gridy = 18;
		pagina02Simulacion_clasificacion.add(lblPP_15, gbc_lblPP_15);
		
		JLabel lblGF_15 = new JLabel("");
		GridBagConstraints gbc_lblGF_15 = new GridBagConstraints();
		gbc_lblGF_15.insets = new Insets(0, 0, 5, 5);
		gbc_lblGF_15.gridx = 10;
		gbc_lblGF_15.gridy = 18;
		pagina02Simulacion_clasificacion.add(lblGF_15, gbc_lblGF_15);
		
		JLabel lblGC_15 = new JLabel("");
		GridBagConstraints gbc_lblGC_15 = new GridBagConstraints();
		gbc_lblGC_15.insets = new Insets(0, 0, 5, 5);
		gbc_lblGC_15.gridx = 11;
		gbc_lblGC_15.gridy = 18;
		pagina02Simulacion_clasificacion.add(lblGC_15, gbc_lblGC_15);
		
		JLabel lblDG_15 = new JLabel("");
		GridBagConstraints gbc_lblDG_15 = new GridBagConstraints();
		gbc_lblDG_15.insets = new Insets(0, 0, 5, 5);
		gbc_lblDG_15.gridx = 12;
		gbc_lblDG_15.gridy = 18;
		pagina02Simulacion_clasificacion.add(lblDG_15, gbc_lblDG_15);
		
		JLabel lblPosicion_16 = new JLabel("16");
		GridBagConstraints gbc_lblPosicion_16 = new GridBagConstraints();
		gbc_lblPosicion_16.insets = new Insets(0, 0, 5, 5);
		gbc_lblPosicion_16.gridx = 2;
		gbc_lblPosicion_16.gridy = 19;
		pagina02Simulacion_clasificacion.add(lblPosicion_16, gbc_lblPosicion_16);
		
		JLabel lblEscudos_16 = new JLabel("");
		lblEscudos_16.setIcon(new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/real_sociedad.png")));
		lblEscudos_16.setBounds(136, 29, 163, 119);
		pagina02Simulacion_clasificacion.add(lblEscudos_16);

		ImageIcon iconoEscudo_16 = new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/real_sociedad.png"));
		Image imagenEscudo_16 = iconoEscudo_16.getImage().getScaledInstance(30, 25, Image.SCALE_SMOOTH);
		ImageIcon iconoAjustado_16 = new ImageIcon(imagenEscudo_16); 
		lblEscudos_16.setIcon(iconoAjustado_16);

		GridBagConstraints gbc_lblEscudos_16 = new GridBagConstraints();
		gbc_lblEscudos_16.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscudos_16.gridx = 3;
		gbc_lblEscudos_16.gridy = 19;
		pagina02Simulacion_clasificacion.add(lblEscudos_16, gbc_lblEscudos_16);
		
		JLabel lblEquipo_16 = new JLabel("");
		GridBagConstraints gbc_lblEquipo_16 = new GridBagConstraints();
		gbc_lblEquipo_16.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo_16.gridx = 4;
		gbc_lblEquipo_16.gridy = 19;
		pagina02Simulacion_clasificacion.add(lblEquipo_16, gbc_lblEquipo_16);
		
		JLabel lblPuntos_16 = new JLabel("");
		GridBagConstraints gbc_lblPuntos_16 = new GridBagConstraints();
		gbc_lblPuntos_16.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuntos_16.gridx = 5;
		gbc_lblPuntos_16.gridy = 19;
		pagina02Simulacion_clasificacion.add(lblPuntos_16, gbc_lblPuntos_16);
		
		JLabel lblPJ_16 = new JLabel("");
		GridBagConstraints gbc_lblPJ_16 = new GridBagConstraints();
		gbc_lblPJ_16.insets = new Insets(0, 0, 5, 5);
		gbc_lblPJ_16.gridx = 6;
		gbc_lblPJ_16.gridy = 19;
		pagina02Simulacion_clasificacion.add(lblPJ_16, gbc_lblPJ_16);
		
		JLabel lblPG_16 = new JLabel("");
		GridBagConstraints gbc_lblPG_16 = new GridBagConstraints();
		gbc_lblPG_16.insets = new Insets(0, 0, 5, 5);
		gbc_lblPG_16.gridx = 7;
		gbc_lblPG_16.gridy = 19;
		pagina02Simulacion_clasificacion.add(lblPG_16, gbc_lblPG_16);
		
		JLabel lblPE_16 = new JLabel("");
		GridBagConstraints gbc_lblPE_16 = new GridBagConstraints();
		gbc_lblPE_16.insets = new Insets(0, 0, 5, 5);
		gbc_lblPE_16.gridx = 8;
		gbc_lblPE_16.gridy = 19;
		pagina02Simulacion_clasificacion.add(lblPE_16, gbc_lblPE_16);
		
		JLabel lblPP_16 = new JLabel("");
		GridBagConstraints gbc_lblPP_16 = new GridBagConstraints();
		gbc_lblPP_16.insets = new Insets(0, 0, 5, 5);
		gbc_lblPP_16.gridx = 9;
		gbc_lblPP_16.gridy = 19;
		pagina02Simulacion_clasificacion.add(lblPP_16, gbc_lblPP_16);
		
		JLabel lblGF_16 = new JLabel("");
		GridBagConstraints gbc_lblGF_16 = new GridBagConstraints();
		gbc_lblGF_16.insets = new Insets(0, 0, 5, 5);
		gbc_lblGF_16.gridx = 10;
		gbc_lblGF_16.gridy = 19;
		pagina02Simulacion_clasificacion.add(lblGF_16, gbc_lblGF_16);
		
		JLabel lblGC_16 = new JLabel("");
		GridBagConstraints gbc_lblGC_16 = new GridBagConstraints();
		gbc_lblGC_16.insets = new Insets(0, 0, 5, 5);
		gbc_lblGC_16.gridx = 11;
		gbc_lblGC_16.gridy = 19;
		pagina02Simulacion_clasificacion.add(lblGC_16, gbc_lblGC_16);
		
		JLabel lblDG_16 = new JLabel("");
		GridBagConstraints gbc_lblDG_16 = new GridBagConstraints();
		gbc_lblDG_16.insets = new Insets(0, 0, 5, 5);
		gbc_lblDG_16.gridx = 12;
		gbc_lblDG_16.gridy = 19;
		pagina02Simulacion_clasificacion.add(lblDG_16, gbc_lblDG_16);
		
		JLabel lblPosicion_17 = new JLabel("17");
		GridBagConstraints gbc_lblPosicion_17 = new GridBagConstraints();
		gbc_lblPosicion_17.insets = new Insets(0, 0, 5, 5);
		gbc_lblPosicion_17.gridx = 2;
		gbc_lblPosicion_17.gridy = 20;
		pagina02Simulacion_clasificacion.add(lblPosicion_17, gbc_lblPosicion_17);
		
		JLabel lblEscudos_17 = new JLabel("");
		lblEscudos_17.setIcon(new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/sevilla.png")));
		lblEscudos_17.setBounds(136, 29, 163, 119);
		pagina02Simulacion_clasificacion.add(lblEscudos_17);

		ImageIcon iconoEscudo_17 = new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/sevilla.png"));
		Image imagenEscudo_17 = iconoEscudo_17.getImage().getScaledInstance(30, 25, Image.SCALE_SMOOTH);
		ImageIcon iconoAjustado_17 = new ImageIcon(imagenEscudo_17); 
		lblEscudos_17.setIcon(iconoAjustado_17);

		GridBagConstraints gbc_lblEscudos_17 = new GridBagConstraints();
		gbc_lblEscudos_17.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscudos_17.gridx = 3;
		gbc_lblEscudos_17.gridy = 20;
		pagina02Simulacion_clasificacion.add(lblEscudos_17, gbc_lblEscudos_17);
		
		JLabel lblEquipo_17 = new JLabel("");
		GridBagConstraints gbc_lblEquipo_17 = new GridBagConstraints();
		gbc_lblEquipo_17.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo_17.gridx = 4;
		gbc_lblEquipo_17.gridy = 20;
		pagina02Simulacion_clasificacion.add(lblEquipo_17, gbc_lblEquipo_17);
		
		JLabel lblPuntos_17 = new JLabel("");
		GridBagConstraints gbc_lblPuntos_17 = new GridBagConstraints();
		gbc_lblPuntos_17.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuntos_17.gridx = 5;
		gbc_lblPuntos_17.gridy = 20;
		pagina02Simulacion_clasificacion.add(lblPuntos_17, gbc_lblPuntos_17);
		
		JLabel lblPJ_17 = new JLabel("");
		GridBagConstraints gbc_lblPJ_17 = new GridBagConstraints();
		gbc_lblPJ_17.insets = new Insets(0, 0, 5, 5);
		gbc_lblPJ_17.gridx = 6;
		gbc_lblPJ_17.gridy = 20;
		pagina02Simulacion_clasificacion.add(lblPJ_17, gbc_lblPJ_17);
		
		JLabel lblPG_17 = new JLabel("");
		GridBagConstraints gbc_lblPG_17 = new GridBagConstraints();
		gbc_lblPG_17.insets = new Insets(0, 0, 5, 5);
		gbc_lblPG_17.gridx = 7;
		gbc_lblPG_17.gridy = 20;
		pagina02Simulacion_clasificacion.add(lblPG_17, gbc_lblPG_17);
		
		JLabel lblPE_17 = new JLabel("");
		GridBagConstraints gbc_lblPE_17 = new GridBagConstraints();
		gbc_lblPE_17.insets = new Insets(0, 0, 5, 5);
		gbc_lblPE_17.gridx = 8;
		gbc_lblPE_17.gridy = 20;
		pagina02Simulacion_clasificacion.add(lblPE_17, gbc_lblPE_17);
		
		JLabel lblPP_17 = new JLabel("");
		GridBagConstraints gbc_lblPP_17 = new GridBagConstraints();
		gbc_lblPP_17.insets = new Insets(0, 0, 5, 5);
		gbc_lblPP_17.gridx = 9;
		gbc_lblPP_17.gridy = 20;
		pagina02Simulacion_clasificacion.add(lblPP_17, gbc_lblPP_17);
		
		JLabel lblGF_17 = new JLabel("");
		GridBagConstraints gbc_lblGF_17 = new GridBagConstraints();
		gbc_lblGF_17.insets = new Insets(0, 0, 5, 5);
		gbc_lblGF_17.gridx = 10;
		gbc_lblGF_17.gridy = 20;
		pagina02Simulacion_clasificacion.add(lblGF_17, gbc_lblGF_17);
		
		JLabel lblGC_17 = new JLabel("");
		GridBagConstraints gbc_lblGC_17 = new GridBagConstraints();
		gbc_lblGC_17.insets = new Insets(0, 0, 5, 5);
		gbc_lblGC_17.gridx = 11;
		gbc_lblGC_17.gridy = 20;
		pagina02Simulacion_clasificacion.add(lblGC_17, gbc_lblGC_17);
		
		JLabel lblDG_17 = new JLabel("");
		GridBagConstraints gbc_lblDG_17 = new GridBagConstraints();
		gbc_lblDG_17.insets = new Insets(0, 0, 5, 5);
		gbc_lblDG_17.gridx = 12;
		gbc_lblDG_17.gridy = 20;
		pagina02Simulacion_clasificacion.add(lblDG_17, gbc_lblDG_17);
		
		JLabel lblPosicion_18 = new JLabel("18");
		GridBagConstraints gbc_lblPosicion_18 = new GridBagConstraints();
		gbc_lblPosicion_18.insets = new Insets(0, 0, 5, 5);
		gbc_lblPosicion_18.gridx = 2;
		gbc_lblPosicion_18.gridy = 21;
		pagina02Simulacion_clasificacion.add(lblPosicion_18, gbc_lblPosicion_18);
		
		JLabel lblEscudos_18 = new JLabel("");
		lblEscudos_18.setIcon(new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/valencia.png")));
		lblEscudos_18.setBounds(136, 29, 163, 119);
		pagina02Simulacion_clasificacion.add(lblEscudos_18);

		ImageIcon iconoEscudo_18 = new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/valencia.png"));
		Image imagenEscudo_18 = iconoEscudo_18.getImage().getScaledInstance(30, 25, Image.SCALE_SMOOTH);
		ImageIcon iconoAjustado_18 = new ImageIcon(imagenEscudo_18); 
		lblEscudos_18.setIcon(iconoAjustado_18);

		GridBagConstraints gbc_lblEscudos_18 = new GridBagConstraints();
		gbc_lblEscudos_18.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscudos_18.gridx = 3;
		gbc_lblEscudos_18.gridy = 21;
		pagina02Simulacion_clasificacion.add(lblEscudos_18, gbc_lblEscudos_18);
		
		JLabel lblEquipo_18 = new JLabel("");
		GridBagConstraints gbc_lblEquipo_18 = new GridBagConstraints();
		gbc_lblEquipo_18.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo_18.gridx = 4;
		gbc_lblEquipo_18.gridy = 21;
		pagina02Simulacion_clasificacion.add(lblEquipo_18, gbc_lblEquipo_18);
		
		JLabel lblPuntos_18 = new JLabel("");
		GridBagConstraints gbc_lblPuntos_18 = new GridBagConstraints();
		gbc_lblPuntos_18.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuntos_18.gridx = 5;
		gbc_lblPuntos_18.gridy = 21;
		pagina02Simulacion_clasificacion.add(lblPuntos_18, gbc_lblPuntos_18);
		
		JLabel lblPJ_18 = new JLabel("");
		GridBagConstraints gbc_lblPJ_18 = new GridBagConstraints();
		gbc_lblPJ_18.insets = new Insets(0, 0, 5, 5);
		gbc_lblPJ_18.gridx = 6;
		gbc_lblPJ_18.gridy = 21;
		pagina02Simulacion_clasificacion.add(lblPJ_18, gbc_lblPJ_18);
		
		JLabel lblPG_18 = new JLabel("");
		GridBagConstraints gbc_lblPG_18 = new GridBagConstraints();
		gbc_lblPG_18.insets = new Insets(0, 0, 5, 5);
		gbc_lblPG_18.gridx = 7;
		gbc_lblPG_18.gridy = 21;
		pagina02Simulacion_clasificacion.add(lblPG_18, gbc_lblPG_18);
		
		JLabel lblPE_18 = new JLabel("");
		GridBagConstraints gbc_lblPE_18 = new GridBagConstraints();
		gbc_lblPE_18.insets = new Insets(0, 0, 5, 5);
		gbc_lblPE_18.gridx = 8;
		gbc_lblPE_18.gridy = 21;
		pagina02Simulacion_clasificacion.add(lblPE_18, gbc_lblPE_18);
		
		JLabel lblPP_18 = new JLabel("");
		GridBagConstraints gbc_lblPP_18 = new GridBagConstraints();
		gbc_lblPP_18.insets = new Insets(0, 0, 5, 5);
		gbc_lblPP_18.gridx = 9;
		gbc_lblPP_18.gridy = 21;
		pagina02Simulacion_clasificacion.add(lblPP_18, gbc_lblPP_18);
		
		JLabel lblGF_18 = new JLabel("");
		GridBagConstraints gbc_lblGF_18 = new GridBagConstraints();
		gbc_lblGF_18.insets = new Insets(0, 0, 5, 5);
		gbc_lblGF_18.gridx = 10;
		gbc_lblGF_18.gridy = 21;
		pagina02Simulacion_clasificacion.add(lblGF_18, gbc_lblGF_18);
		
		JLabel lblGC_18 = new JLabel("");
		GridBagConstraints gbc_lblGC_18 = new GridBagConstraints();
		gbc_lblGC_18.insets = new Insets(0, 0, 5, 5);
		gbc_lblGC_18.gridx = 11;
		gbc_lblGC_18.gridy = 21;
		pagina02Simulacion_clasificacion.add(lblGC_18, gbc_lblGC_18);
		
		JLabel lblDG_18 = new JLabel("");
		GridBagConstraints gbc_lblDG_18 = new GridBagConstraints();
		gbc_lblDG_18.insets = new Insets(0, 0, 5, 5);
		gbc_lblDG_18.gridx = 12;
		gbc_lblDG_18.gridy = 21;
		pagina02Simulacion_clasificacion.add(lblDG_18, gbc_lblDG_18);
		
		JLabel lblPosicion_19 = new JLabel("19");
		GridBagConstraints gbc_lblPosicion_19 = new GridBagConstraints();
		gbc_lblPosicion_19.insets = new Insets(0, 0, 5, 5);
		gbc_lblPosicion_19.gridx = 2;
		gbc_lblPosicion_19.gridy = 22;
		pagina02Simulacion_clasificacion.add(lblPosicion_19, gbc_lblPosicion_19);
		
		JLabel lblEscudos_19 = new JLabel("");
		lblEscudos_19.setIcon(new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/valladolid.png")));
		lblEscudos_19.setBounds(136, 29, 163, 119);
		pagina02Simulacion_clasificacion.add(lblEscudos_19);

		ImageIcon iconoEscudo_19 = new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/valladolid.png"));
		Image imagenEscudo_19 = iconoEscudo_19.getImage().getScaledInstance(30, 25, Image.SCALE_SMOOTH);
		ImageIcon iconoAjustado_19 = new ImageIcon(imagenEscudo_19); 
		lblEscudos_19.setIcon(iconoAjustado_19);

		GridBagConstraints gbc_lblEscudos_19 = new GridBagConstraints();
		gbc_lblEscudos_19.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscudos_19.gridx = 3;
		gbc_lblEscudos_19.gridy = 22;
		pagina02Simulacion_clasificacion.add(lblEscudos_19, gbc_lblEscudos_19);
		
		JLabel lblEquipo_19 = new JLabel("");
		GridBagConstraints gbc_lblEquipo_19 = new GridBagConstraints();
		gbc_lblEquipo_19.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo_19.gridx = 4;
		gbc_lblEquipo_19.gridy = 22;
		pagina02Simulacion_clasificacion.add(lblEquipo_19, gbc_lblEquipo_19);
		
		JLabel lblPuntos_19 = new JLabel("");
		GridBagConstraints gbc_lblPuntos_19 = new GridBagConstraints();
		gbc_lblPuntos_19.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuntos_19.gridx = 5;
		gbc_lblPuntos_19.gridy = 22;
		pagina02Simulacion_clasificacion.add(lblPuntos_19, gbc_lblPuntos_19);
		
		JLabel lblPJ_19 = new JLabel("");
		GridBagConstraints gbc_lblPJ_19 = new GridBagConstraints();
		gbc_lblPJ_19.insets = new Insets(0, 0, 5, 5);
		gbc_lblPJ_19.gridx = 6;
		gbc_lblPJ_19.gridy = 22;
		pagina02Simulacion_clasificacion.add(lblPJ_19, gbc_lblPJ_19);
		
		JLabel lblPG_19 = new JLabel("");
		GridBagConstraints gbc_lblPG_19 = new GridBagConstraints();
		gbc_lblPG_19.insets = new Insets(0, 0, 5, 5);
		gbc_lblPG_19.gridx = 7;
		gbc_lblPG_19.gridy = 22;
		pagina02Simulacion_clasificacion.add(lblPG_19, gbc_lblPG_19);
		
		JLabel lblPE_19 = new JLabel("");
		GridBagConstraints gbc_lblPE_19 = new GridBagConstraints();
		gbc_lblPE_19.insets = new Insets(0, 0, 5, 5);
		gbc_lblPE_19.gridx = 8;
		gbc_lblPE_19.gridy = 22;
		pagina02Simulacion_clasificacion.add(lblPE_19, gbc_lblPE_19);
		
		JLabel lblPP_19 = new JLabel("");
		GridBagConstraints gbc_lblPP_19 = new GridBagConstraints();
		gbc_lblPP_19.insets = new Insets(0, 0, 5, 5);
		gbc_lblPP_19.gridx = 9;
		gbc_lblPP_19.gridy = 22;
		pagina02Simulacion_clasificacion.add(lblPP_19, gbc_lblPP_19);
		
		JLabel lblGF_19 = new JLabel("");
		GridBagConstraints gbc_lblGF_19 = new GridBagConstraints();
		gbc_lblGF_19.insets = new Insets(0, 0, 5, 5);
		gbc_lblGF_19.gridx = 10;
		gbc_lblGF_19.gridy = 22;
		pagina02Simulacion_clasificacion.add(lblGF_19, gbc_lblGF_19);
		
		JLabel lblGC_19 = new JLabel("");
		GridBagConstraints gbc_lblGC_19 = new GridBagConstraints();
		gbc_lblGC_19.insets = new Insets(0, 0, 5, 5);
		gbc_lblGC_19.gridx = 11;
		gbc_lblGC_19.gridy = 22;
		pagina02Simulacion_clasificacion.add(lblGC_19, gbc_lblGC_19);
		
		JLabel lblDG_19 = new JLabel("");
		GridBagConstraints gbc_lblDG_19 = new GridBagConstraints();
		gbc_lblDG_19.insets = new Insets(0, 0, 5, 5);
		gbc_lblDG_19.gridx = 12;
		gbc_lblDG_19.gridy = 22;
		pagina02Simulacion_clasificacion.add(lblDG_19, gbc_lblDG_19);
		
		JLabel lblPosicion_20 = new JLabel("20");
		GridBagConstraints gbc_lblPosicion_20 = new GridBagConstraints();
		gbc_lblPosicion_20.insets = new Insets(0, 0, 5, 5);
		gbc_lblPosicion_20.gridx = 2;
		gbc_lblPosicion_20.gridy = 23;
		pagina02Simulacion_clasificacion.add(lblPosicion_20, gbc_lblPosicion_20);
		
		JLabel lblEscudos_20 = new JLabel("");
		lblEscudos_20.setIcon(new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/villarreal.png")));
		lblEscudos_20.setBounds(136, 29, 163, 119);
		pagina02Simulacion_clasificacion.add(lblEscudos_20);

		ImageIcon iconoEscudo_20 = new ImageIcon(pagina02Simulacion_Clasificacion.class.getResource("/images/villarreal.png"));
		Image imagenEscudo_20 = iconoEscudo_20.getImage().getScaledInstance(30, 25, Image.SCALE_SMOOTH);
		ImageIcon iconoAjustado_20 = new ImageIcon(imagenEscudo_20); 
		lblEscudos_20.setIcon(iconoAjustado_20);

		GridBagConstraints gbc_lblEscudos_20 = new GridBagConstraints();
		gbc_lblEscudos_20.insets = new Insets(0, 0, 5, 5);
		gbc_lblEscudos_20.gridx = 3;
		gbc_lblEscudos_20.gridy = 23;
		pagina02Simulacion_clasificacion.add(lblEscudos_20, gbc_lblEscudos_20);
		
		JLabel lblEquipo_20 = new JLabel("");
		GridBagConstraints gbc_lblEquipo_20 = new GridBagConstraints();
		gbc_lblEquipo_20.insets = new Insets(0, 0, 5, 5);
		gbc_lblEquipo_20.gridx = 4;
		gbc_lblEquipo_20.gridy = 23;
		pagina02Simulacion_clasificacion.add(lblEquipo_20, gbc_lblEquipo_20);
		
		JLabel lblPuntos_20 = new JLabel("");
		GridBagConstraints gbc_lblPuntos_20 = new GridBagConstraints();
		gbc_lblPuntos_20.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuntos_20.gridx = 5;
		gbc_lblPuntos_20.gridy = 23;
		pagina02Simulacion_clasificacion.add(lblPuntos_20, gbc_lblPuntos_20);
		
		JLabel lblPJ_20 = new JLabel("");
		GridBagConstraints gbc_lblPJ_20 = new GridBagConstraints();
		gbc_lblPJ_20.insets = new Insets(0, 0, 5, 5);
		gbc_lblPJ_20.gridx = 6;
		gbc_lblPJ_20.gridy = 23;
		pagina02Simulacion_clasificacion.add(lblPJ_20, gbc_lblPJ_20);
		
		JLabel lblPG_20 = new JLabel("");
		GridBagConstraints gbc_lblPG_20 = new GridBagConstraints();
		gbc_lblPG_20.insets = new Insets(0, 0, 5, 5);
		gbc_lblPG_20.gridx = 7;
		gbc_lblPG_20.gridy = 23;
		pagina02Simulacion_clasificacion.add(lblPG_20, gbc_lblPG_20);
		
		JLabel lblPE_20 = new JLabel("");
		GridBagConstraints gbc_lblPE_20 = new GridBagConstraints();
		gbc_lblPE_20.insets = new Insets(0, 0, 5, 5);
		gbc_lblPE_20.gridx = 8;
		gbc_lblPE_20.gridy = 23;
		pagina02Simulacion_clasificacion.add(lblPE_20, gbc_lblPE_20);
		
		JLabel lblPP_20 = new JLabel("");
		GridBagConstraints gbc_lblPP_20 = new GridBagConstraints();
		gbc_lblPP_20.insets = new Insets(0, 0, 5, 5);
		gbc_lblPP_20.gridx = 9;
		gbc_lblPP_20.gridy = 23;
		pagina02Simulacion_clasificacion.add(lblPP_20, gbc_lblPP_20);
		
		JLabel lblGF_20 = new JLabel("");
		GridBagConstraints gbc_lblGF_20 = new GridBagConstraints();
		gbc_lblGF_20.insets = new Insets(0, 0, 5, 5);
		gbc_lblGF_20.gridx = 10;
		gbc_lblGF_20.gridy = 23;
		pagina02Simulacion_clasificacion.add(lblGF_20, gbc_lblGF_20);
		
		JLabel lblGC_20 = new JLabel("");
		GridBagConstraints gbc_lblGC_20 = new GridBagConstraints();
		gbc_lblGC_20.insets = new Insets(0, 0, 5, 5);
		gbc_lblGC_20.gridx = 11;
		gbc_lblGC_20.gridy = 23;
		pagina02Simulacion_clasificacion.add(lblGC_20, gbc_lblGC_20);
		
		JLabel lblDG_20 = new JLabel("");
		GridBagConstraints gbc_lblDG_20 = new GridBagConstraints();
		gbc_lblDG_20.insets = new Insets(0, 0, 5, 5);
		gbc_lblDG_20.gridx = 12;
		gbc_lblDG_20.gridy = 23;
		pagina02Simulacion_clasificacion.add(lblDG_20, gbc_lblDG_20);
	}

}
