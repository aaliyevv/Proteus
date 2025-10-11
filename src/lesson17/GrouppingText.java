package lesson17;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GrouppingText {
    public static void main(String[] args) {


        List<String> words = Arrays.asList("apple", "cat", "banana", "dog", "kiwi");

        Map<Integer, List<String>> grouped = words.stream()
                .collect(Collectors.groupingBy(String::length));

//        System.out.println(grouped);

       grouped.forEach((length, list) ->
               System.out.println(length + " letter word(s) " + list));
    }
}
