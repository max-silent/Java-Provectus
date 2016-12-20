/**
 * Created by Max on 19.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.input(4);
        calculator.input(5);
        calculator.input(9);
        calculator.fraction();
        calculator.input(3);
        calculator.input(7);
        System.out.println(calculator.screenValue.getValue());
        calculator.plus();
        calculator.input(1);
        calculator.input(3);
        System.out.println(calculator.screenValue.getValue());
        calculator.plus();
        calculator.plus();
        calculator.equal();
        System.out.println(calculator.screenValue.getValue());
        calculator.input(1);
        calculator.fraction();
        System.out.println(calculator.screenValue.getValue());
        calculator.input(0);
        calculator.input(0);
        calculator.input(2);
        System.out.println(calculator.screenValue.getValue());
    }
}
