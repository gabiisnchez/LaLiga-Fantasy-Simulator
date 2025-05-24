import clasesProyecto.Equipo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Year;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de pruebas unitarias para verificar el correcto funcionamiento
 * de la clase {@link Equipo} y otros métodos auxiliares del proyecto.
 * <p>
 * Utiliza JUnit 5 para ejecutar los tests.
 */
public class testUnitariosProyecto {

    private Equipo equipo1;
    private Equipo equipo2;

    /**
     * Metodo que se ejecuta antes de cada test. Inicializa dos equipos de prueba.
     */
    @BeforeEach
    public void setUp() {
        equipo1 = new Equipo("FC Barcelona", 5, 0, 0, 0, 0, 0, 0, 0, 0);
        equipo2 = new Equipo("Real Betis", 4.5f, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    /**
     * Verifica que el nombre del equipo sea el esperado.
     */
    @Test
    public void testGetNombre() {
        assertEquals("FC Barcelona", equipo1.getNombre());
    }

    /**
     * Verifica que el metodo sumarPuntos() acumule correctamente los puntos.
     */
    @Test
    public void testSumarPuntos() {
        equipo2.sumarPuntos(1);
        equipo2.sumarPuntos(3);
        equipo2.sumarPuntos(3);
        assertEquals(7, equipo2.getPuntos());
    }

    /**
     * Clase interna de utilidad que simula el cálculo de la temporada
     * en formato corto desde el año actual.
     */
    static class Utilidades {
        /**
         * Devuelve un string con la temporada en formato "aa/bb" a partir del año actual.
         *
         * @return Temporada en formato "aa/bb"
         */
        public String calcularTemporadaDesdeAnioActual() {
            int anioActual = Year.now().getValue() % 100;
            int siguienteAnio = (anioActual + 1) % 100;
            return String.format("%02d/%02d", anioActual, siguienteAnio);
        }
    }

    /**
     * Verifica que el cálculo de la temporada actual sea correcto.
     */
    @Test
    public void testCalcularTemporadaDesdeAnioActual() {
        Utilidades util = new Utilidades();

        int anioActual = Year.now().getValue() % 100;
        int siguienteAnio = (anioActual + 1) % 100;
        String esperado = String.format("%02d/%02d", anioActual, siguienteAnio);

        assertEquals(esperado, util.calcularTemporadaDesdeAnioActual());
    }

    /**
     * Verifica que al ganar un partido se actualicen correctamente los datos del equipo.
     */
    @Test
    public void testActualizarDatos_Ganado() {
        equipo1.actualizarDatos(3, 1); // Gana 3-1

        assertEquals(1, equipo1.getPJ());
        assertEquals(3, equipo1.getGF());
        assertEquals(1, equipo1.getGC());
        assertEquals(1, equipo1.getPG());
        assertEquals(0, equipo1.getPE());
        assertEquals(0, equipo1.getPP());
        assertEquals(3, equipo1.getPuntos());
    }

    /**
     * Verifica que al perder un partido se actualicen correctamente los datos del equipo.
     */
    @Test
    public void testActualizarDatos_Perdido() {
        equipo1.actualizarDatos(0, 2); // Pierde 0-2

        assertEquals(1, equipo1.getPJ());
        assertEquals(0, equipo1.getGF());
        assertEquals(2, equipo1.getGC());
        assertEquals(0, equipo1.getPG());
        assertEquals(0, equipo1.getPE());
        assertEquals(1, equipo1.getPP());
        assertEquals(0, equipo1.getPuntos());
    }

    /**
     * Verifica que al empatar un partido se actualicen correctamente los datos del equipo.
     */
    @Test
    public void testActualizarDatos_Empatado() {
        equipo2.actualizarDatos(2, 2); // Empata 2-2

        assertEquals(1, equipo2.getPJ());
        assertEquals(2, equipo2.getGF());
        assertEquals(2, equipo2.getGC());
        assertEquals(0, equipo2.getPG());
        assertEquals(1, equipo2.getPE());
        assertEquals(0, equipo2.getPP());
        assertEquals(1, equipo2.getPuntos());
    }
}
