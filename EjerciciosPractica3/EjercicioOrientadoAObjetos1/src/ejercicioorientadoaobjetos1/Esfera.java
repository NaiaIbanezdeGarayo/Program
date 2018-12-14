/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioorientadoaobjetos1;

/**
 *
 * @author Naia
 */
public class Esfera {
    
   
    private double radio;

    public double Longitud(){
        double longitudes = 2 * Math.PI * radio;
        return longitudes;
    }
    public double Area(){
        double areas =  Math.PI * radio * radio;
        return areas;
    }
    public double Volumen(){
        double volum =  4 * Math.PI * radio * radio * radio / 3;
        return volum;
    }

   

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }
}
