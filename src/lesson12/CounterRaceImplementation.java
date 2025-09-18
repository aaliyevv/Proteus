package lesson12;

public class CounterRaceImplementation {
    public static void main(String[] args) {



        class ascendingCounter implements Runnable {
            @Override
            public void run() {
                try {
                    for (int i = 1; i <= 10; i++) {
                        System.out.println("Ascending Counter: " + i);
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException();
                }
            }
        }

        class descendingCounter implements Runnable {
            @Override
            public void run() {
                try {
                    for (int i = 10; i >= 1; i--) {
                        System.out.println("Descending Counter: " + i);
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException();
                }
            }
        }


        descendingCounter descendingCounter = new descendingCounter();
        ascendingCounter ascendingCounter = new ascendingCounter();

        Thread ascending = new Thread(descendingCounter);
        Thread descending = new Thread(ascendingCounter);

        ascending.start();
        descending.start();
        
    }
}
