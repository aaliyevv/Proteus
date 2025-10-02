package lesson16;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> greeting = name -> System.out.println("Salam, " + name + "! Bu gun necesen?");

        greeting.accept("Ali");
    }

}
