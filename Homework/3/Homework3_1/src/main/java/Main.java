import java.util.Random;

/**
 * Created by Max on 05.12.2016.
 */
public class Main {
    public static void main(String[] args){
        Random intSequence = new Random();
        int [] anArray = new int[4];

        //Fill in array by randomly generated items between 10 and 99
        for (int i = 0; i < 4; i++) {
                anArray[i]=intSequence.nextInt(89)+10;
            }

        //Print array's items
        for (int item : anArray) {
            System.out.print(item+"   ");
        }
        System.out.println();
        System.out.println(isStrictIncreasing(anArray)?"Array is strict increasing":"Array is NOT strict increasing");


    }

    private static boolean isStrictIncreasing(int[] anArray){
        boolean isIncreasing=true;

        for (int i=0; i<anArray.length-1; i++){
            if (anArray[i]>anArray[i+1]){
                isIncreasing=false;
                break;
            }
        }
        return isIncreasing;
    }
}
