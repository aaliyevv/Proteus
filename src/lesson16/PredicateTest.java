package lesson16;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
//        Predicate<Integer> predicate = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return false;
//            }
//        };

        Predicate<Integer> predicate1 = num -> num > 50 && num < 200;


        System.out.println(predicate1.test(70));
        System.out.println(predicate1.test(40));
        System.out.println(predicate1.test(220));
    }
}
