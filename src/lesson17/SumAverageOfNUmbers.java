package lesson17;

import java.util.*;
import java.util.stream.*;

public class SumAverageOfNUmbers {
        public static void main(String[] args) {
            // Nümunə siyahı
            List<Integer> numbers = Arrays.asList(3, 8, 12, 5, 7, 10, 2);

            // Cüt ədədləri tapmaq, cəmini və ortanı hesablamaq
            List<Integer> evenNumbers = numbers.stream()
                    .filter(n -> n % 2 == 0) // yalnız cüt ədədlər
                    .collect(Collectors.toList());

            int sum = evenNumbers.stream()
                    .mapToInt(Integer::intValue)
                    .sum();

            double average = evenNumbers.stream()
                    .mapToInt(Integer::intValue)
                    .average()
                    .orElse(0);

            System.out.println("Cüt ədədlər: " + evenNumbers);
            System.out.println("Cəmi: " + sum);
            System.out.println("Orta: " + average);
        }
    }

}
