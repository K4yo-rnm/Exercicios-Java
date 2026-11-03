package explambdaupplow;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Converte uma lista de textos para letras maiúsculas e minúsculas com lambdas.
 */
public class ExpLambdaUppLow {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Red", "Green", "Blue", "Black");

        System.out.println("Texto original:");
        stringList.forEach(System.out::println);

        Function<String, String> upperCase = String::toUpperCase;
        System.out.println("\nTexto em maiúsculas:");
        stringList.stream().map(upperCase).forEach(System.out::println);

        Function<String, String> lowerCase = String::toLowerCase;
        System.out.println("\nTexto em minúsculas:");
        stringList.stream().map(lowerCase).forEach(System.out::println);
    }
}
