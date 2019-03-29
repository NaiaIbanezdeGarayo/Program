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
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
    public static Evento even;
    
    public static void main(String[] args) {
        cBD = new EventosDAO();
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
    
    public static void guardarDatosEvento(String nombre, String lugarEvento, String fechaEvento, String horaInicio, String horaFinal,String capacidad) throws Exception {
     
     // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
      //LocalDate f = LocalDate.parse(fechaEvento,formatter); 
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date f = formatter.parse(fechaEvento);
        java.sql.Date fecha =new java.sql.Date(f.getTime());
        
        SimpleDateFormat formatte = new SimpleDateFormat("HH:mm:ss");
        long hI = formatte.parse(horaInicio).getTime();
        java.sql.Time horaI =new Time(hI);
        
        
        
        long hF = formatte.parse(horaFinal).getTime();
        java.sql.Time horaF =new Time(hF);
     
      //DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm:ss");
      //LocalTime hi = LocalTime.parse(horaInicio,formatTime);
     
      //LocalTime hf = LocalTime.parse(horaFinal,formatTime);
     
      even = new Evento (nombre,lugarEvento,fecha,horaI,horaF,capacidad);
      cBD.registrarEventos(even);
      
      JOptionPane.showMessageDialog(null,"Se ha creado el evento");
      va.dispose();
      
    }

    
    
}




