package com.company;

import java.util.Arrays;

public class Matrix {
    private Float[][] matrix;
    private int columns;
    private int stolbs;

    public Matrix() {
    }

    public Matrix(Float[][] matrix) {
        this.matrix = matrix;
        columns = matrix.length;
        stolbs = matrix[0].length;
    }

    public Matrix(int columns, int stolbs) {
        this.columns = columns;
        this.stolbs = stolbs;
        matrix = new Float[columns][stolbs];
    }

    public float getElement(int colIndex, int stolbIndex) {
        return matrix[colIndex][stolbIndex];
    }

    public void setElement(int colIndex, int stolbIndex, float element) {
        matrix[colIndex][stolbIndex] = element;
    }

    public Float[][] getMatrix() {
        return matrix;
    }

    public void printMatrix() {
        System.out.println(Arrays.deepToString(matrix));
    }

    public static float[][] sumTwoMatrix(Matrix matrix1, Matrix matrix2) {
        float[][] result = getNewMatrixSize(matrix1, matrix2);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = matrix1.getElement(i, j) + matrix2.getElement(i, j);
            }
        }

        return result;
    }

    private static float[][] getNewMatrixSize(Matrix matrix1, Matrix matrix2) {
        int newColumns = Math.min(matrix1.columns, matrix2.columns);
        int newStolbs = Math.min(matrix1.stolbs, matrix2.stolbs);

        return new float[newColumns][newStolbs];
    }
}