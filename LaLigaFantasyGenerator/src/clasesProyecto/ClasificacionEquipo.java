package clasesProyecto;

/**
 * Representa la clasificación de un equipo en la liga, con estadísticas básicas.
 */
public class ClasificacionEquipo {

    private String nombre;  // Nombre del equipo
    private int puntos;     // Puntos acumulados
    private int PJ;         // Partidos jugados
    private int PG;         // Partidos ganados
    private int PE;         // Partidos empatados
    private int PP;         // Partidos perdidos
    private int GF;         // Goles a favor
    private int GC;         // Goles en contra
    private int DF;         // Diferencia de goles (GF - GC)

    /**
     * Constructor que inicializa la clasificación del equipo con los datos proporcionados.
     * Calcula la diferencia de goles automáticamente.
     * 
     * @param nombre Nombre del equipo
     * @param puntos Puntos acumulados
     * @param PJ Partidos jugados
     * @param PG Partidos ganados
     * @param PE Partidos empatados
     * @param PP Partidos perdidos
     * @param GF Goles a favor
     * @param GC Goles en contra
     */
    public ClasificacionEquipo(String nombre, int puntos, int PJ, int PG, int PE, int PP, int GF, int GC) {
        this.nombre = nombre;
        this.puntos = puntos;
        this.PJ = PJ;
        this.PG = PG;
        this.PE = PE;
        this.PP = PP;
        this.GF = GF;
        this.GC = GC;
        this.DF = GF - GC;
    }

    /** @return el nombre del equipo */
    public String getNombre() { return nombre; }

    /** @return los puntos acumulados del equipo */
    public int getPuntos() { return puntos; }

    /** @return los partidos jugados */
    public int getPJ() { return PJ; }

    /** @return los partidos ganados */
    public int getPG() { return PG; }

    /** @return los partidos empatados */
    public int getPE() { return PE; }

    /** @return los partidos perdidos */
    public int getPP() { return PP; }

    /** @return los goles a favor */
    public int getGF() { return GF; }

    /** @return los goles en contra */
    public int getGC() { return GC; }

    /** @return la diferencia de goles */
    public int getDF() { return DF; }
}
