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
public class ejercicio15 {
    public static void main(String[] args) {
          int contador = 0;
          int numeroAprobados = 0;
         
         
          do
          {
              int nota;
              nota = Integer.parseInt(JOptionPane.showInputDialog("Teclea una nota")); 
              
             if (nota >=6 )
              {
                  numeroAprobados = numeroAprobados +1;
              }
              
             String validar = JOptionPane.showInputDialog(null, "¿Quieres continuar?");
          }
        while(validar.equalsIgnoreCase("si")== true && validar.equalsIgnoreCase("no")== false);
        int nota = Integer.parseInt(respuesta);
      
        while (nota >=6)
        {
        String respuesta;
        
        
        }
        
    }
}
