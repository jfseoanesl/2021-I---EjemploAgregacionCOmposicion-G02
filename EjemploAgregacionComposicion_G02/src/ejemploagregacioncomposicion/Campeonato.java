/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploagregacioncomposicion;

/**
 *
 * @author jairo
 */
public class Campeonato {
    private final int N_MAX_EQUIPOS = 5;
    private int n; // equipos registrados
    private Equipo[]equiposInscritos;
    
    public Campeonato(){
        this.equiposInscritos= new Equipo[this.N_MAX_EQUIPOS];
        this.n = 0;
    }

    /**
     * @return the n
     */
    public int getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void setN(int n) {
        this.n = n;
    }

    /**
     * @return the equiposInscritos
     */
    public Equipo[] getEquiposInscritos() {
        return equiposInscritos;
    }

    /**
     * @param equiposInscritos the equiposInscritos to set
     */
    public void setEquiposInscritos(Equipo[] equiposInscritos) {
        this.equiposInscritos = equiposInscritos;
    }
    
    public boolean inscribirEquipo(Equipo e){
        if(this.n<this.getN_MAX_EQUIPOS()){
            this.equiposInscritos[this.n]=e;
            this.n++;
            return true;
        }
        else{
            return false;
        }
    }
    
    public Equipo buscarEquipo(int nInscripcion){
        for(int i=0; i<this.n; i++){
            if(this.equiposInscritos[i].getnInscripcion()==nInscripcion){
                return this.equiposInscritos[i];
            }
        }
        return null;
    }

    /**
     * @return the N_MAX_EQUIPOS
     */
    public int getN_MAX_EQUIPOS() {
        return N_MAX_EQUIPOS;
    }
    
}
