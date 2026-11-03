/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expfluxo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author care-
 */
public class ExpFluxo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List < Integer > listNum = Arrays.asList(11, 2, 10, 6, 3);
        
        System.out.println("Numeros: " + listNum);
        
        //calcular media com steam
        double media = listNum.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);
        
        System.out.println("Media dos numeros: " + media);
    }
    
}
