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
public class ejercicio1 {
    public static void main(String[] args) {
        String cadena = JOptionPane.showInputDialog(null, "Escribe una frase");
        int numero = contarVocales(cadena); 
        JOptionPane.showMessageDialog(null, "La cadena tiene" +  numero + "vocales");
             
    }



public static int contarVocales (String cadena){   
    int contador = 0;
        for (int x = 0; x < cadena.length(); x++)
        {
            switch(cadena.charAt(x))
            {
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    contador =  contador + 1;
                    break;
            }
        }
        return contador;
}
}