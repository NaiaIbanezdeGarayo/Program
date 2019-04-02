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
    private ResultSet resultado;
    private PreparedStatement sentenciaPre;
    private Evento ev;
    
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
               
                conexion.getConnection().close();
                
        }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, "No se ha podido insertar el evento.");
       }
    }
    public void borrarEventos(String respuesta){
        try{
            conexion = new ConexionBD();
            conexion.conectar();
            String borrar = "DELETE FROM EVENTOS WHERE nombre = ?;";
            PreparedStatement ps = conexion.getConnection().prepareStatement(borrar);
            ps.setString(1, respuesta);
            int n = ps.executeUpdate();
            conexion.getConnection().close();
            if (n != 1){}
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"No se ha podido borrar el evento.");
        }
    }

    public Evento consultarEvento(String respuestaM) {
       try{
           conexion = new ConexionBD();
           conexion.conectar();
           String consultar = "SELECT FROM EVENTOS WHERE nombre = ?;";
           PreparedStatement ps = conexion.getConnection().prepareStatement(consultar);
           ps.setString(1, respuestaM);
           
          
           resultado = sentenciaPre.executeQuery();
           if(resultado.next())
           {
               crearObjeto();
               
           }
           else{JOptionPane.showMessageDialog(null,"No se ha podido encontrar el evento");}
            conexion.getConnection().close();
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(null,"No se ha podido consultar el evento.");
       }
       return ev;
    }

    private void crearObjeto() throws Exception{
        ev = new Evento();
        ev.setNombre(resultado.getString("nombre"));
        ev.setLugarEvento(resultado.getString("lugarEvento"));
        ev.setFechaEvento(resultado.getDate("fechaEvento"));
        ev.setHoraInicio(resultado.getTime("horaInicio"));
        ev.setHoraFinal(resultado.getTime("horaFinal"));
        ev.setCapacidad(resultado.getString("capacidad"));
        
    }

    public void modificarEventos(Evento even) {
     try{
                conexion = new ConexionBD();   
                conexion.conectar();

                String plantilla = "UPDATE eventos SET LugarEvento = ?, FechaEvento = ?, HoraInicio = ?, HoraFinal = ?,Capacidad = ? WHERE nombre = ? ;";
                PreparedStatement ps = conexion.getConnection().prepareStatement(plantilla);
                ps.setString(1,ev.getLugarEvento());
                ps.setDate(2, ev.getFechaEvento());
                ps.setTime(3,ev.getHoraInicio());
                ps.setTime(4, ev.getHoraFinal());
                ps.setString(5,ev.getCapacidad());
                ps.setString(6,ev.getNombre());
               
                conexion.getConnection().close();
                
        }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, "No se ha podido modificar el evento.");
       }    
    }
    
       
}
