package lesson11.Task2;

public class Palindrom {
    public static void main(String[] args) {

        System.out.println(isPolindrom("anna"));


    }
    public static boolean isPolindrom (String word) {
        // String reverse = "";
//        for (int i = word.length()-1; i >=0 ; i--) {
//            reverse += word.charAt(i);
//
//
//        }
        String reverse = new StringBuilder(word).reverse().toString();

        return  word.equalsIgnoreCase(reverse);

    }


}