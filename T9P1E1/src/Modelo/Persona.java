/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Naia
 */
public class Persona {
   public static String nombre;
   public static String edad;
   public static String profesion;
   public static String telefono;

    public Persona() {
    }
    public Persona(String nombre, String edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Persona.nombre = nombre;
    }

    public static String getEdad() {
        return edad;
    }

    public static void setEdad(String edad) {
        Persona.edad = edad;
    }

    public static String getProfesion() {
        return profesion;
    }

    public static void setProfesion(String profesion) {
        Persona.profesion = profesion;
    }

    public static String getTelefono() {
        return telefono;
    }

    public static void setTelefono(String telefono) {
        Persona.telefono = telefono;
    }
   
}
