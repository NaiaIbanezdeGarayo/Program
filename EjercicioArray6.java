/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarray6;

import java.util.Arrays;
import javax.swing.JOptionPane;


public class EjercicioArray6 {

    
    public static void main(String[] args) {
    
        int [] dias = new int [5];
        int [] codigos= new int[5];
        int [] faltas = new int [5];
        calcularfaltas(dias, codigos,faltas);
        
    }

    private static void calcularfaltas(int[] dias, int[] codigos, int[] faltas) {
        for (int i = 0; i < dias.length; i++) 
        {
            String codigo = JOptionPane.showInputDialog("Introduce el codigo del alumno");
            int dia = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dia de la falta/s"));
            int falta = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de faltas"));
                if(Arrays.toString(codigos).contains(codigo))
                    {
                        
                    }
        }
        
    }
    public static void comprobarCodigo (int [] codigos) {
    
        codigos [0]= 012 ;
        codigos [1]= 345 ;
        codigos [2]= 678 ;
        codigos [3]= 901 ;
        codigos [4]= 234 ;
    }
    
}
