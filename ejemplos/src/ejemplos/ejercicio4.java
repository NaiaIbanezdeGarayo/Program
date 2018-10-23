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
public class ejercicio4 {
    public static void main(String[] args) {
        String valorD;
        valorD = javax.swing.JOptionPane.showInputDialog("Introduce el valor de D");
        int n1 = Integer.parseInt (valorD);
        String valord;
        valord = javax.swing.JOptionPane.showInputDialog("Introduce el valor de d");
        int n2 = Integer.parseInt(valord);
        int resultado = n1*n2/2;
        javax.swing.JOptionPane.showMessageDialog(null, resultado);
        
    }
}
