
package Entidad;

import java.util.ArrayList;
import java.util.Scanner;


public class Jugador {
    
    Revolver r = new Revolver();
    ArrayList<Jugador> jugadores = new ArrayList();
    Scanner leer = new Scanner(System.in);
    
    private Integer id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public Revolver getR() {
        return r;
    }

    public void setR(Revolver r) {
        this.r = r;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
    public boolean disparo(Revolver R){
    
    setMojado(R.mojar());
    R.siguienteDisparo();
    return getMojado();
 
}  

public void crearJugador(){
    
    int  id  = 1;
    String aceptar = "Y";
    
    do {
        
        System.out.println("Ingrese el nombre del jugador");
        
        String nombre = leer.next();
        
        jugadores.add(new Jugador(id,nombre));
        
        System.out.println("Desea ingresar otro jugador");
        System.out.println("Y/N");
        aceptar = leer.next();
        
        id += 1;
        
    }while (id < 7 && aceptar.equalsIgnoreCase("Y"));
     

    
    }       
    
}
