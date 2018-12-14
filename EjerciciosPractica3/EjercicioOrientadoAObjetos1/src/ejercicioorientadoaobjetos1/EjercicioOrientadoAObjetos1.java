/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioorientadoaobjetos1;

import javax.swing.JOptionPane;


        
public class EjercicioOrientadoAObjetos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Esfera r1 = new Esfera();
       r1.setRadio(Integer.parseInt(JOptionPane.showInputDialog("Teclea el valor de radio")));
       int nMenu = Integer.parseInt(JOptionPane.showInputDialog("Teclea una de las tres opciones: \n" + 
               "1.Calcular longitud de la circunferencia. \n" + "2.Calcular área. \n"+ "3.Calcular el volúmen de la esfera. \n"));
       
            switch(nMenu)
            {
                case 1 : calcularLongitud(r1);
                break;
                case 2: calcularArea(r1);
                break;
                case 3: calcularVolumen(r1);
                break;
                
            }
        
    }

    private static void calcularLongitud(Esfera r1) {
        JOptionPane.showMessageDialog(null,"La longitud de la circunferencia es " + r1.Longitud());
    }

    private static void calcularArea(Esfera r1) {
        JOptionPane.showMessageDialog(null,"El área de la esfera es " + r1.Area());
    }

    private static void calcularVolumen(Esfera r1) {
        JOptionPane.showMessageDialog(null,"El volumen de la esfera es " + r1.Volumen());    
    }
    
}
