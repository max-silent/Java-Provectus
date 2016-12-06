import java.util.Random;

/**
 * Created by Max on 06.12.2016.
 */
public class Main {
    public static void main (String[] args){
        Random sequence = new Random();
        int[][] anArray = new int[5][8];
        int maxItem;
        for (int i=0; i<5; i++) {
            for (int j=0; j<8; j++) {
                anArray[i][j]=sequence.nextInt(198)-99;
            }
        }

        maxItem=anArray[0][0];

        //Print the array's items and find maximum number
        System.out.println("Array's items:");
        for (int[] rowItem:anArray) {
            for (int colItem:rowItem) {
                System.out.print(colItem+"\t\t");
                if (colItem>maxItem) maxItem=colItem;
            }
            System.out.println();
        }

        //Print the maximum number of array
        System.out.println("\nMaximum item in array is \""+maxItem+"\"");

    }
}
