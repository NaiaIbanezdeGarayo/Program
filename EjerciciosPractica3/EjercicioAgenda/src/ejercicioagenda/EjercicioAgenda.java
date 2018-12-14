/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioagenda;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Naia
 */
public class EjercicioAgenda {
public static ArrayList<Agenda>alumno= new ArrayList();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        pedirDatos();
        introducirCodigo();
        
    }

    private static void pedirDatos() {
       int confirmacion;
       
        do
        {
            Agenda alum = new Agenda();
            alum.setCodigo(JOptionPane.showInputDialog("Introduce un código para el alumno"));
            alum.setNombre (JOptionPane.showInputDialog("Introduce el nombre del alumno"));
            alum.setDomicilio (JOptionPane.showInputDialog("Introduce el domicilio"));
            alum.setTelefono(JOptionPane.showInputDialog("Introduce el número del alumno"));
            confirmacion = JOptionPane.showConfirmDialog(null,"Quieres continuar introduciendo datos de alumnos?");
            alumno.add(alum);
        }
       while(confirmacion==1);
    }

    private static void introducirCodigo() {
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el código del alumno"));
        for (int i = 0; i < alumno.size() && alumno.getCodigo == codigo; i++) 
        {}
        if(alumno.getCodigo==codigo)
        {
            JOptionPane.showMessageDialog(null, "Estos son los datos del código " + alumno.getCodigo + ":\n" +
                                          "Nombre: "+ alumno.getNombre+ "\n" + "Domicilio :" + alumno.getDomicilio +"\n" +
                                          "Teléfono:" + alumno.getTelefono);
        }
        
    }
    
}
