/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

/**
 *
 * @author Naia
 */
public class Personal {
    private String nombre;
    private String password;
    
    
    private Contrato c;
    private Departamento d;

    public Contrato getC() {
        return c;
    }

    public void setC(Contrato c) {
        this.c = c;
    }

    public Departamento getD() {
        return d;
    }

    public void setD(Departamento d) {
        this.d = d;
        d.setlistaPersona(this);
    }
    public Personal(){
    
    }
    public Personal(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
