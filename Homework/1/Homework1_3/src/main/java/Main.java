import static java.lang.Math.abs;

/**
 * Created by Max on 19.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        int m=24, n=-5;
        int closestTo10;
        closestTo10 = abs((10-m)) < abs((10-n)) ? m : n;
        System.out.println("Closest to \"10\" from "+m+" and "+n+" is "+closestTo10);
    }
}
