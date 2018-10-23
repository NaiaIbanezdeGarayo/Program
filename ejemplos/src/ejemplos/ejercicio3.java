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
public class ejercicio3 {
    
     public static void main(String[] args) 
     {
         String valor1;
         valor1 = javax.swing.JOptionPane.showInputDialog("Escribe el valor 1 de la base");
         int n1 = Integer.parseInt (valor1);
         String valor2;
         valor2 = javax.swing.JOptionPane.showInputDialog("Escribe el valor 2 de la base");
         int n2 = Integer.parseInt (valor2);
         int resultado = 2*n1+2*n2;
         javax.swing.JOptionPane.showMessageDialog(null, resultado);
         
     
     
     }
    
}
