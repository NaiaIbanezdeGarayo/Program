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
public class ejercicio20 {
    public static void main(String[] args) {
        int nMax = 100;
        String palabra= "resg";
        int numeroAleatorio = (int)(Math.random()* nMax);
        String n1 = JOptionPane.showInputDialog(null,"Teclea un número");
      
        JOptionPane.showMessageDialog(null, numeroAleatorio);
        while ( palabra.equalsIgnoreCase("fin")==false)
            {
               int  nro = Integer.parseInt(n1);
                if(nro != numeroAleatorio)
                    {
                       if (nro < numeroAleatorio)
                       {
                           JOptionPane.showMessageDialog(null, "Intentalo con un número más grande");
                       }
                       else 
                           JOptionPane.showMessageDialog(null,"Inténtalo con un número más pequeño");
                       n1 = JOptionPane.showInputDialog(null, "Teclea otro número");
                    }
                else 
                {
                    JOptionPane.showMessageDialog(null, "Enhorabuena has acertado el número aleatorio, y es el : "+ numeroAleatorio); 
                    n1= "Fin";
                }
            }
        JOptionPane.showMessageDialog(null, "El número aleatorio es: " + numeroAleatorio);
    }
}
