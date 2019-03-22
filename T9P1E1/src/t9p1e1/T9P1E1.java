/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t9p1e1;

import Vista.Personas;
import javax.swing.JOptionPane;

import Modelo.*;
import java.sql.*;
public class T9P1E1 {

    public static Persona p;
    public static Personas perV;
    public static PersonaDAO oPersonaDAO;
    //opcion 1
    public static void main(String[] args) {
        BaseDatos bd = new BaseDatos();
        Connection con = bd.conectar();
        if(con == null)
        {
            System.out.println("Problemas con la base de datos");
            System.exit(-1);
        }
        menu();
        perV = new Personas();
        perV.setVisible(true);
        oPersonaDAO = new PersonaDAO();
        guardarDatos();
    }
    //opcion 2

    private static void menu() {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"Elige una opción" + "\n"
        + "1. Registrar una persona" + "\n"+"2. Consultar datos de una persona" + "\n"
        + "3. Consultar personas" + "\n" + "4.Salir" + "\n" + "Opción elegida"));
        switch(opcion){
            case 1: registarPersonasM();
                    break;
            case 2: consultarDatosM();
                    break;
            case 3: consultarPersonasM(); 
                    break;
            case 4: salir();
                    break;
        }
    }

    public static void registarPersonasM(String nombre, String edad) {
       p = new Persona(nombre,edad);
      //insertar
      oPersonaDAO.darAlta(p);
       
       
    }

    public static void consultarDatosM() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void consultarPersonasM() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void salir() {
        System.exit(0);
    }

    private static void guardarDatos() {
        
    }
    
}
