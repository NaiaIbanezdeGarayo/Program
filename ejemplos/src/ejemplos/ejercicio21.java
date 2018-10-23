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
public class ejercicio21 {
    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog(null, "Teclea un número");
        int num = Integer.parseInt (numero);
        int divisor = num ;
        int resto;
        do
        {
            divisor = divisor -1;
            resto = num % divisor;
        }
        while(resto !=0 && divisor > 2);
        if(resto ==0)
            JOptionPane.showMessageDialog (null, "El número " + num + " NO es primo");
        else
            JOptionPane.showMessageDialog (null, "El número" + num+ "SI ea primo");
    }
}
