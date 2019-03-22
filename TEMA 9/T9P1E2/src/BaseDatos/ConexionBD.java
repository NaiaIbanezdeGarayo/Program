/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConexionBD {
    //Parametros de conexion
    private String bd = "eventos";
    private String login = "root";
    private String password = "usbw";
    private String url = "jdbc:mysql://localhost:3306/"+bd;
    
    // constantes???
    // Parametros para el constructor??
    // Todo static como en la clase principal???
 
    private Connection connection;
 
    public ConexionBD(){}
    
    public void conectar() throws Exception
    {
         //obtenemos el driver para mysql
         Class.forName("com.mysql.jdbc.Driver");
         //obtenemos la conexión
         connection = DriverManager.getConnection(url,login,password);
 
         if (connection==null){
            throw new Exception("Problemas con la conexión");
         }
         
   }
    
    public Connection getConnection(){
      return connection;
   }
 
    public void desconectar() throws Exception{
      connection.close();
   }
}
