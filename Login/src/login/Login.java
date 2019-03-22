/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

/**
 *
 * @author Naia
 */
public class Login {

    public static Personal p;
    public static InicioSesion login;
    public static int contador = 0;
    public static void main(String[] args) {
        crearVentana();

    }

    private static void crearVentana() {
        login = new InicioSesion();
        login.setVisible(true);
    }
    public static void comprobarDatos(){
        p = new Personal ("root", "12345");
    }
    
    public static void datosErroneos(){
    if
    }
}
