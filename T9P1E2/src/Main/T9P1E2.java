/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import BaseDatos.ConexionBD;
import BaseDatos.EventosDAO;
import UML.Evento;
import Vista.VentanaAlta;
import Vista.VentanaBaja;
import Vista.VentanaModificacion;
import Vista.VentanaPrincipal;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Naia
 */
public class T9P1E2 {
    
    
    public static VentanaPrincipal vp;
    public static VentanaAlta va;
    public static VentanaModificacion vm;
    public static VentanaBaja vb;
    public static EventosDAO cBD;
    public static Evento ev;
    
    public static void main(String[] args) {
        abrirVentanaPrincipal();
    }

    

    private static void abrirVentanaPrincipal() {
        vp = new VentanaPrincipal();
        vp.setVisible(true);
    }

    public static void abrirVentanaAlta() {
        vp.dispose();
        va = new VentanaAlta();
        va.setVisible(true);
        
    }
    public static void abrirVentanaModificacion(){
        vp.dispose();
        vm= new VentanaModificacion();
        vm.setVisible(true);
    }
    
    public static void guardarDatosEvento(String n, String l, String fe, String hI, String hF,String c) {
      ev = new Evento();  
      ev.setNombre(n);
      ev.setLugarEvento(l);
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      LocalDate f = LocalDate.parse(fe,formatter); 
      ev.setFechaEvento(f);
      DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm:ss");
      LocalTime hi = LocalTime.parse(hI,formatTime);
      ev.setHoraInicio(hi);
      LocalTime hf = LocalTime.parse(hF,formatTime);
      ev.setHoraFinal(hi);
      
      cBD.registrarEventos(ev);
      JOptionPane.showMessageDialog(null,"Se ha creado el evento");
      va.dispose();
      
    }

    
    
}




