package clasesProyecto;

public class Equipo {
	//Atributos
    String nombre;
    int PJ;
    int PG;
    int PE;
    int PP;
    int GF;
    int GC;
    int DG;
    int puntos;
    float valoracion;
    
    //Constructor
    public Equipo(String nombre, float valoracion) {
    	this.nombre = nombre;
        this.valoracion = valoracion;
	}

    public Equipo (String nombre, float valoracion, int puntos, int PJ, int PG,int PE, int PP, int GF, int GC, int DG){
        this.nombre = nombre;
        this.puntos = puntos;
        this.PJ = PJ;
        this.PG = PG;
        this.PE = PE;
        this.PP = PP;
        this.GF = GF;
        this.GC = GC;
        this.DG = DG;
    }
    
    //Getters
    public String getNombre() {
        return nombre;
    }

    public float getValoracion() {
        return valoracion;
    }

    //Metodos
    public void actualizarDatos(int golesAFavor, int golesEnContra){
        PJ++;
        GF += golesAFavor;
        GC += golesEnContra;

        if(golesAFavor > golesEnContra){
            PG++;
            puntos += 3;
        } else if (golesAFavor == golesEnContra){
            PE++;
            puntos += 1;
        } else {
            PP++;
        }
    }

    public void diferenciaGoles(){
        DG = GF - GC;
    }
}
