package lesson9;

import java.util.HashSet;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> numbers = new HashSet<>();
        


        for(int i =0; i<3; i++){
            numbers.add(sc.nextInt());
        }

        for (int i=0; i<10; i++){
            if(numbers.contains(i)){
            System.out.println("was found in the set" + i);
        } else {
                System.out.println("was not found in the set");
            }


        }
    }
}
