//import static java.lang.Math.random;

import java.util.Random;

/**
 * Created by Max on 13.12.2016.
 */
public class Matrix {
    private Random matrixItem = new Random();
    private int[][] matrixArray;

    //= new int[][];
    Matrix(int rows, int cols) {
        matrixArray = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixArray[i][j] = matrixItem.nextInt(20);
            }
        }
    }
    Matrix (int[][] matrixArray){
        this.matrixArray = matrixArray.clone();
    }

    public int[][] getMatrixArray() {
        return matrixArray;
    }

    public void sumMatrix(Matrix otherMatrix) {
        if (! isSizesEqual(otherMatrix)) {
            System.out.println("Matrixes sizes are not equal. Impossible to sum matrixes.");
            return;
        }
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[i].length; j++) {
                matrixArray[i][j] = matrixArray[i][j] + otherMatrix.getMatrixArray()[i][j];
            }
        }
    }

    public boolean areMatrixesEqual(Matrix otherMatrix) {
        if (!isSizesEqual(otherMatrix)) {
            System.out.println("Matrixes sizes are not equal.");
            return false;
        }
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[i].length; j++) {
                if (matrixArray[i][j]!=otherMatrix.getMatrixArray()[i][j]) return false;
            }
        }
        return true;
    }

    public void multiplyBy(int multiplier) {
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[i].length; j++) {
                matrixArray[i][j] = matrixArray[i][j] * multiplier;
            }
        }
    }

    public void output() {
        for (int[] row : matrixArray) {
            System.out.println();
            for (int col : row) {
                System.out.print(col + "   ");
            }
        }
        System.out.println();
        System.out.println();
    }

    public int searchMinimum() {
        int min = matrixArray[0][0];
        for (int[] row : matrixArray) {
            for (int col : row) {
                if (col < min) min = col;
            }
        }
        return min;
    }

    private boolean isSizesEqual(Matrix otherMatrix){
        if (matrixArray.length == otherMatrix.getMatrixArray().length
                ||
            matrixArray[0].length == otherMatrix.getMatrixArray()[0].length){
            return true;
        }
        else{
            return false;
        }
    }
}
