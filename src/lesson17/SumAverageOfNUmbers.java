package lesson17;

import java.util.*;
import java.util.stream.*;

public class SumAverageOfNUmbers {
        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(3, 8, 12, 5, 7, 10, 2);

            List<Integer> evenNumbers = numbers.stream()
                    .filter(n -> n % 2 == 0)
                    .collect(Collectors.toList());

            int sum = evenNumbers.stream()
                    .mapToInt(Integer::intValue)
                    .sum();

            double average = evenNumbers.stream()
                    .mapToInt(Integer::intValue)
                    .average()
                    .orElse(0);

            System.out.println("Even numbers: " + evenNumbers);
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
        }
    }
