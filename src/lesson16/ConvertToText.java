package lesson16;

import java.util.function.Function;

public class ConvertToText {
    public static void main(String[] args) {
        Function<Double, String> conversion = value -> value + "AZN";

        System.out.println(conversion.apply(89.99));
    }
}
