package lesson17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TextTransformation {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("property", "corresponding", "ordinary", "omit", "suspend");

        List<String> formatted = words.stream()
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase())
                .collect(Collectors.toList());

        formatted.forEach(System.out::println);
    }
}
