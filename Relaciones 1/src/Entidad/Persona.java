
package Entidad;

import java.util.ArrayList;


public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private double documento;
    private Perros perro;

    public Persona(String nombre, String apellido, int edad, double documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDocumento() {
        return documento;
    }

    public void setDocumento(double documento) {
        this.documento = documento;
    }

    public Perros getPerro() {
        return perro;
    }

    public void setPerro(Perros perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", perro=" + perro ;
    }
    
    
    
  
    
    
    
}
