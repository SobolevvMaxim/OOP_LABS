package com.company;

public class Matrix {
    private float[][] matrix;
    private int columns;
    private int rows;

    public Matrix() {
    }

    public Matrix(float[][] matrix) {
        this.matrix = matrix;
        columns = matrix[0].length;
        rows = matrix.length;
    }

    public Matrix(int columns, int rows) {
        this.columns = columns;
        this.rows = rows;
        matrix = new float[rows][columns];
    }

    public float getElement(int colIndex, int rowIndex) {
        return matrix[rowIndex][colIndex];
    }

    public void setElement(int colIndex, int rowIndex, float element) {
        matrix[rowIndex][colIndex] = element;
    }

    public float[][] getMatrix() {
        return matrix;
    }

    public void printMatrix() {
        for (float[] floats : matrix) {
            for (int j = 0; j < columns; j++) {
                System.out.print(floats[j] + "   ");
            }
            System.out.println();
        }
    }

    public static float[][] sumTwoMatrix(Matrix matrix1, Matrix matrix2) {
        float[][] result = getNewMatrixSize(matrix1, matrix2);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = matrix1.getElement(j, i) + matrix2.getElement(j, i);
            }
        }

        return result;
    }

    private static float[][] getNewMatrixSize(Matrix matrix1, Matrix matrix2) {
        int newColumns = Math.min(matrix1.columns, matrix2.columns);
        int newRows = Math.min(matrix1.rows, matrix2.rows);

        return new float[newRows][newColumns];
    }
}