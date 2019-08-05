package com.sda.multiply.matrix;

public class MultiplyMatrixMain {

    public static void main(String[] args) {

        MutiplyMatrix multiplyMatrix = new MutiplyMatrix();
        ToolsMatrix toolsForMatrix = new ToolsMatrix();

        int[][] firstMatrix = {{1, 1, 1}, {1, 1, 1}};
        int[][] secondMatrix = {{2, 2, 2, 2}, {2, 2, 2, 2}, {2, 2, 2, 2}};

        int[][] resultMatrix = multiplyMatrix.multiplyTwoMatrices(firstMatrix,secondMatrix);

        toolsForMatrix.showMatrix(resultMatrix);
    }
}
