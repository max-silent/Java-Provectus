/**
 * Created by Max on 25.11.2016.
 */
public class Main {
    public static void main(String[] args){
        int[][] srcArray = {{5,10,3,0,0},{4,9,0,0,0},{0,0,16,0,0},{22,33,1,6,10}};
        int[][] dstArray = new int[srcArray[0].length][srcArray.length];

        //Transponing source array into destination array
        for (int i=0; i<srcArray.length; i++){
            for (int j=0; j<srcArray[i].length; j++){
                dstArray[j][i] = srcArray[i][j];
            }
        }

        //Print source array
        System.out.println("\nSource Array:");
        for (int[] row : srcArray){
            for (int item : row){
                System.out.print(item+"\t");
            }
            System.out.println();
        }

        //Print destination array
        System.out.println("\nDestination Array:");
        for (int[] row : dstArray){
            for (int item : row){
                System.out.print(item+"\t");
            }
            System.out.println();
        }
    }
}
