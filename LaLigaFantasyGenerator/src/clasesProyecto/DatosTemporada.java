package clasesProyecto;

import java.util.ArrayList;

/**
 * Clase que almacena los datos de la temporada, 
 * específicamente la clasificación final de los equipos.
 * 
 * La lista es estática para poder acceder a ella desde cualquier parte sin instanciar la clase.
 */
public class DatosTemporada {

    /**
     * Lista estática que contiene la clasificación final de los equipos de la temporada.
     * Debe estar inicializada para evitar NullPointerException al acceder.
     */
    public static ArrayList<ClasificacionEquipo> clasificacionFinal = new ArrayList<>();
}
