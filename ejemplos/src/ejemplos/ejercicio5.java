/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author 1gdaw05
 */
public class ejercicio5 {
    public static void main(String[] args) {
        String grados;
        grados = javax.swing.JOptionPane.showInputDialog("Introduce el valor de grados");
        int g1 = Integer.parseInt(grados);
        double resultado = 1.8*g1+32;
        javax.swing.JOptionPane.showMessageDialog(null, resultado);
    }
   
}
