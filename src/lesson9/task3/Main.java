package lesson9.task3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Student> students = new TreeSet<>(new StudentGPAComparator());

        students.add(new Student(101, "Ali", 3.5));
        students.add(new Student(102, "Veli", 4.0));
        students.add(new Student(101, "Aysu", 3.8));
        students.add(new Student(103, "Farid", 3.2));

        System.out.println(students);

    }
}
