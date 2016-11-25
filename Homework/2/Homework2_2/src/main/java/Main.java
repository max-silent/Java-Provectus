/**
 * Created by Max on 24.11.2016.
 */
public class Main {
    public static void main(String[] args){
        int[] array = {-5,-1,0,0,-1,1,5,4,4,9,4};
        int[] occurences = new int[11];
        int maxCount=0, maxCountNumber=0;
        boolean isMaxOccurencesUnique=true;
        //Print items
        System.out.println("Original array:");
        for (int item : array) {
            System.out.print(item+"\t");
        }
        //Set occurences amounts and maximum item's index
        for (int i=0; i<array.length; i++){
            int itemCounter=0;
            for (int j=0; j<array.length; j++){
                if (array[i]==array[j]) itemCounter++;
            }
            //occurences amount
            occurences[i]=itemCounter;
            //maximum occurences amount and corresponding item's index
            if (maxCount<itemCounter){
                maxCount=itemCounter;
                maxCountNumber=array[i];
            }
        }

        //Print occurences amounts
        System.out.println();
        System.out.println("Occurences:");
        for (int item : occurences) {
            System.out.print(item+"\t");
        }

        //Check if number with maximum occurences is unique
        for (int i=0; i<array.length; i++){
            if (occurences[i]==maxCount){
                if (array[i]!=maxCountNumber){
                    isMaxOccurencesUnique=false;
                    break;
                }
            }
        }

        //Print uniquee numbr with maximum occurences
        if (isMaxOccurencesUnique){
            System.out.println();
            System.out.println("Unique number with maximum ("+maxCount+") occurences is "+maxCountNumber);
        }

    }
}
