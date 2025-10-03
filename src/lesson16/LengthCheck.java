package lesson16;

import java.util.function.Predicate;

public class LengthCheck {
    public static void main(String[] args) {
        Predicate<String> checkLength = word -> word.length() > 5;

        System.out.println(checkLength.test("Salam"));
        System.out.println(checkLength.test("Programmmer"));


    }
}
