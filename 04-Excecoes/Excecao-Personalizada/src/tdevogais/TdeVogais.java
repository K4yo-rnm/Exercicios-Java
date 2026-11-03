package tdevogais;

/**
 * Verifica se um texto contém ao menos uma vogal.
 */
public class TdeVogais {
    public static void main(String[] args) {
        String texto = "bhhhjjhhhhdds";

        try {
            checkVowels(texto);
            System.out.println("Texto: " + texto);
            System.out.println("A string contém pelo menos uma vogal.");
        } catch (MyException erro) {
            System.out.println("Erro: " + erro.getMessage());
        }
    }

    public static void checkVowels(String text) throws MyException {
        if (text == null || text.isEmpty()) {
            throw new MyException("O texto está vazio ou não foi informado.");
        }

        boolean contemVogal = text.matches("(?s).*[aeiouAEIOU].*");
        if (!contemVogal) {
            throw new MyException("O texto não contém vogais.");
        }
    }
}
