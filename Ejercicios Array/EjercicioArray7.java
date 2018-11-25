/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarray7;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw05
 */
public class EjercicioArray7 {
       int [] codigos = {10, 23, 30, 47, 55, 65, 135, 256, 526, 663};
       int [] productos;
       int [] cantidad= new int [10];
       int [] cantidadProducto;
    
    public static void main(String[] args) {
       int continuar;
       do
        {
            int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el codigo del producto"));
            int cantidadProd = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de productos vendidos"));
            
            
            
            continuar= JOptionPane.showConfirmDialog(null, "Quieres seguir?");
        }
       while(continuar ==0);
    }
    
}
