/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.time.LocalDate;

/**
 *
 * @author Naia
 */
public class Empleado {
    private String dni;
    private String nss;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String telefono;
    private String sexo;
    private String estadoCivil;
    private Contrato tipoContrato;
    private Departamento nombreDepartamento;
    private LocalDate fechaAlta;
    private int nºempleado;
    
    public Empleado(){
    
    }
    public Empleado(String dni, String nss, String nombre, String apellidos, String direccion, String telefono, String sexo, String estadoCivil, Contrato tipoContrato, LocalDate fechaAlta, int nºempleado) {
        this.dni = dni;
        this.nss = nss;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.tipoContrato = tipoContrato;
        this.fechaAlta = fechaAlta;
        this.nºempleado = nºempleado;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Contrato getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(Contrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public Departamento getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(Departamento nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public int getNºempleado() {
        return nºempleado;
    }

    public void setNºempleado(int nºempleado) {
        this.nºempleado = nºempleado;
    }
}
