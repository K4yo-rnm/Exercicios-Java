/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package explambdapredicate;

import java.util.function.Predicate;

/**
 *
 * @author care-
 */
public class ExpLambdaPredicate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Predicate <String> isEmpatyString = str -> str.isEmpty();
        
        
        String str1 = "";
        String str2 = "Ola Mundo";
        
        System.out.println("String 1: " + str1);
        System.out.println("String 1 esta vaiza? " + isEmpatyString.test(str1));
        System.out.println("\nString 2: " + str2);
        System.out.println("String 2 esta vazia? " + isEmpatyString.test(str2));
        
    }
    
}
