package lesson16.mathOperationTask;


public class CalculatorDemo {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a +b;
        MathOperation sub = (a, b) -> a-b;
        MathOperation mul = (a, b) -> a*b;
        MathOperation div = (a, b) -> (b!=0) ? a/b : 0;


        System.out.println(add.operate(10,5));
        System.out.println(sub.operate(10,5));
        System.out.println(mul.operate(10,5));
        System.out.println(div.operate(10,5));
    }

}
