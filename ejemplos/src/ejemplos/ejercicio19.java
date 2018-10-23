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
public class ejercicio19 {
    public static void main(String[] args) {
        int contador=0;
        int nroImpar=1;
        int resultado=0;
        String n1 = JOptionPane.showInputDialog(null, "Teclea el número");
        int nro = Integer.parseInt(n1);
        while (contador < nro)
        {
            resultado= resultado + nroImpar;
            nroImpar= nroImpar + 2;
            contador= contador + 1;
        }
         
        
            JOptionPane.showMessageDialog(null, "El resultado es : " + resultado);
        
    }
}
