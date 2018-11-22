/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarray8;

import java.util.Arrays;


public class EjercicioArray8 {

    
    public static void main(String[] args) {
        int [][] variables = new int[10][10];
        for (int [] row: variables ) 
        {
            Arrays.fill(row,0);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(variables[i]));
        }
    }
    
}
