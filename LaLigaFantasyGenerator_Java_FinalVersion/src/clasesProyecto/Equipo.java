package clasesProyecto;

/**
 * Representa un equipo de fútbol con sus estadísticas y valoración.
 * Permite actualizar los datos del equipo tras un partido y calcular la diferencia de goles.
 */
public class Equipo {
    // Atributos

    /** Nombre del equipo */
    String nombre;

    /** Partidos jugados */
    int PJ;

    /** Partidos ganados */
    int PG;

    /** Partidos empatados */
    int PE;

    /** Partidos perdidos */
    int PP;

    /** Goles a favor */
    int GF;

    /** Goles en contra */
    int GC;

    /** Diferencia de goles (GF - GC) */
    int DG;

    /** Puntos obtenidos */
    int puntos;

    /** Valoración del equipo, usada para la simulación */
    float valoracion;

    /**
     * Constructor para crear un equipo con solo nombre y valoración.
     * Inicializa el resto de atributos a cero.
     *
     * @param nombre Nombre del equipo
     * @param valoracion Valoración del equipo
     */
    public Equipo(String nombre, float valoracion) {
        this.nombre = nombre;
        this.valoracion = valoracion;
    }

    /**
     * Constructor completo para crear un equipo con todos los datos estadísticos.
     *
     * @param nombre Nombre del equipo
     * @param valoracion Valoración del equipo
     * @param puntos Puntos obtenidos
     * @param PJ Partidos jugados
     * @param PG Partidos ganados
     * @param PE Partidos empatados
     * @param PP Partidos perdidos
     * @param GF Goles a favor
     * @param GC Goles en contra
     * @param DG Diferencia de goles (GF - GC)
     */
    public Equipo(String nombre, float valoracion, int puntos, int PJ, int PG, int PE, int PP, int GF, int GC, int DG) {
        this.nombre = nombre;
        this.valoracion = valoracion;
        this.puntos = puntos;
        this.PJ = PJ;
        this.PG = PG;
        this.PE = PE;
        this.PP = PP;
        this.GF = GF;
        this.GC = GC;
        this.DG = DG;
    }

    // Getters

    /**
     * Obtiene el nombre del equipo.
     * @return Nombre del equipo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la valoración del equipo.
     * @return Valoración del equipo
     */
    public float getValoracion() {
        return valoracion;
    }

    /**
     * Obtiene los puntos totales del equipo.
     * @return Puntos obtenidos
     */
    public int getPuntos() {
        return puntos;
    }

    /**
     * Obtiene los partidos jugados.
     * @return Número de partidos jugados
     */
    public int getPJ() {
        return PJ;
    }

    /**
     * Obtiene los partidos ganados.
     * @return Número de partidos ganados
     */
    public int getPG() {
        return PG;
    }

    /**
     * Obtiene los partidos empatados.
     * @return Número de partidos empatados
     */
    public int getPE() {
        return PE;
    }

    /**
     * Obtiene los partidos perdidos.
     * @return Número de partidos perdidos
     */
    public int getPP() {
        return PP;
    }

    /**
     * Obtiene los goles a favor.
     * @return Goles a favor
     */
    public int getGF() {
        return GF;
    }

    /**
     * Obtiene los goles en contra.
     * @return Goles en contra
     */
    public int getGC() {
        return GC;
    }

    /**
     * Obtiene la diferencia de goles (GF - GC).
     * @return Diferencia de goles
     */
    public int getDG() {
        return DG;
    }

    // Métodos

    /**
     * Actualiza las estadísticas del equipo después de un partido.
     * Incrementa partidos jugados, suma goles a favor y en contra,
     * y actualiza partidos ganados, empatados, perdidos y puntos según resultado.
     *
     * @param golesAFavor Goles marcados por el equipo en el partido
     * @param golesEnContra Goles recibidos por el equipo en el partido
     */
    public void actualizarDatos(int golesAFavor, int golesEnContra) {
        PJ++;
        GF += golesAFavor;
        GC += golesEnContra;

        if (golesAFavor > golesEnContra) {
            PG++;
            puntos += 3;
        } else if (golesAFavor == golesEnContra) {
            PE++;
            puntos += 1;
        } else {
            PP++;
        }
    }

    /**
     * Calcula la diferencia de goles actualizada.
     * Esta diferencia es goles a favor menos goles en contra.
     */
    public void diferenciaGoles() {
        DG = GF - GC;
    }

    public void sumarPuntos(int i) {
        puntos += i;
    }
}
