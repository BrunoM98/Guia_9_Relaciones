
package Entidad;


public class Perros {
    
 private String nombre;
 private String raza;
 private int edad;
 private enumContextura contextura;
 private boolean adoptado = false;

    public Perros(String nombre, String raza, int edad, enumContextura contextura) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.contextura = contextura;
    }

    public boolean isAdoptado() {
        return adoptado;
    }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public enumContextura getContextura() {
        return contextura;
    }

    public void setContextura(enumContextura contextura) {
        this.contextura = contextura;
    }

    @Override
    public String toString() {
        return "Perros" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", contextura=" + contextura + "adoptado" + adoptado ;
    }
 
 
 
    
    
}
