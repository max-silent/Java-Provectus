/**
 * Created by Max on 24.11.2016.
 */
public class Main {
    public static void main(String[] args){
        double[] array = {-5.7,-1.3,0.2,2.75,3.21,4,5.73,6.21,7.125,9.1234567};
        double sum=0, avg;
        for (double item : array) {
            sum+=item;
        }
        avg = sum/array.length;
        System.out.println("Summ is "+sum);
        System.out.println("Average is "+avg);
    }
}
