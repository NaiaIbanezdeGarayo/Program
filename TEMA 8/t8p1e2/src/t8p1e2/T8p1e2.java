/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t8p1e2;

import java.util.ArrayList;

/**
 *
 * @author Naia
 */
public class T8P1E2 {
    private static AltaPersona ap;
    private static ListadoPersonas lp;
    private static Persona persona;
    public static ArrayList <Persona> listaPersona = new ArrayList<Persona>();
    public static void main(String[] args) {
        abrirVentanAltaPersona();
        
    }

    private static void abrirVentanAltaPersona() {
        ap = new AltaPersona();
        ap.setVisible(true);
    }
    
    public static void crearPersona(String nombre, String apellido, String dni) {
        persona = new Persona();
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setDni(dni);
        System.out.println(persona.toString());
        listaPersona.add(persona);
    }
     
    
    
    public static void cerrarVentana(){
        ap.dispose();
        lp = new ListadoPersonas();
        lp.setVisible(true);
    }
   
    
    
    
    public static String mostrarPersonas(){
        
        String personass = listaPersona.toString();
        
        /*String personass="";
        for (int i = 0; i < listaPersona.size(); i++) {
          personass = listaPersona.get(i).toString()+ personass;
          
        }*/
        return personass;
        
    }
    
}
