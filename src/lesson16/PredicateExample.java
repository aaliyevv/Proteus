package lesson16;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> checkLength = soz -> soz.length() > 5;

        System.out.println("Result for \"Salam\": " + checkLength.test("Salam"));
        System.out.println("Result for \"Programmer\": " + checkLength.test("Programmer"));
    }
}