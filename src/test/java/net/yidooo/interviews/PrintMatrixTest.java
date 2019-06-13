package net.yidooo.interviews;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class PrintMatrixTest {
    @Test
    public void testPrintMatrix1() {
        int[][] matrix = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        Assert.assertEquals(new PrintMatrix().printMatrix(matrix), Arrays.asList(1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10));
    }

    @Test
    public void testPrintMatrix2() {
        int[][] matrix = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        Assert.assertEquals(new PrintMatrix().printMatrix(matrix), Arrays.asList(1,2,3,4,8,12,11,10,9,5,6,7));
    }

    @Test
    public void testOnlyOneElement() {
        int[][] matrix = new int[][]{{1}};
        Assert.assertEquals(new PrintMatrix().printMatrix(matrix), Arrays.asList(1));
    }

    @Test
    public void testOnlySingleROw() {
        int[][] matrix = new int[][]{{1, 2, 3}};
        Assert.assertEquals(new PrintMatrix().printMatrix(matrix), Arrays.asList(1, 2, 3));
    }

    @Test
    public void testOnlySingleColumn() {
        int[][] matrix = new int[][]{{1}, {2}, {3}};
        Assert.assertEquals(new PrintMatrix().printMatrix(matrix), Arrays.asList(1, 2, 3));
    }
}
