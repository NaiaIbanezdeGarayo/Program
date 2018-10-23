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
public class ejercicio8 {
    public static void main(String[] args) {
        String nota;
        nota = javax.swing.JOptionPane.showInputDialog("Escribe la nota");
        int n1 = Integer.parseInt(nota);
        if(n1>=0 && n1<=10)
            {
                if (n1 <5)
                javax.swing.JOptionPane.showMessageDialog(null, "Has suspendido");
                else
                javax.swing.JOptionPane.showMessageDialog(null, "Has aprobado");
            }
        else 
            {
            javax.swing.JOptionPane.showMessageDialog(null, "El numero que has introducido no es correcto" );
            }
    }
    
}
