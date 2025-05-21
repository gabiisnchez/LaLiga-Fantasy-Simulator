package clasesProyecto;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Year;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class pagina01Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	ArrayList<Equipo> equiposLaLiga = new ArrayList<>();
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
					pagina01Principal frame01Principal = new pagina01Principal(conexion);
					frame01Principal.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public pagina01Principal(ConexionMySQL conexion) {
		this.conexion = conexion;
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
				cargarEquiposDesdeBD();  // Llama a un método que llena el ArrayList
				simularTemporadaYGuardarPartidos();  // Simular y guardar partidos
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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				pagina04Borrar_Datos ventanaBorrar = new pagina04Borrar_Datos(conexion);
				ventanaBorrar.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(158, 227, 117, 23);
		contentPane.add(btnNewButton);
	}
	
	// Método para llenar el ArrayList desde la base de datos
    public void cargarEquiposDesdeBD() {
    	equiposLaLiga.clear();
        try {
            String consulta = "SELECT nombre, valoración FROM equipos";
            ResultSet rs = conexion.ejecutarSelect(consulta);

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                float valoracion = rs.getFloat("valoración");
                Equipo equipo = new Equipo (nombre, valoracion);
                equiposLaLiga.add(equipo);              
            }
            rs.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al cargar los equipos: " + ex.getMessage());
        }       
    }
    
    public void simularTemporadaYGuardarPartidos() {
    	int numEquipos = equiposLaLiga.size();
        int numJornadas = (numEquipos - 1) * 2;

        // Obtener la temporada actual o crearla si no existe
        String temporadaActual = obtenerOTomarTemporada();

        for (int jornada = 0; jornada < numJornadas; jornada++) {
            int numeroJornada = jornada + 1;
            System.out.println("\n--- Jornada " + numeroJornada + " | Temporada " + temporadaActual + " ---");

            for (int i = 0; i < numEquipos / 2; i++) {
                int localIndex, visitanteIndex;

                if (jornada < numEquipos - 1) {
                    localIndex = (jornada + i) % (numEquipos - 1);
                    visitanteIndex = (numEquipos - 1 - i + jornada) % (numEquipos - 1);
                    if (i == 0) visitanteIndex = numEquipos - 1;
                } else {
                    visitanteIndex = (jornada - numEquipos + 1 + i) % (numEquipos - 1);
                    localIndex = (numEquipos - 1 - i + jornada - numEquipos + 1) % (numEquipos - 1);
                    if (i == 0) localIndex = numEquipos - 1;
                }

                Equipo local = equiposLaLiga.get(localIndex);
                Equipo visitante = equiposLaLiga.get(visitanteIndex);

                // Simulación de goles con ligera ventaja local
                float ventajaLocal = local.getValoracion() * 1.2f;
                int maxGolesLocal = Math.max(1, (int) (ventajaLocal / 10 + 1));
                int maxGolesVisitante = Math.max(1, (int) (visitante.getValoracion() / 10 + 1));

                int golesLocal = (int) (Math.random() * (maxGolesLocal + 1));
                int golesVisitante = (int) (Math.random() * (maxGolesVisitante + 1));

                System.out.println(local.getNombre() + " " + golesLocal + " - " + golesVisitante + " " + visitante.getNombre());

                // Insertar partido con temporada y jornada
                String insert = String.format(
                    "INSERT INTO partidos (nombre_local, nombre_visitante, goles_local, goles_visitante, jornada, id_temporada) " +
                    "VALUES ('%s', '%s', %d, %d, %d, '%s')",
                    local.getNombre(), visitante.getNombre(), golesLocal, golesVisitante, numeroJornada, temporadaActual
                );

                try {
                    conexion.ejecutarInsertDeleteUpdate(insert);
                } catch (SQLException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error al insertar partido: " + e.getMessage());
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Temporada " + obtenerTemporadaNombre() + " simulada y guardada en la base de datos.");
    }
    
    private boolean existeTemporada(String temporada) {
        try {
            ResultSet rs = conexion.ejecutarSelect(
                String.format("SELECT COUNT(*) AS cantidad FROM temporadas WHERE id_temporada = '%s'", temporada));
            if (rs.next()) {
                int cantidad = rs.getInt("cantidad");
                rs.close();
                return cantidad > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    private String obtenerOTomarTemporada() {
        String ultimaTemporada = null;

        try {
            ResultSet rs = conexion.ejecutarSelect("SELECT id_temporada FROM temporadas ORDER BY id_temporada DESC LIMIT 1");
            if (rs.next()) {
                ultimaTemporada = rs.getString("id_temporada");
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String nuevaTemporada;
        if (ultimaTemporada == null) {
            nuevaTemporada = calcularPrimeraTemporadaDesdeAnioActual();  // Primera ejecución
        } else {
            nuevaTemporada = calcularSiguienteTemporada(ultimaTemporada); // +1
        }

        // Solo insertar si no existe ya
        if (!existeTemporada(nuevaTemporada)) {
            try {
                String insertTemporada = String.format("INSERT INTO temporadas (id_temporada) VALUES ('%s')", nuevaTemporada);
                conexion.ejecutarInsertDeleteUpdate(insertTemporada);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return nuevaTemporada;
    }

    
    private String obtenerTemporadaNombre() {
        int anioActual = Year.now().getValue() % 100; // Ej: 2025 -> 25
        int siguienteAnio = (anioActual + 1) % 100;   // 26

        return String.format("%02d/%02d", anioActual, siguienteAnio); // "25/26"
    }

    private String calcularPrimeraTemporadaDesdeAnioActual() {
        int anioActual = Year.now().getValue() % 100; // Ej: 2025 -> 25
        int siguienteAnio = (anioActual + 1) % 100;
        return String.format("%02d/%02d", anioActual, siguienteAnio);
    }

    private String calcularSiguienteTemporada(String ultimaTemporada) {
        String[] partes = ultimaTemporada.split("/");
        int anioInicio = Integer.parseInt(partes[0]);
        int anioFin = Integer.parseInt(partes[1]);

        int nuevoInicio = (anioInicio + 1) % 100;
        int nuevoFin = (anioFin + 1) % 100;

        return String.format("%02d/%02d", nuevoInicio, nuevoFin);
    }
    
 
}
