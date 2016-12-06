import java.util.Random;

/**
 * Created by Max on 06.12.2016.
 */
public class Main {
    public  static void main(String[] args){
        Random sequence = new Random();
        int multiplier1Index, multiplier2Index;
        boolean[][] usedExample=new boolean[8][8];  //"true" means that corresponding multipliers were already used

        //Generating and printing non-repeated examples of multiplying table
        int counter=0;
        do{
            multiplier1Index=sequence.nextInt(7);
            multiplier2Index=sequence.nextInt(7);
            if (usedExample[multiplier1Index][multiplier2Index])continue;
            System.out.println("Example: "+(multiplier1Index+2)+" x "+(multiplier2Index+2));
            usedExample[multiplier1Index][multiplier2Index]=true;
            usedExample[multiplier2Index][multiplier1Index]=true;
            counter++;
        }while(counter<15);
    }
}
