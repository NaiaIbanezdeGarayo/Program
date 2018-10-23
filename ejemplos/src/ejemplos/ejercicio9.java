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
public class ejercicio9 {
    public static void main(String[] args) 
    {
    String nota;
    nota = javax.swing.JOptionPane.showInputDialog("Introduce la nota(0 al 10)");
    double n1 = Double.parseDouble(nota);
    if (n1 >= 0 && n1 <= 10)
        {
            if (n1 >=5)
                {
                    if (n1<7)
                        {
                            if (n1>=6)
                                javax.swing.JOptionPane.showMessageDialog(null, "Bien");
                            else
                                javax.swing.JOptionPane.showMessageDialog(null, "Suficiente");
                        }
                        
                    else
                        {
                            if (n1>=9)
                                javax.swing.JOptionPane.showMessageDialog(null, "Sobresaliente");
                            else javax.swing.JOptionPane.showMessageDialog(null, "Notable");
                        }
                    {
                            
                    }
                }
            else
                {
                    if (n1>4)
                    javax.swing.JOptionPane.showMessageDialog(null, "Deficiente");
                    else javax.swing.JOptionPane.showMessageDialog(null, "Insuficiente");
                }
        }
        
    else
        {
        javax.swing.JOptionPane.showMessageDialog(null, "El numero que has introducido no es correcto");
        }
    }
}
