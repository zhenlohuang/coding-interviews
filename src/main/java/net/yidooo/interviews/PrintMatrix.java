package net.yidooo.interviews;

import java.util.ArrayList;

public class PrintMatrix {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        if(matrix.length > 0) {
            printMatrix(matrix, 0, matrix.length - 1, 0, matrix[0].length - 1, result);
        }

        return result;
    }

    private void printMatrix(int[][] matrix, int top, int bottom, int left, int right, ArrayList<Integer> result) {
        if(top > bottom || left > right) {
            return ;
        } else {
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            for (int i = top + 1; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            if (top != bottom) {
                for (int i = right - 1; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
            }
            if (left != right) {
                for (int i = bottom - 1; i > top; i--) {
                    result.add(matrix[i][left]);
                }
            }
            printMatrix(matrix, top + 1, bottom - 1, left + 1, right - 1, result);
        }
    }
}
