/**
 * Created by Max on 19.11.2016.
 */
public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] numbersToCompare = {4, -8, 12};
        int maxNumberByIfElse, maxNumberByTernar;
        float avgNumber;

        if (numbersToCompare[0]>numbersToCompare[1])maxNumberByIfElse=numbersToCompare[0];
        else maxNumberByIfElse=numbersToCompare[1];
        if (maxNumberByIfElse<numbersToCompare[2])maxNumberByIfElse=numbersToCompare[2];
        System.out.println("Max number culculated via \"If-Else\" is "+maxNumberByIfElse);

        maxNumberByTernar = numbersToCompare[0]>numbersToCompare[1]?numbersToCompare[0]:numbersToCompare[1];
        maxNumberByTernar = maxNumberByTernar>numbersToCompare[2]?maxNumberByTernar:numbersToCompare[2];
        System.out.println("Max number culculated via Ternar operator is "+maxNumberByTernar);

        avgNumber = ((float)numbersToCompare[0]+numbersToCompare[1]+numbersToCompare[2])/3;
        System.out.println("Average is "+avgNumber);
    }
}

