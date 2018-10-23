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
public class ejercicio12 {
    public static void main(String[] args) {
        String minutos;
        minutos = javax.swing.JOptionPane.showInputDialog("Teclea el consumo mensual");
        double consumo = Double.parseDouble(minutos);
        double importe = 0;
        if (consumo > 300)
        {
            if (consumo > 500)
            {
             importe = ((300*0.03) + ((consumo - 300)*0.02));
                if (consumo > 800)
                {
                 importe = (importe - importe *1.25/100);
                 javax.swing.JOptionPane.showMessageDialog(null, "El importe es: "+ importe);
                }
                 else{
                       javax.swing.JOptionPane.showMessageDialog(null, "El importe es: "+ importe);
                }
            }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
            else {importe = (consumo*0.03);
                  javax.swing.JOptionPane.showMessageDialog(null, "El importe es: "+ importe);
            }     
                   
        }
        else {
            importe = (consumo * 0.04);
            javax.swing.JOptionPane.showMessageDialog(null, "El importe es: "+ importe);
        }
    }}
 