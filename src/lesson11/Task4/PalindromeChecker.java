package lesson11.Task4;

import java.util.Scanner;

public class PalindromeChecker {
    public boolean isPalindrome(String word) {


        String reverse = new StringBuilder(word).reverse().toString();

        return word.equalsIgnoreCase(reverse);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");

        String word = sc.nextLine();

        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.isPalindrome(word);
        System.out.println("Is Palindrome? " + result);

    }
}
