import clasesProyecto.Equipo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Year;

import static org.junit.jupiter.api.Assertions.*;

public class testUnitariosProyecto {

    private Equipo equipo1;
    private Equipo equipo2;

    @BeforeEach
    public void setUp() {
        equipo1 = new Equipo("FC Barcelona", 5, 0, 0, 0, 0, 0, 0, 0, 0);
        equipo2 = new Equipo("Real Betis", 4.5f, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    @Test
    public void testGetNombre() {
        assertEquals("FC Barcelona", equipo1.getNombre());
    }

    @Test
    public void testSumarPuntos() {
        equipo2.sumarPuntos(1);
        equipo2.sumarPuntos(3);
        equipo2.sumarPuntos(3);
        assertEquals(7, equipo2.getPuntos());
    }


    // Clase ficticia con el metodo a probar (puedes adaptarlo al nombre real)
    static class Utilidades {
        public String calcularTemporadaDesdeAnioActual() {
            int anioActual = Year.now().getValue() % 100;
            int siguienteAnio = (anioActual + 1) % 100;
            return String.format("%02d/%02d", anioActual, siguienteAnio);
        }
    }

    @Test
    public void testCalcularTemporadaDesdeAnioActual() {
        Utilidades util = new Utilidades();

        int anioActual = Year.now().getValue() % 100;
        int siguienteAnio = (anioActual + 1) % 100;
        String esperado = String.format("%02d/%02d", anioActual, siguienteAnio);

        assertEquals(esperado, util.calcularTemporadaDesdeAnioActual());
    }

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