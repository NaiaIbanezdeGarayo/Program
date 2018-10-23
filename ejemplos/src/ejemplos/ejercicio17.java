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
public class ejercicio17 {
    public static void main(String[] args) {
       
        int maximo = -1;
        int minimo = 11;
        String nombreMin = "";
        String nombreMax = "";
        for(int contador = 0; contador <5; contador ++)
        {
            String n1 = JOptionPane.showInputDialog(null, "Introduce la nota: ");
            int nota = Integer.parseInt(n1);
            String nombre = JOptionPane.showInputDialog (null, "Introduce tu nombre: ");
            if(nota > maximo){
                maximo = nota;
                nombreMax = nombre;
            }
            if (nota < minimo)
            {
                minimo = nota;
                nombreMin = nombre; 
            }
        }
        JOptionPane.showMessageDialog(null,nombreMax + " es el alumno con la califación más alta " + maximo );
        JOptionPane.showMessageDialog(null,nombreMin + " es el alumno con la califación más baja " + minimo );
    }
}
