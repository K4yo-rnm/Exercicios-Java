/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expfluxosoma;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.Collectors;
/**
 *
 * @author care-
 */
public class ExpFluxoSoma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List <Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8,9, 10);
        
        //Soma dos Pares
          int somaPares = num.stream()
                .filter(n -> n % 2 == 0 )
                .mapToInt(Integer::intValue)
                .sum();
                
          System.out.println("Soma dos n Par: " + somaPares);
          
        //Soma dos Impar
        int somaImpar = num.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
        
        System.out.println("Soma dos n Imapr: " + somaImpar);
    }
    
}
