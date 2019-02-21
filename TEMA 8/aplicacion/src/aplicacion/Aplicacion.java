/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.util.ArrayList;
import javax.swing.JComboBox;


public class Aplicacion {
    private static int contador = 0;
    private static iniciosesion login;
    private static paginaprincipal ventanaPrincipal;
    private static Personal admin;
    private static VentanaAltaBaja altasBajas;
    public static void main(String[] args) {
    crearVentanaLogin();
    crearPersonal();
    crearTipoContrato();
    crearNombreDepartamento();
    
    }

    private static void crearVentanaLogin() {
        login = new iniciosesion();
        login.setVisible(true);
    }
    
    public static void comprobarDatos(String contrasena, String usuario ) {
        if (contador>2) {
            System.exit(0);
        }
        if(usuario.equals(admin.getNombre())&& contrasena.equals(admin.getPassword())){
            cerrarVentanaLogin();
            
            
        }
        else{
            contador++;
            login.limpiarCampos();
        }
        
    }

    private static void crearPersonal() {
     admin = new Personal("root","root");   
    }

    

    private static void cerrarVentanaLogin() {
        login.dispose();
        crearPaginaPrincipal();
    }

    private static void crearTipoContrato() {
        String [] tipoContratos;
        tipoContratos = new String [3];
        tipoContratos[0]= "Indefinido";
        tipoContratos[1]= "Parcial";
        tipoContratos[2]= "Formativo";
    }

    private static void crearNombreDepartamento() {
        String [] nombreDepartamentos;
        nombreDepartamentos = new String[4];
        nombreDepartamentos[0]= "Informática";
        nombreDepartamentos[1]= "Gerente";
        nombreDepartamentos[2]= "Administracion";
        nombreDepartamentos[3]= "Comerciales";
    }

    static void darDeAlta(String dni,String nss, String nombre, String apellidos, String direccion, String telefono,
            String fechaAlta, String numeroEmpleado) {
            ArrayList<Empleado> listaPersona = new ArrayList();
       
        
    }

    private static void crearPaginaPrincipal() {
        ventanaPrincipal = new paginaprincipal();
        ventanaPrincipal.setVisible(true);    
    }

    
    public static void llenarContratos(JComboBox contratos){
        
    }

    public static void crearVentanaAlta() {
        altasBajas = new VentanaAltaBaja();
        altasBajas.setVisible(true);
    }
    

    
    
}
