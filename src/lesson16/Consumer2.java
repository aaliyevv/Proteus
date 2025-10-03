package lesson16;

import java.util.List;
import java.util.function.Consumer;

public class Consumer2 {
    public static void main(String[] args) {
        List<String> words = List.of("Salam", "Lambda", "Java");

        Consumer<String> printLength = word -> System.out.println(word + " -> " + word.length());

        words.forEach(printLength);
    }
}
