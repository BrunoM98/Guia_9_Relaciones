
package Main;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.Revolver;


public class mainJuego {

   
    public static void main(String[] args) {
        
        Revolver r = new Revolver();
        Jugador j1 = new Jugador();
        Juego j2 = new Juego();
        
        j1.crearJugador();
        r.llenarRevolver();
        j2.llenarJuego(j1.getJugadores(), r);
        j2.ronda();
     
    }
    
}
