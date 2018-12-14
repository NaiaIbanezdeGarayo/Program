/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarraylist1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Naia
 */
public class EjercicioArrayList1 {

    

    static ArrayList <Double> dato = new ArrayList();
    public static void main(String[] args) {
        
            
                pedirDatos();
                introducirMenu();
            
    }

    private static void pedirDatos() {
        int confirmacion = 0;
        do
            {
                try
                    {
                        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce un número"));
                        dato.add(n1);
                        confirmacion = JOptionPane.showConfirmDialog(null, "Quieres seguir introduciendo datos? ");
                    }
                catch(NumberFormatException e)
                    {
                        JOptionPane.showMessageDialog(null, "Introduce un número");
                    }
            }
        while( confirmacion == 0);
                
    }
    private static void introducirMenu() {
        int nMenu = Integer.parseInt(JOptionPane.showInputDialog("1.Visualizar el valor máximo y el mínimo\n"+
                "2.Solicitar el número y buscarlo. Muestra un mensaje indicando si lo has econtrado o no. \n"+
                "3.Solicitar un número, buscarlo y borrarlo. Sino se encuentra muestra un mensaje de error. \n" +
                "4.Convertir el arrayList en un array. \n"+
                "5.Si no esta vacío, mostrar el número de elementos que contiene. \n" +
                "6.Insertar un nuevo elemento por el final. \n" +
                "7.Insertar un nuevo elemento en la posición que te indique el usuario \n"+
                "8.Borrar un elemento de una posición concreta \n" +
                "9.Calcular la suma y la media aritmética de los valores contenidos \n" +
                "10.Finalizar"));
        if(nMenu>10 || nMenu<1)
            {
                JOptionPane.showMessageDialog(null,"Introduce un número válido");
            }
        else
            {
                switch(nMenu)
                {
                    case 1: valorMaxMin();
                    break;
                    case 2: solicitarNum();
                    break;
                    /*case 3: solicitarNumError();
                    break;*/
                    case 4: convertirArray();
                    break;
                    case 5: numElementos();
                    break;
                    case 6: nuevoElementoFinal();
                    break;
                    case 7: nuevoElementoPosicio();
                    break;
                    case 8: borrarElemento();
                    break;
                    case 9: calcular();
                    break;
                    case 10: finalizar();
                    break;
                }
            }    
    }
    private static void valorMaxMin() {
        double max, min;
        max= min = dato.get(0);
        for (int i = 1; i < dato.size(); i++) 
        {
            if(dato.get(i) > max)
                {
                    max = dato.get(i);
                    JOptionPane.showMessageDialog(null, "Este es el número máximo " + max);
                }
            else if (dato.get(i)< min)
                {
                    min = dato.get(i);
                    JOptionPane.showMessageDialog(null, "Este es el número mínimo " + min);
                }
        }
    }
    
    private static void solicitarNum() {
        int i;
        double num= Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce un número"));
        for (i = 0; i < dato.size() && num != dato.get(i); i++) 
        {}
            if(i == dato.size() )
                JOptionPane.showMessageDialog(null, "El número solicitado no ha sido encontrado");
             else 
                JOptionPane.showMessageDialog(null, "El número solicitado ha sido encontrado en la posicion " +i);
          
        
        //String datos="";
        //for(Double elemento: lista)
        //datos += elemento + " ";
        // return datos;
    }

    /*private static void solicitarNumError() {
        Double numero= pedirDatos();
        if (lista.contains(numero))
            JOptionPane.showMessageDialog(null, "El número se encuentra en la lista");
        else 
            JOptionPane.showMessageDialog(null, "El número indicado no se encuentra en la lista");
        int i;
        for (int i = 0; i < dato.size() && lista.get(i) .doubleValue()!= numero.contains ; i++) {
            
        }
    }*/

    

    private static void convertirArray() {
        
        Object [] lista = dato.toArray();
    }

    private static void numElementos() {
        while(!dato.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "El número de elementos es de "+ dato.size());
        }
    //double longitud = dato.size();
    }

    private static void nuevoElementoFinal() {
      double num= Double.parseDouble(JOptionPane.showInputDialog("Introduce un número"));
      dato.add(num);
    }

    private static void nuevoElementoPosicio() {
        Double element = Double.parseDouble(JOptionPane.showInputDialog("Introduce un elemento")); 
        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Introduce en que posicion quieres añadir el elemento"));
        dato.add(posicion,element);
    }

    private static void borrarElemento() {
        int position = Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion que quieras eliminar"));
        dato.remove(position);
    }

    private static void calcular() {
     double suma= 0;
        for (int i = 0; i < dato.size(); i++) {
           suma= suma + dato.get(i);
           
        }
        JOptionPane.showMessageDialog(null, "La suma de los números es "+ suma);
        JOptionPane.showMessageDialog(null, "La media de el ArrayList es " + suma/dato.size());
    }   

    private static void finalizar() {
        System.exit(0);
    }
    
}

   
