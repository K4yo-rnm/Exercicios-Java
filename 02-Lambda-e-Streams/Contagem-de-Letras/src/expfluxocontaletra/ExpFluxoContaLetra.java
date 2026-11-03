/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expfluxocontaletra;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author care-
 */
public class ExpFluxoContaLetra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List <String> colors = Arrays.asList("Red", "Blue", "Green", "Yellow", "Black");
        System.out.println("Quatidades de vezes que a letra aparece");
        //Contagem com o Stream
        char startingLetter = 'B';
        
        long contagemBe = colors.stream()
                .filter(s -> s.startsWith(String.valueOf(startingLetter)))
                .count();
        System.out.println("Letras B: " + contagemBe);
        
        char startingLetter1 = 'e';
        
        long contagemEe = colors.stream()
                .filter(s -> s.startsWith(String.valueOf(startingLetter1)))
                .count();
        System.out.println("Letra e: " + contagemEe);
    }
    
}
