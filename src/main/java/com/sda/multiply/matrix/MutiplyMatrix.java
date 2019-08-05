package com.sda.multiply.matrix;

public class MutiplyMatrix {

    public int[][] multiplyTwoMatrices(int[][] firstMatrix, int[][] secondMatrix) {

        int[][] resultMatrix;
        int rowsResult = 0;
        int colsResult = 0;

        //this is the common size between first and second matrix
        int commonIndex = 0;

        int rowsFirst = firstMatrix.length;
        int colsFirst = firstMatrix[0].length;

        int rowsSecond = secondMatrix.length;
        int colsSecond = secondMatrix[0].length;

        //check if conditions for matrices multiplying are met
        //size of matrix should be like: first - M * N; second - N * L;
        if (colsFirst == rowsSecond) {
            //conditions are met, so the result matrix will be created and initialized
            rowsResult = rowsFirst;
            colsResult = colsSecond;
            commonIndex = colsFirst;    //or rowsSecond, same value

            resultMatrix = new int[rowsResult][colsResult];
            for (int i = 0; i < rowsResult; i++) {
                for (int j = 0; j < colsResult; j++) {
                    resultMatrix[i][j] = 0;
                }
            }
        }
        else {
            //if condition are not met, return nothing
            //should create an exception
            int[][] exception = new int[1][1];
            exception[0][0] = 0;
            return exception;
        }

        for (int i = 0; i < rowsResult; i++) {
            for (int j = 0; j < colsResult; j++) {
                //until here, we parse resultMatrix
                //i - gives the row for resultM and firstM, j - gives the col for resultM and secondM,
                for (int k = 0; k < commonIndex; k++) {
                    //k - gives the col for firstM and the row for secondM
                    //check the formula on paper when you look again at this code
                    resultMatrix[i][j] += (firstMatrix[i][k] * secondMatrix[k][j]);
                }
            }
        }

        return resultMatrix;
    }
}
