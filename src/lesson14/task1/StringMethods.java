package lesson14.task1;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
//        String name = sc.nextLine().trim;


        name = name.trim();
        System.out.println(name);

        name = name.toUpperCase();
        System.out.println(name);

        int number = name.length();
        System.out.println(number);

        char thirdChar = name.charAt(3);
        System.out.println(thirdChar);
    }
}
