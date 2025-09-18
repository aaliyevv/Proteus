package lesson12;

import java.sql.SQLOutput;

public class CounterRace {
    public static void main(String[] args) {
        Thread ascendingCounter = new Thread(()-> {
            for (int i=1; i<=10; i++){
                System.out.println("Ascending Counter: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });


        Thread descendingCounter = new Thread(()-> {
            for (int i=10; i>0; i--){
                System.out.println("Descending Counter: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });

        ascendingCounter.start();
        descendingCounter.start();
    }
}
