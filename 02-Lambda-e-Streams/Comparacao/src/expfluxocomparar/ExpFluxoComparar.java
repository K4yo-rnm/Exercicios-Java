/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expfluxocomparar;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author care-
 */
public class ExpFluxoComparar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List <String> color = Arrays.asList("Red", "Blue", "Green", "Yello");
        
        List <String> ascendOrder = color.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("De A ate Z: " + ascendOrder);
        
        List <String> descendOrder = color.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("De Z ate A: " + descendOrder);
    }
    
}
