
package Main;

import Entidad.Perros;
import Entidad.Persona;
import Servicio.servicioAdopcion;
import java.util.ArrayList;
import java.util.HashMap;


public class adopcionMAIN {

    
    public static void main(String[] args) {
      
        servicioAdopcion sa = new servicioAdopcion();
        
        
        HashMap<String,Perros> perros = sa.crearPerrito();
        ArrayList<Persona> personas = sa.crearPersona();
        
        for (Persona persona : personas) {
            
        sa.seleccionarPerros(perros,persona);
       
            
        }
        
        for (Persona persona : personas) {
            
             sa.mostrarAdopcion(persona);
        }
        
        
    }
    
}
