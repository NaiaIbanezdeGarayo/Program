/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.Statement;




/**
 *
 * @author Naia
 */
public class PersonaDAO {
    private Connection con;
    public void darAlta(){
        this.con=con;
    }
    public void darAlta(Persona p)
    {
        try{
            Statement sentencia = con.createStatement();
            int n = sentencia.executeUpdate("INSERT INTO bdPersonas VALUES ('Pepe',35);");
            //String s ="INSERT INTO bdpersonas VALUES('"+ p.getNombre() + "'," + p.getEdad() + ");";
            //int n = sentencia.executeUpdate(s);
            if (n == 0){
                System.out.println("Cero filas");
            }
        }
        catch(Exception e){
            System.out.println(e.getClass() + e.getMessage());
        }
    }
}
