package lesson11.Task1;

public class Book {
    String title;

    public Book(String title) {
        this.title = title;
        System.out.println("The book named " + title + " has been created");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("The book named " + title + " has been deleted");
    }
}
