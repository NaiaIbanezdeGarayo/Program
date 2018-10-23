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
public class ejercicio7 {
    public static void main(String[] args) {
         
        String b;
        b = javax.swing.JOptionPane.showInputDialog("Escribe la medida de b");
        double mb = Integer.parseInt(b);
        String c;
        c = javax.swing.JOptionPane.showInputDialog("Escribe la medida de c");
        double mc = Integer.parseInt(c);
        double medidas = Math.sqrt(Math.pow(mb, 2)+Math.pow(mc, 2));
        javax.swing.JOptionPane.showMessageDialog(null, medidas);
        
    }
            
    
}
