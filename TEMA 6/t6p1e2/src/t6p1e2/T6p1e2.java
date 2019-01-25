
package t6p1e2;

import Excepciones.*;
import Modelo.Alumno;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class T6p1e2 {

    public static void main(String[] args) {
        try
        {
            ArrayList<Alumno> listaClase;
            listaClase = obtenerDatosAlumnos();
            buscarPorCodigo(listaClase);
        }
        catch(Exception e)
        {
            System.out.println("Problemas");
        }
    }
    
    
    public static void buscarPorCodigo(ArrayList<Alumno> lista) throws Exception{
        String codigo = JOptionPane.showInputDialog("Teclea el código del alumno");
        // Validar
        validarCodigo(codigo);
        // Buscar por código
        int x;
        for(x = 0; x < lista.size() && lista.get(x).getCodigo().equals(codigo)== false; x++){}
        if( x == lista.size())
            JOptionPane.showMessageDialog(null,"Alumno no encontrado");
        else
            JOptionPane.showMessageDialog(null,"Objeto alumno: " + lista.get(x) + "\n" + lista.get(x).toString());
            
    }
    
    public static ArrayList<Alumno> obtenerDatosAlumnos(){
        ArrayList<Alumno> lista = new ArrayList();
        do
        {
            try
            {
                String codigo = JOptionPane.showInputDialog("Teclea el código del alumno");
                validarCodigo(codigo);
                String nombre = JOptionPane.showInputDialog("Teclea el nombre del alumno");
                validarNombre(nombre);
                String domicilio = JOptionPane.showInputDialog("Teclea el domicilio del alumno");
                validarDomicilio(domicilio);
                String telefono = JOptionPane.showInputDialog("Teclea el teléfono del alumno");
                validarTelefono(telefono);
                String edad = JOptionPane.showInputDialog("Teclea la edad del alumno");
                validarEdad(edad);
                LocalDate fechaNac = LocalDate.parse(JOptionPane.showInputDialog("Teclea la fecha de nacimiento del alumno"));
                validarFechaNac(fechaNac);
                String estadoCivil = JOptionPane.showInputDialog("Teclea el estado civil del alumno");
                validarEstadoCivil(estadoCivil);
                String email = JOptionPane.showInputDialog("Teclea el email del alumno");
                validarEmail(email);
                
            
                Alumno a = new Alumno(codigo,nombre,domicilio,telefono,edad,fechaNac,estadoCivil,email);
                
                lista.add(a);
            }
            catch(DatoNoValido e){
              JOptionPane.showMessageDialog(null,"El dato introducido no es correcto");
            }
            catch(Exception e)
            {
                System.out.println("Problemas");
            }
        }
        while(JOptionPane.showConfirmDialog(null,"¿ Quieres continuar?")==0);
        return lista;
    }
    
    public static void validarCodigo(String codigo)throws Exception{
        // Cinco dígitos numéricos
        
            Pattern validacionCodigo = Pattern.compile("^[0-9]{5}$");
            Matcher c = validacionCodigo.matcher(codigo);
            if(!c.matches())
                throw new DatoNoValido();
                
    }
    
    public static void validarNombre(String nombre)throws Exception{
        
            Pattern validacionNombre = Pattern.compile("^Abc.*");
            Matcher n = validacionNombre.matcher(nombre);
            if (n.matches()){
                throw new DatoNoValido();
            }
            
                    
    }
    
    public static void validarDomicilio(String domicilio)throws Exception{
        Pattern validacionDomicilio = Pattern.compile("^\\s[a-z]+\\s[0-9]{1,3}\\s[0-9]{1,2}[A-Z]?$");
            Matcher d = validacionDomicilio.matcher(domicilio);
            if (d.matches()){
                throw new DatoNoValido();
            }           
    }
    
    public static void validarTelefono(String telefono) throws Exception{
        // 9 digitos numéricos empezando por 6, 7 , 8 o 9
         Pattern validacionTelefono = Pattern.compile("^[6-9][0-9]{8}$");
            Matcher t = validacionTelefono.matcher(telefono);
            if (t.matches()){
                throw new DatoNoValido();
            }
    }

    private static void validarEdad(String edad) throws Exception {
        Pattern validacionEdad = Pattern.compile("^[0,3]$");
            Matcher e = validacionEdad.matcher(edad);
            if (e.matches()){
                throw new DatoNoValido();
            }
    }

   

    private static void validarEstadoCivil(String estadoCivil) throws Exception {
        Pattern validacionEdad = Pattern.compile("^[0,3]$");
            Matcher e = validacionEdad.matcher(edad);
            if (e.matches()){
                throw new DatoNoValido();
            } 
    }

    private static void validarEmail(String email) throws Exception {
         String regez =  "[A-Za -z]+@[a-z]+\\.[a-z]+";
         String emailPattern = "ˆ[_a -z0 -9 -]+(\\.[_a -z0 -9 -]+)*@[a-z0 -9 -]+(\\.[a-z0 -9 -]+) *(\\.[a-z]{2 ,4})$";

    }

    private static void validarFechaNac(LocalDate fechaNac) throws Exception {
        Pattern validacionEdad = Pattern.compile("^[0,3]$");
            Matcher f;
            f = validacionEdad.matcher();
            if (f.matches()){
                throw new DatoNoValido();
            }
    }
}
