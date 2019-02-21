/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.util.ArrayList;

/**
 *
 * @author Naia
 */
public class Departamento {
    private String nombreDepartamento;
    private ArrayList<Empleado> listaPersona;

    public ArrayList<Empleado> getListaPersona() {
        return listaPersona;
    }

    public void setListaPersona(ArrayList<Empleado> listaPersona) {
        this.listaPersona.add(p);
    }
    
    
    public Departamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }
    public Departamento() {
       
    }
    
    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }
}
