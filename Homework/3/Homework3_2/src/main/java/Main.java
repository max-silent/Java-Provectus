import java.util.Random;

/**
 * Created by Max on 05.12.2016.
 */
public class Main {
    public static void main(String[] args){
        Random intSequence = new Random();
        int [] anArray = new int[12];

        int negativeAmount=0, positiveAmount=0, tempVar;

        //Fill in array by randomly generated items between -10 and 10, without zeros
        int index=0;
        do
        {
            anArray[index]=intSequence.nextInt(20)-10;
            if (anArray[index]==0) continue;
            if (anArray[index] > 0 && positiveAmount == anArray.length/2) continue;
            if (anArray[index] < 0 && negativeAmount == anArray.length/2) continue;
            tempVar = (anArray[index] > 0) ? positiveAmount++ : negativeAmount++;
            index++;
/*
            if (anArray[index] > 0) {
                if (positiveAmount == (anArray.length / 2)) continue;
                else {
                    positiveAmount++;
                    index++;
                    continue;
                }
            }
            if (anArray[index] < 0) {
                if (negativeAmount == (anArray.length / 2)) continue;
                else {
                    negativeAmount++;
                    index++;
                    continue;
                }
            }
*/
        }
        while(index<anArray.length);

        //Print array's items
        for (int item : anArray) {
            System.out.print(item+"   ");
        }

    }
}
