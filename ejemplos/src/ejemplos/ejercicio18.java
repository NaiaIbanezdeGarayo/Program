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
public class ejercicio18 {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 1;
        int n3 ;
        int contador = 2;
        String serie = n1 + " " + n2 + " ";
        int nroFinal = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuantos números quieres de la serie de Fibonacci?"));
        while (contador < nroFinal)
        {
            n3 = n1+ n2;
            serie = serie + n3 + " ";
            contador ++;
            n1 = n2 ;
            n2 = n3 ;
        }
        JOptionPane.showMessageDialog(null, serie);
    }
}
