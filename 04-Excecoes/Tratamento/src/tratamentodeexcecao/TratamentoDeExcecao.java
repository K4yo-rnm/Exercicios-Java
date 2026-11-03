/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tratamentodeexcecao;

/**
 *
 * @author care-
 */
public class TratamentoDeExcecao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 18;
        traynumber(n);
        n = 7;
        traynumber(n);
    }
    
    public static void traynumber(int n){
        try{
            checkNumber(n);
            System.out.println(n + " e Par");
        } catch (IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
    public static void checkNumber(int number){
        if(number % 2 != 0){
            throw new IllegalArgumentException(number + " e impar");
        }
    }
    
}
