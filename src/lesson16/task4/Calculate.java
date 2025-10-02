package lesson16.task4;

public class Calculate {
    public static void main(String[] args) {
        Calculation calc = (x, y, z) -> x+y+z;
        System.out.println(calc.calculate(2, 4, 8));
    }
}
