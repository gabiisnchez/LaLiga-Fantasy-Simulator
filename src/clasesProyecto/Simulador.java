package clasesProyecto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.Year;

/**
 * Clase que simula la gestión de equipos y temporadas para LaLiga Fantasy.
 * Incluye funcionalidades para cargar equipos desde una base de datos,
 * verificar la existencia de temporadas y calcular nuevas temporadas.
 */
public class Simulador {

    /**
     * Lista que almacena los equipos cargados desde la base de datos.
     */
    public List<Equipo> equiposLaLiga;

    /**
     * Objeto que representa la conexión a la base de datos MySQL.
     */
    ConexionMySQL conexion;

    /**
     * Constructor que inicializa la lista de equipos.
     */
    public Simulador() {
        equiposLaLiga = new ArrayList<>();
    }

    /**
     * Establece la conexión a la base de datos.
     * Útil para inyectar la conexión desde fuera, especialmente en pruebas.
     *
     * @param conexion Objeto ConexionMySQL que maneja la conexión a la base de datos.
     */
    public void setConexion(ConexionMySQL conexion) {
        this.conexion = conexion;
    }

    /**
     * Devuelve la lista actual de equipos cargados.
     *
     * @return Lista de objetos Equipo.
     */
    public List<Equipo> getEquiposLaLiga() {
        return equiposLaLiga;
    }

    /**
     * Carga los equipos desde la base de datos, limpiando la lista actual y llenándola con los resultados.
     * En caso de error, muestra un mensaje de diálogo.
     */
    public void cargarEquiposDesdeBD() {
        equiposLaLiga.clear();
        try {
            String consulta = "SELECT nombre, valoración FROM equipos";
            ResultSet rs = conexion.ejecutarSelect(consulta);

            while (rs.next()) {
                String nombre = rs.getString("nombre");
                float valoracion = rs.getFloat("valoración");
                Equipo equipo = new Equipo(nombre, valoracion);
                equiposLaLiga.add(equipo);
            }

            rs.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al cargar los equipos: " + ex.getMessage());
        }
    }

    /**
     * Verifica si una temporada existe en la base de datos.
     *
     * @param temporada Nombre de la temporada en formato "XX/XX".
     * @return true si la temporada existe, false en caso contrario o error.
     */
    public boolean existeTemporada(String temporada) {
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

    /**
     * Obtiene la temporada más reciente de la base de datos o calcula una nueva si no hay temporadas.
     * Inserta la nueva temporada en la base de datos si no existía previamente.
     *
     * @return Nombre de la temporada obtenida o creada, en formato "XX/XX".
     */
    public String obtenerOTomarTemporada() {
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
            nuevaTemporada = calcularSiguienteTemporada(ultimaTemporada); // Siguiente temporada
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

    /**
     * Calcula la primera temporada basada en el año actual del sistema.
     * Formatea la temporada en "XX/XX" tomando los últimos dos dígitos del año actual y del siguiente.
     *
     * @return Nombre de la temporada calculada, por ejemplo "25/26".
     */
    public String calcularPrimeraTemporadaDesdeAnioActual() {
        LocalDate ahora = LocalDate.now();
        int anioActual = ahora.getYear() % 100; // Últimos dos dígitos del año actual
        int anioSiguiente = (anioActual + 1) % 100;
        return String.format("%02d/%02d", anioActual, anioSiguiente);
    }

    /**
     * Calcula la siguiente temporada dado el nombre de una temporada actual en formato "XX/XX".
     * Considera la transición entre años y formatea con ceros a la izquierda.
     *
     * @param temporadaActual Nombre de la temporada actual.
     * @return Nombre de la siguiente temporada calculada.
     */
    public String calcularSiguienteTemporada(String temporadaActual) {
        try {
            String[] partes = temporadaActual.split("/");
            int primero = Integer.parseInt(partes[0]);
            int segundo = Integer.parseInt(partes[1]);

            primero = (primero + 1) % 100;
            segundo = (segundo + 1) % 100;

            return String.format("%02d/%02d", primero, segundo);
        } catch (Exception e) {
            e.printStackTrace();
            // En caso de error, retorna la temporada actual
            return temporadaActual;
        }
    }

    /**
     * Obtiene el nombre de la temporada basada en el año actual del sistema.
     *
     * @return Nombre de la temporada actual en formato "XX/XX".
     */
    public String obtenerTemporadaNombre() {
        int anioActual = Year.now().getValue() % 100; // Ejemplo: 2025 -> 25
        int siguienteAnio = (anioActual + 1) % 100;   // Ejemplo: 26

        return String.format("%02d/%02d", anioActual, siguienteAnio); // "25/26"
    }
}
