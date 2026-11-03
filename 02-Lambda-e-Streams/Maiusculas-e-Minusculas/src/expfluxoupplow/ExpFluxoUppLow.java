/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expfluxoupplow;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 *
 * @author care-
 */
public class ExpFluxoUppLow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] cores = {
            "Red", "Blue", "green", "yElLow", "blacK"
        };
        
        List <String> color = Arrays.asList(cores);
        
        System.out.println(color);  
        
       List <String> upperCase = color.stream()
                   .map(String::toUpperCase)
                   .collect(Collectors.toList());
        
        System.out.println("UpperCase: " + upperCase + "\n");
        
        List <String> lowerCase = color.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println("LowerCase: " + lowerCase);
                   
    }
    
}
