/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expfluxoduplicata;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author care-
 */
public class ExpFluxoDuplicata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List <Integer> numLista = Arrays.asList(1, 2, 2, 3, 4, 5, 6, 4, 5);
        
        List <Integer> semRepet = numLista.stream()
                .distinct()
                .collect(Collectors.toList());
                
        System.out.println("N sem repetir: " + semRepet);
    }
    
}
