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
public class ejercicio13 {
    public static void main(String[] args) {
        int suma = 0;
        for (int contador = 0; contador < 10; contador ++)
        {
        int n = Integer.parseInt (JOptionPane.showInputDialog(null, "Teclea un numero"));
                suma = suma + n;
        }
        JOptionPane.showMessageDialog (null, "El resultado de la suma es" + suma);
    }
}
