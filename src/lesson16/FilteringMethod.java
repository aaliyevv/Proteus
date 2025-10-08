package lesson16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilteringMethod {
    public static List<String> filterle(List<String> registration, Predicate<String> condition){
        List<String> result = new ArrayList<>();
        for (String name:registration){
            if (condition.test(name)){
                result.add(name);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> names = List.of("Ayan", "Samir", "Leyla", "Nigar", "Tural");

        List<String> filteredNames = filterle(names, n -> n.length() > 4);
        System.out.println(filteredNames);

        List<String> filteredNames2 = filterle(names, n -> n.endsWith("a"));
        System.out.println(filteredNames2);
    }
}