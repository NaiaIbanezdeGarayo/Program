/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t8p1e2v2;

import java.util.ArrayList;

/**
 *
 * @author Naia
 */
public class T8P1E2v2 {

    public static AltaPersonas ap;
    public static ListadoPersonas lp;
    public static Persona persona;
    public static ArrayList<Persona> listaPersona = new ArrayList<Persona>();
    public static void main(String[] args) {
        abrirVentanaAltaPersonas();
        
    }

    public static void abrirVentanaAltaPersonas() {
       ap = new AltaPersonas();
       ap.setVisible(true);
       
    }
    public static void crearPersona(String nombre, String apellido, String dni){
    
        persona = new Persona();
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setDni(dni);
        listaPersona.add(persona);
        
    }
    public static void cerrarVentana(){
        ap.dispose();
        lp = new ListadoPersonas();
        lp.setVisible(true);
    }
    public static String mostrarPersona(){
        String personass="";
        
        for (int i = 0; i < listaPersona.size(); i++) {
            personass= listaPersona.get(i).toString()+ personass;
        }
        return personass;
    }
    
}
