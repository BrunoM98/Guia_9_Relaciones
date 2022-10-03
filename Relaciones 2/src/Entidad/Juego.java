
package Entidad;

import java.util.ArrayList;


public class Juego {
    
    Revolver r = new Revolver();
    
    private ArrayList<Jugador>empiezaEljuego;
    private Revolver arma;

    public Juego() {
    }
    
    public void llenarJuego(ArrayList<Jugador>jugadores,Revolver r) {
        
        empiezaEljuego = jugadores;
        arma = r;
    }
    
       public void ronda(){
           
            boolean salir = false;
        do {
            for (Jugador aux : empiezaEljuego) {
                if (aux.disparo(arma)) {
                    System.out.println("Fin del juego");
                    System.out.println(aux + " se mojo");
                    salir = true;
                    break;
                }
            }
        } while (salir == false);
       }
    
}
