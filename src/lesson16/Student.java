package lesson16;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Student {
    String name;
    int score;


    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + " (" + score + ")" ;
    }
}

    class Main {
        public static void main(String[] args) {

            List<Student> students = Arrays.asList(
                    new Student("Ali", 92),
                    new Student("Farida", 86),
                    new Student("Eljan", 96),
                    new Student("Sadiq", 44));


            Predicate<Student> highScore = s -> s.score > 50;
            Predicate<Student> longName = l -> l.name.length() > 5;

            students.forEach(s -> {
                        if (highScore.and(longName).test(s)) {
                            System.out.println("Acceepted: " + s);
                        }
                    }
            );
        }
    }

