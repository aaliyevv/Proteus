package lesson11.Task1;

public class LibraryManager {
    public static void main(String[] args) throws InterruptedException {
        Book b1 = new Book("Cinayet ve Ceza");
        Book b2 = new Book("Ali ve Nino");
        Book b3 = new Book("Sherlock Holmes");

        b1 = null;
        b2 = null;
        b3 = null;

        System.gc();
        Thread.sleep(3000);
        System.out.println("Thread pause");
    }

}
