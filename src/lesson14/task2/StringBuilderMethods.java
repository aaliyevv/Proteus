package lesson14.task2;

public class StringBuilderMethods {
    public static void main(String[] args) {
        String sentence = "Java çox güclüdür";
        StringBuilder sb = new StringBuilder(sentence);
        sb.insert(0, "Başlanğıc: ");
        sb.append(". \nSon");
        System.out.println(sb);
    }
}
