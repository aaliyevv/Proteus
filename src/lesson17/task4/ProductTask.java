package lesson17.task4;

import jdk.jfr.Category;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ProductTask {
        public static void main(String[] args) {
            List<Product> products = Arrays.asList(
                    new Product("Laptop", "Electronics", 4000, 3),
                    new Product("Mouse" , "Electronics", 240, 0 ),
                    new Product("Book - Java","Books", 70, 7 ),
                    new Product("Book - AI", "Books", 60, 2)
            );

            System.out.println("\n1. Names of all products that are out of stock:");
            products.stream()
                    .filter(s -> s.getStock()==0)
                    .map(Product::getName)
                    .forEach(System.out::println);

            System.out.println("\n2.Total Price of All Products in the Book Category:");
            int totalBokksPrice = products.stream()
                    .filter(b -> b.getCategory().equalsIgnoreCase("Books"))
                    .mapToInt(t -> (int) (t.getStock() * t.getPrice()))
                    .sum();
            System.out.println(totalBokksPrice);


            System.out.println("\n3.Group by Products:");
            Map<String, List<Product>> grouped = products.stream()
                    .collect(Collectors.groupingBy(Product::getCategory));
            grouped.forEach((category, list) ->
                            System.out.println(category + " : " + list));

            System.out.println("\n4.Average Price for Each Category:");
            Map<String, Double> averageCost = products.stream()
                    .collect(Collectors.groupingBy(Product::getCategory,
                            Collectors.averagingDouble(Product::getPrice)));

            averageCost.forEach((category, price) ->
            System.out.println(category + " : " + price));
        }
    }
