package lesson10;

import java.util.HashMap;
import java.util.Map;

public class SimpleProductPriceBook {
    public static void main(String[] args) {
        HashMap<String, Integer> productPrice = new HashMap<>();


        productPrice.put("Phone", 1700);
        productPrice.put("Refrigerator", 2000);
        productPrice.put("Laptop", 2500);

        System.out.println("Initial products and prices:");
        for (Map.Entry<String, Integer> entry : productPrice.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        String product = "Phone";
        System.out.println("\n" + product + " price: " + productPrice.get(product));

        productPrice.replace("Phone", 1800);
        System.out.println(productPrice.get(product));

        String product2 = "Refrigerator";
        productPrice.computeIfPresent("Refrigerator", (k, v) -> v + 100);
        System.out.println(productPrice.get(product2));

        String product4 = "TV";
        productPrice.computeIfAbsent("TV", k -> 1500);
        System.out.println(productPrice.get(product4));

        productPrice.remove("Laptop");
        System.out.println(productPrice);

        System.out.println("\nNew Products and prices");
        for (Map.Entry<String, Integer> entry : productPrice.entrySet()) {
            System.out.println("Product: " + entry.getKey() + ", Price: " + entry.getValue());
        }

        System.out.println("\nProduct Names:");
        for (String key : productPrice.keySet()) {
            System.out.println(key);

        }

        System.out.println("\nPrices");
        for (Integer value : productPrice.values()){
            System.out.println(value);
        }
    }
}
