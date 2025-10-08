package lesson16.ReverseWithLambda;

public class FormatterExample {
    public static void main(String[] args) {
        Formatter reversedWord = s -> new StringBuilder(s).reverse().toString();

        String word = "BMW";
        String result = reversedWord.format(word);

        System.out.println(result);
    }
}
