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
public class ejercicio6 {
    public static void main(String[] args) {
        String radio;
        radio = javax.swing.JOptionPane.showInputDialog("Introduce el resultado de radio");
        int r = Integer.parseInt(radio);
        double resultado = Math.PI *r*r;
        javax.swing.JOptionPane.showMessageDialog(null, resultado);
    }
}
