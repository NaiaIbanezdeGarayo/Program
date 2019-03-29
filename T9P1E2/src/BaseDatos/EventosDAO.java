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
    private Connection con;
    private ConexionBD conexion;
    
    public EventosDAO(Connection con)
    {
        this.con = con;
    }
    public EventosDAO(){}
   
    public void registrarEventos(Evento ev) 
    {
       try{
                conexion = new ConexionBD();   
                conexion.conectar();

                String plantilla = "INSERT INTO eventos VALUES (?,?,?,?,?,?);";
                PreparedStatement ps = conexion.getConnection().prepareStatement(plantilla);
                ps.setString(1, ev.getNombre());
                ps.setString(2,ev.getLugarEvento());
                ps.setDate(3, ev.getFechaEvento());
                ps.setTime(4,ev.getHoraInicio());
                ps.setTime(5, ev.getHoraFinal());
                ps.setString(6,ev.getCapacidad());
                int n = ps.executeUpdate();
                conexion.getConnection().close();
                if (n != 1){}
        }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, "El número de filas actualizadas no es uno");
       }
    }
       
}
