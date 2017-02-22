/**
 * Created by Max on 22.02.2017.
 */
public class Task2 {
    private static String message = "Message";

    public static void main(String[] args) throws CloneNotSupportedException {
        method1();
        method2();
        method3();

        if (message == null) {
            System.out.println("Message 6");
        }
    }

    public static void method1() {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e1) {

        } catch (Exception e2) {
            System.out.println("Message 1");
            message = null;
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e3) {
                System.out.println("Message 2");
            }
        }
    }

    public static void method2() {
        try {
            System.out.println("Message 2");
            throw new RuntimeException();
        } catch (RuntimeException e1) {

        } catch (Exception e2) {
            message = null;
            System.out.println("Message 3");
            throw new IndexOutOfBoundsException();
        }
    }

    public static void method3() throws CloneNotSupportedException {
        try {
            System.out.println("Message 4");
            throw new CloneNotSupportedException();
        } catch (CloneNotSupportedException e1) {
        } catch (Exception e1) {
            message = null;
            System.out.println("Message 5");
        }
    }

}
