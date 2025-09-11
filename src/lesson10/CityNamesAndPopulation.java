package lesson10;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Scanner;

public class CityNamesAndPopulation {
    public static void main(String[] args) {

        HashMap<String, Integer> cityPopulation = new HashMap<>();

        cityPopulation.put("Bakı", 2300000);
        cityPopulation.put("Gəncə", 335000);
        cityPopulation.put("Sumqayıt", 370000);
        cityPopulation.put("Şəki", 63000);
        cityPopulation.put("Naxçıvan", 95000);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the city name: ");


        while (true) {
            String s = sc.nextLine();

            if (s.equalsIgnoreCase("exit")) {
                break;
            }


            if (cityPopulation.containsKey(s)) {
                System.out.println(cityPopulation.get(s));
            } else {
                System.out.println("City Not Fount");
            }
        }

    }
}
