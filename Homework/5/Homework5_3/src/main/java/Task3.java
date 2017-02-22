/**
 * Created by Max on 22.02.2017.
 */
public class Task3 {
    private static String message1 = null;
    private static String message2 = null;

    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e1) {
        } catch (Exception e2) {
            System.out.println("Error");
            message1 = "value";
            message1 = null;
            method1();
            System.out.println("Error");
            method2();
            message1 = null;
        }
        System.out.println("Message");
        try {
            throw new RuntimeException();
        } catch (RuntimeException e2) {
        } catch (Exception e3) {
            message2 = null;
            message2 = "value";
            System.out.println("Error");

            if (message1 == null || message2 == null) {
                System.out.println("Error");
            }
        }
    }

    public static void method1() {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e1) {
        } catch (Exception e2) {
            System.out.println("Error");
            message1 = null;
        }
    }

    public static void method2() {
        try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e1) {
        } catch (Exception e2) {
            message2 = null;
            System.out.println("Error");
        }
    }
}
