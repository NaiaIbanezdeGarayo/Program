/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerejemplo;

/**
 *
 * @author 1gdaw05
 */
public class PrimerEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo");
        javax.swing.JOptionPane.showMessageDialog(null, "Hola");
        String nombre;
        nombre= javax.swing.JOptionPane.showInputDialog("¿Como te llamas?");
        javax.swing.JOptionPane.showMessageDialog(null, "Hola " + nombre);
        
        for (int i=0; i<= 12; i ++)
        {
            System.out.println("12 *" + i + " = " + 12*i );
        }
    }
    
}
