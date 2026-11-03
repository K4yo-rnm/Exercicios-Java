/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exppegarnum;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author care-
 */
public class ExpPegarNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List <Integer> num = Arrays.asList(1, 3, 2, 44, 55, 33, 23 ,97, -11);
        
        System.out.println("Lista de Numeros: " + num + "\n");
        
        Integer segMenor = num.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println("Segundo Menor Numero: " + segMenor);
        
        Integer segMaior = num.stream()
                .distinct()
                .sorted((a, b) -> Integer.compare(b, a))
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println("Segundo Maior Numero: " + segMaior);
    }
    
}
