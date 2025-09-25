package lesson14.task1;

import java.util.Scanner;

public class StringMethods2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        String fixedSentence = sentence.replace(",", " ");
        String [] words = fixedSentence.split(" ");

        System.out.println("Fixed Sentence: " + fixedSentence);
        System.out.println("Word count: " + words.length);
    }
}
