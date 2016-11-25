import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Max on 24.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        int aNumber, evenAmount=0, dstIndex=0;
        int[] srcArray, dstArray;
        try {
            //Reading the input line from console
            do
            {
                System.out.println("Please, input number more than \"3\":");
                aNumber = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
                if (aNumber<4){
                    System.out.println("Wrong value was entered.");
                }
            }
            while(aNumber<4);

            //Filling in the array of aNumber length by items between "0" and aNumber
            srcArray = new int[aNumber];
            for (int i=0; i<aNumber; i++){
                srcArray[i]=(int)(Math.random()*aNumber);
                if (srcArray[i]%2==0) evenAmount++;
            }

            //Output source array
            System.out.println("\nSource array of generated items between \"0\" and \""+aNumber+"\" ("+ srcArray.length+" items):");
            for (int item:srcArray){
                System.out.print(item+"\t");
            }
            System.out.println();

            //Filling in the destination array of even items copied from source array
            System.out.println("\nCreating destination array of even items from source array...");
            dstArray = new int[evenAmount];
            for (int item:srcArray){
                if (item%2==0){
                    dstArray[dstIndex]=item;
                    dstIndex++;
                }
            }

            //Output destination array
            System.out.println("\nDestination array of even items copied from source array ("+dstArray.length+" items):");
            for (int item:dstArray){
                System.out.print(item+"\t");
            }

        }
        catch (NumberFormatException e) {
            System.out.println("Exception appeared:\nNot a number or out of the range.\n");
            System.out.println("Exception message:\n"+e.getMessage());
            //e.printStackTrace();
        }
        catch (IOException e) {
            System.out.println("Exception appeared:\n"+e.getMessage());
            //e.printStackTrace();
        }
    }
}
