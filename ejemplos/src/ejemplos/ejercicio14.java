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
public class ejercicio14 {
    public static void main(String[] args) 
    {
        int contador = 0; 
        String respuesta;
        do
        {
            int nota = Integer.parseInt(JOptionPane.showInputDialog(null, "Teclea una nota"));
            if (nota >= 6)
                contador = contador + 1;
            respuesta = JOptionPane.showInputDialog(null, "¿Quieres continuar?");
            do {
                respuesta=  JOptionPane.showInputDialog(null, "¿Quieres continuar?");
            }
            while (respuesta.equalsIgnoreCase("si")== false && respuesta.equalsIgnoreCase("no")== false );
        }
        while (respuesta.equalsIgnoreCase("si")); //== true ! false
        JOptionPane.showMessageDialog(null, "El numero de aprobado es" + contador);
    }
}
