package com.sda.multiply.matrix;

import java.util.Scanner;

public class ToolsMatrix {

    public void showMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] readMatrix() {

        Scanner myScan = new Scanner(System.in);
        int[][] result;

        System.out.println("Give number of rows of new matrix:");
        int rows = myScan.nextInt();
        System.out.println("Give number of cols:");
        int cols = myScan.nextInt();
        result = new int[rows][cols];

        System.out.println("Give elements of matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = myScan.nextInt();
            }
        }

        return result;
    }
}
