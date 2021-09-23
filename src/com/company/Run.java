package com.company;

import java.util.Random;

public class Run {

    public static void main(String[] args) {
        Matrix m1 = new Matrix(randomFloatMatrix(5, 5));
        Matrix m2 = new Matrix(randomFloatMatrix(3, 4));

        m1.printMatrix();
        System.out.println();
        m2.printMatrix();

        System.out.println("\nResult:");
        Matrix result = new Matrix(Matrix.sumTwoMatrix(m1, m2));
        result.printMatrix();
    }

    private static float[][] randomFloatMatrix(int col, int row) {
        Random r = new Random();
        float[][] result = new float[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = r.nextFloat() * 100;
            }
        }

        return result;
    }
}
