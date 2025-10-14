package lesson18.task2;

public class Main {
    public static void main(String[] args) {
        LegacyImageViewer legacyImageViewer = new LegacyImageViewer();
        Image adapter = new ImageAdapter(legacyImageViewer);

        adapter.displayImage("menzere.jpg");
    }
}
