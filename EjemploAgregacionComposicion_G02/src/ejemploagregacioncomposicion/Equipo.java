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
public class Equipo {
    private int nInscripcion, n;
    private String nombre, nombreTecnico, ciudadOrigen;
    public static final int N_MAX_JUGADORES=6;
    private Jugador[] jugInscritos;
    
    public Equipo(){
        this.jugInscritos = new Jugador[Equipo.N_MAX_JUGADORES];
        this.n=0;
    }
    
    public Equipo(String nombre, String nTecnico, String cOrigen, int nInsc){
        this();
        this.nombre=nombre;
        this.nombreTecnico=nTecnico;
        this.ciudadOrigen=cOrigen;
        this.nInscripcion=nInsc;
    }

    /**
     * @return the nInscripcion
     */
    public int getnInscripcion() {
        return nInscripcion;
    }

    /**
     * @param nInscripcion the nInscripcion to set
     */
    public void setnInscripcion(int nInscripcion) {
        this.nInscripcion = nInscripcion;
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
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nombreTecnico
     */
    public String getNombreTecnico() {
        return nombreTecnico;
    }

    /**
     * @param nombreTecnico the nombreTecnico to set
     */
    public void setNombreTecnico(String nombreTecnico) {
        this.nombreTecnico = nombreTecnico;
    }

    /**
     * @return the ciudadOrigen
     */
    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    /**
     * @param ciudadOrigen the ciudadOrigen to set
     */
    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    /**
     * @return the jugInscritos
     */
    public Jugador[] getJugInscritos() {
        return jugInscritos;
    }

    /**
     * @param jugInscritos the jugInscritos to set
     */
    public void setJugInscritos(Jugador[] jugInscritos) {
        this.jugInscritos = jugInscritos;
    }
    
    
    public boolean inscribirJugador(String nombre, int edad, String pos){
        if(this.n<Equipo.N_MAX_JUGADORES){
            Jugador j = new Jugador(nombre, pos, edad);
            this.jugInscritos[this.n]=j;
            this.n++;
            return true;
        }
        else{
            return false;
        }
    }
    
    
    
}
