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
public class ejercicio10 {
    public static void main(String[] args) {
    String dia;
    dia = javax.swing.JOptionPane.showInputDialog(null, "Indica el dia de la semana en numero (1 al 7)");
    int dias = Integer.parseInt(dia);
    switch (dias)
    {
        case 1:
            javax.swing.JOptionPane.showMessageDialog(null, "Hoy es lunes");
            break;
        case 2:
            javax.swing.JOptionPane.showMessageDialog(null, "Hoy es martes");
            break;
        case 3:  
            javax.swing.JOptionPane.showMessageDialog(null, "Hoy es miercoles");
            break;
        case 4:
            javax.swing.JOptionPane.showMessageDialog(null, "Hoy es jueves");
            break;
        case 5:
            javax.swing.JOptionPane.showMessageDialog(null, "Hoy es viernes");
            break;
        case 6:
            javax.swing.JOptionPane.showMessageDialog(null, "Hoy es sabado");
            break;
        case 7:
            javax.swing.JOptionPane.showMessageDialog(null, "Hoy es domingo");
            break;
        default:
            javax.swing.JOptionPane.showMessageDialog(null, "El numero que has metido no entra entre el (1 al 7) ");
            break;
    }
    }
    
}
