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
public class ejercicio11 {
    public static void main(String[] args) {
        String numeros;
        numeros = javax.swing.JOptionPane.showInputDialog("Teclea el primer numero");
        int n1= Integer.parseInt(numeros);
        numeros = javax.swing.JOptionPane.showInputDialog("Teclea el primer numero");
        int n2 = Integer.parseInt(numeros);
        numeros = javax.swing.JOptionPane.showInputDialog("Teclea el primer numero");
        int n3 = Integer.parseInt(numeros);
        if (n1>n2 && n1 > n3)
            {
            javax.swing.JOptionPane.showMessageDialog(null, n1 + " es el más grande");
            if (n2 > n3) 
               {
                javax.swing.JOptionPane.showMessageDialog(null, n3 + " es el más pequeño");
               }
            else javax.swing.JOptionPane.showMessageDialog(null, n2 + " es el mas pequeño");
            }
        else 
            {
            if(n2 > n3)
                {
                javax.swing.JOptionPane.showMessageDialog(null, n2 + " es el más grande");
                if(n1 > n3)
                    {
                     javax.swing.JOptionPane.showMessageDialog(null, n3 + " es el más pequeño");
                    }
                else
                    {
                     javax.swing.JOptionPane.showMessageDialog(null, n1 + " es el más pequeño");
                    }
                }
            else{
                javax.swing.JOptionPane.showMessageDialog(null, n3 + " es el más grande");
                if (n1 > n2)
                    {
                     javax.swing.JOptionPane.showMessageDialog(null, n1 + " es el más pequeño");
                    }
                else javax.swing.JOptionPane.showMessageDialog(null, n2 + " es el más pequeño");
                }        
            }
 
                
                
            
            }
}
