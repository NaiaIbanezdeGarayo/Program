/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;


public class Aplicacion {
    private static int contador = 0;
    private static iniciosesion login;
    private static Personal admin;
    public static void main(String[] args) {
    crearVentanaLogin();
    crearPersonal();
    
    
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
            crearVentanaInicioSesion();    
        }
        else{
            contador++;
            login.limpiarCampos();
        }
    }

    private static void crearPersonal() {
     admin = new Personal("root","root");   
    }

    private static void crearVentanaInicioSesion() {
        
    }

    private static void cerrarVentanaLogin() {
        login.dispose();
    }

    
    
}
