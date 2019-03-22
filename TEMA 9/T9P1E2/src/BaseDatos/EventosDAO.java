/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import UML.Acontecimiento;
import UML.Evento;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.Global.getDate;
import static jdk.nashorn.internal.objects.NativeDate.getTime;

/**
 *
 * @author Naia
 */
public class EventosDAO {
    private  Connection con;
    
    public EventosDAO(Connection con)
    {
        this.con = con;
    }
 
   
    public void registrarEventos(Evento ev) 
    {
       try{
                
        String plantilla = "INSERT INTO personas VALUES (?,?,?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, ev.getNombre());
        ps.setString(2,ev.getLugarEvento());
        ps.setDate(3, conversionDate(ev.getFechaEvento()));
        ps.setTime(4,conversionTime(ev.getHoraInicio()));
        ps.setTime(5, conversionTime(ev.getHoraFinal()));
        ps.setString(6,ev.getCapacidad());
        int n = ps.executeUpdate();
        ps.close();
        if (n != 1){}
        }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, "El número de filas actualizadas no es uno");
       }
    }
   

    private Date conversionDate(LocalDate fechaEvento) {
        return java.sql.Date.valueOf(fechaEvento);
    }

    private Time conversionTime(LocalTime horaInicio) {
        return java.sql.Time.valueOf(horaInicio);
    }
    public java.sql.Time conversionTime(LocalTime horaFinal) {
        return java.sql.Time.valueOf(horaFinal);
    }
}
