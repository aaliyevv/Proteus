package lesson9;

import java.util.HashSet;

public class Task2 {
    public static void main(String[] args) {

        HashSet<String> group1 = new HashSet<>();
        group1.add("Azer");
        group1.add("Veli");
        group1.add("Aydin");

        HashSet<String> group2 = new HashSet<>();
        group2.add("Farid");
        group2.add("Azer");
        group2.add("Hasan");

        HashSet<String> mutualFriends = new HashSet<>();

        mutualFriends.addAll(group1);
        mutualFriends.addAll(group2);

        System.out.println(mutualFriends);

        HashSet<String> intersection = new HashSet<>(group1);
        intersection.retainAll(group2);
        System.out.println(intersection);
    }
}