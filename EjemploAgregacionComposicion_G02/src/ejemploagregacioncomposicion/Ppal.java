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
public class Ppal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Creacion objetos de tipo equipo
        System.out.println("Creacion de objetos equipos: ");
        Equipo nacional = new Equipo("Nacional", "Medellin", "Guimaraes", 123);
        Equipo junior = new Equipo("Junior", "Barranquilla", "Perea", 456);
        Equipo medellin = new Equipo("DIM", "Medellin", "Bolillo", 678);
        Equipo barca = new Equipo("Barcelona", "barcelona", "Koema", 890);
        Equipo real = new Equipo("RealMAdrid", "MAdrid", "Zizou", 321);
        Equipo juve = new Equipo("Juventus", "Torino", "Pirlo", 444);
        
        // Creacion de objeto campeonato
        Campeonato liga = new Campeonato();
        
        // Registro de equipos en campeonato ( Solo permite 5 equipos)
        System.out.println("\n\nInscripcion de equipos al campeonato: ");
        inscribirEquipo(liga,nacional);
        inscribirEquipo(liga,junior);
        inscribirEquipo(liga, medellin);
        inscribirEquipo(liga, barca);
        inscribirEquipo(liga, real);
        inscribirEquipo(liga, juve);
        
        // inscribe jugadores en un equipo (Solo permite 6 jugadores)
        System.out.println("\n\nInscripcion de jugadores a equipo: ");
        inscribirJugador(nacional, "Alexis Enriquez", 30, "Central");
        inscribirJugador(nacional, "Jeferson Duque", 25, "Delantero");
        inscribirJugador(nacional, "Jarla Barrera", 22, "Volante");
        inscribirJugador(nacional, "Jose Cuadrado", 25, "Portero");
        inscribirJugador(nacional, "Nicolas Hernandez", 25, "Central");
        inscribirJugador(nacional, "Andres Andrade", 30, "Volante");
        inscribirJugador(nacional, "Jhonatan Alvez", 30, "Delantero");
      
        // Busca e imprime la nomina de Jugadores de un equipo del campeonato
        // El equipo de busca a traves del codigo de inscripcion
        System.out.println("\n\nBusqueda de equipo inscrito en campeonato:");
        nominaJugadores(liga, 123); //
        
        
    }
    
    public static void nominaJugadores(Campeonato c, int nInsc){
        Equipo e = c.buscarEquipo(nInsc);
        if(e==null) System.out.println("El Equipo no se encuentra inscrito");
        else{
            System.out.println("Nombre de equipo:   " + e.getNombre());
            System.out.println("Tecnico del equipo: " + e.getNombreTecnico());
            System.out.println("Ciudad:             " + e.getCiudadOrigen());
            System.out.println("Nomina de jugadores:");
            System.out.println("----------------------------------------------");
            System.out.printf("%-20s %-15s %s\n","Nombre Jugador", "Posicion", "Edad" );
            System.out.println("----------------------------------------------");
            imprimirNomina(e);
            
        }
        
    }
    
    public static void imprimirNomina(Equipo e){
        for(int i=0; i< e.getN();i++){
            Jugador j = e.getJugInscritos()[i];
            System.out.printf("%-20s %-15s %s\n",j.getNombre(), j.getPosicion(), j.getEdad());
        }
    }
    
    public static void inscribirEquipo(Campeonato c, Equipo e){
        if(c.inscribirEquipo(e)){
            System.out.printf("El equipo (%s) ha sido inscrito con exito, "
                              + "quedan %d cupos disponible\n",
                              e.getNombre(),
                              c.getN_MAX_EQUIPOS() - c.getN());
        }
        else{
            System.out.printf("El equipo %s no puede ser inscrito, "
                               + "el limite de equipos ya fue cumplido", e.getNombre());
        }
    }
    
    public static void inscribirJugador(Equipo equipo, String n,  int e,String p){
        if(equipo.inscribirJugador(n,e,p)){
            System.out.printf("El Jugador (%s) ha sido inscrito al equipo (%s) con exito, "
                              + "quedan %d cupos disponible para este equipo\n"
                              ,n
                              ,equipo.getNombre()
                              ,Equipo.N_MAX_JUGADORES - equipo.getN());
        }
        else{
            System.out.printf("El Jugador (%s) no puede ser inscrito al equipo (%s) , "
                               + "el limite de jugadores del equipo ya fue cumplido"
                               ,n
                               , equipo.getNombre());
        }
    }
    
    
}
