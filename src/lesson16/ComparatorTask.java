package lesson16;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorTask {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Leyla", "Ali", "Zaur", "Emin");
        names.sort(Comparator.comparingInt(String::length));

        System.out.println(names);
    }
}
