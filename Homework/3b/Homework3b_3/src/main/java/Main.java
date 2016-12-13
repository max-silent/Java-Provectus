/**
 * Created by Max on 13.12.2016.
 */
public class Main {
    public static void main(String[] args){
        int[][] arr1 = {{1,2},{3,4}};
        int[][] arr2 = {{1,2},{3,4}};
        int[][] arr3 = {{2,4},{6,8}};
        Matrix mtx1 = new Matrix(arr1);
        Matrix mtx2 = new Matrix(arr2);
        Matrix mtx3 = new Matrix(arr3);
        System.out.println("Original matrix 1:");
        mtx1.output();
        System.out.println("Original matrix 2:");
        mtx2.output();
        System.out.println("Adding matrix 1  and matrix 2...");
        mtx1.sumMatrix(mtx2);
        System.out.println("Modified matrix 1:");
        mtx1.output();
        System.out.println("Comparing matrix 1 with matrix 2");
        System.out.println(mtx1.areMatrixesEqual(mtx2)?"Matrixes are equal":"Matrixes are not equal");
        System.out.println("Comparing matrix 1 with matrix 3");
        System.out.println(mtx1.areMatrixesEqual(mtx3)?"Matrixes are equal":"Matrixes are not equal");
        System.out.println("Multiplying by 3...");
        mtx1.multiplyBy(3);
        System.out.println("Modified matrix 1:");
        mtx1.output();
        System.out.println("Search for minimum element...");
        System.out.println(mtx1.searchMinimum());
    }
}
