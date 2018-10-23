/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw05
 */
public class ejercicio16 {
    public static void main(String[] args) {
        int contador = 0;
        int sumaEdades = 0;
        String respuesta;
        
        do 
        {
            int edad = Integer.parseInt (JOptionPane.showInputDialog(null,"Teclea una edad"));
            contador ++; 
            sumaEdades += edad;
            respuesta = JOptionPane.showInputDialog(null, "¿Quieres continuar?");
            //respuest= JOptionPane.showConfirmDialog(null, "Te pregunto");
            //para que salgan botones de si, no o cancelar
        }
        while (respuesta.equals("si"));
        JOptionPane.showMessageDialog(null, "La  media es" + (sumaEdades/contador));
    }
    
        
}
