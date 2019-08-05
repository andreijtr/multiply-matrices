package com.sda.multiply.matrix;

import org.junit.Assert;
import org.junit.Test;

public class MultiplyMatrixTest {

    @Test
    public void multiplyMatrixTest1 () {

        MutiplyMatrix multiplier = new MutiplyMatrix();

        int[][] firstMatrix = {{1, 1, 1}, {1, 1, 1}};
        int[][] secondMatrix = {{2, 2, 2, 2}, {2, 2, 2, 2}, {2, 2, 2, 2}};
        int[][] expectedMatrix = {{6, 6, 6, 6}, {6, 6, 6, 6}};

        int[][] resultMatrix = multiplier.multiplyTwoMatrices(firstMatrix,secondMatrix);

        Assert.assertArrayEquals(expectedMatrix,resultMatrix);
    }

    @Test
    public void multiplyMatrixTest2 () {

        MutiplyMatrix multiplier = new MutiplyMatrix();

        int[][] firstMatrix = {{1}, {1}, {1}};
        int[][] secondMatrix = {{2, 2, 2}};
        int[][] expectedMatrix = {{2, 2, 2}, {2, 2, 2}, {2,2,2}};

        int[][] resultMatrix = multiplier.multiplyTwoMatrices(firstMatrix,secondMatrix);

        Assert.assertArrayEquals(expectedMatrix,resultMatrix);
    }

    @Test
    public void multiplyMatrixTest3 () {

        MutiplyMatrix multiplier = new MutiplyMatrix();

        int[][] firstMatrix = {{1, 1}};
        int[][] secondMatrix = {{2}, {2}};
        int[][] expectedMatrix = {{4}};

        int[][] resultMatrix = multiplier.multiplyTwoMatrices(firstMatrix,secondMatrix);

        Assert.assertArrayEquals(expectedMatrix,resultMatrix);
    }

    @Test
    public void multiplyMatrixTest4 () {

        MutiplyMatrix multiplier = new MutiplyMatrix();

        int[][] firstMatrix = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        int[][] secondMatrix = {{2, 2, 2}, {2, 2, 2}, {2, 2, 2}};
        int[][] expectedMatrix = {{6, 6, 6}, {6, 6, 6}, {6,6,6}};

        int[][] resultMatrix = multiplier.multiplyTwoMatrices(firstMatrix,secondMatrix);

        Assert.assertArrayEquals(expectedMatrix,resultMatrix);
    }

}
