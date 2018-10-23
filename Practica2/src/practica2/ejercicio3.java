/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import javax.swing.JOptionPane;
/**
 *
 * @author 1gdaw05
 */
public class ejercicio3 {
    static String cadena1 = "";
    public static void main(String[] args) {
        String cadena = JOptionPane.showInputDialog("Teclea una cadena de caracteres");
        fcadena (cadena);
        // int numero = contarCadena (cadena);
        //JOptionPane.showMessageDialog(null, "La cadena se repite" + contadorA + "veces");
        
    }
    public static void fcadena(String cadena1) {
       int contadorA = 0;
        for (int x = 0; x < cadena1.length(); x++)
        {
          char letraMensaje = cadena1.charAt(x) ;  
          if (letraMensaje=='a')
          {
                contadorA ++;
          }
        }
        JOptionPane.showMessageDialog(null, "La cadena se repite " + contadorA + " veces");
    }
        
       
    }

