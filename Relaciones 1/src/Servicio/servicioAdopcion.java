package Servicio;

import Entidad.Perros;
import Entidad.Persona;
import Entidad.enumContextura;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class servicioAdopcion {

    Scanner leer = new Scanner(System.in);

    public HashMap<String, Perros> crearPerrito() {

        HashMap<String, Perros> perros = new HashMap<>();

        perros.put("Tyson", new Perros("Tyson", "Boxer", 7, enumContextura.MEDIANO));
        perros.put("Thor", new Perros("Thor", "Husky", 3, enumContextura.MEDIANO));
        perros.put("Rocky", new Perros("Rocky", "Grandanes", 1, enumContextura.GRANDE));
        perros.put("Tato", new Perros("Tato", "Salchicha", 4, enumContextura.CHICO));
        perros.put("Nala", new Perros("Nala", "MastiffTibetano", 12, enumContextura.GRANDE));
        perros.put("Mopo", new Perros("Mopo", "Pichichu", 2, enumContextura.CHICO));
        perros.put("Morfeo", new Perros("Morfeo", "Bulldog", 8, enumContextura.CHICO));
        perros.put("pepe", new Perros("pepe", "Mastiff", 5, enumContextura.MEDIANO));
        perros.put("Scar", new Perros("Scar", "OvejeroAleman", 3, enumContextura.GRANDE));
        perros.put("Nala", new Perros("Nala", "Chihuahua", 2, enumContextura.CHICO));

        return perros;
    }

    public ArrayList<Persona> crearPersona() {

        ArrayList<Persona> persona = new ArrayList();

        persona.add(new Persona("Seba", "Rompebolas", 82, 35598425));
        persona.add(new Persona("Julio", "Menosrompebolas", 55, 40598575));
        persona.add(new Persona("Bruno", "Eljoven", 42, 38598984));

        return persona;
    }

    public void seleccionarPerros(HashMap<String, Perros> perros, Persona persona) {

        System.out.println("que perro desea adoptar");

        perros.entrySet().forEach(perro -> {
            System.out.println(perro.getKey());
        });

        System.out.println("la persona " + persona.getNombre() + " quiere adoptar a");
        System.out.print("Select==>");
        String select;
        select = leer.next();

        while (perros.containsKey(select)) {

            System.out.println("Ingrasa bien el nombre MOGO ");
            select = leer.next();
        }
        while (perros.get(select).isAdoptado()) {

            System.out.println("que el perro ya esta adoptado ");
            System.out.println("ingrese otro nombre");

            select = leer.next();

        }

        persona.setPerro(perros.get(select));
        persona.getPerro().setAdoptado(true);

    }

    public void mostrarAdopcion(Persona persona) {

        System.out.println("la persona " + persona.getNombre() + " adopto a " + persona.getPerro().getNombre());

    }

}
