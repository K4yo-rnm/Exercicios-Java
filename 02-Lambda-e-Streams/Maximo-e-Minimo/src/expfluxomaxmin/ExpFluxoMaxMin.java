/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expfluxomaxmin;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author care-
 */
public class ExpFluxoMaxMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List <Integer> num = Arrays.asList(1, 3, 5, 2, 7, 4, 6, 9, 8);
        System.out.println("Lista de Numeros: " + num + "\n");
        
        int numMax = num.stream()
                .mapToInt(Integer::intValue)
                .max()
                .getAsInt();
        
        System.out.println("Maior Numero: " + numMax);
        
        int numMin = num.stream()
                .mapToInt(Integer::intValue)
                .min()
                .getAsInt();
        System.out.println("Menor Numero: " + numMin);
    }
    
}
