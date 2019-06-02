package net.yidooo.interviews;

/**
 * 二维数组中的查找
 */
public class SearchA2DMatrix {
    public boolean Find(int target, int [][] array) {
        if(array.length == 0) {
            return false;
        } else {
            int rows = array.length;
            int  columns = array[0].length;

            int i = 0;
            int j = columns - 1;
            while (i <= rows - 1 && j >= 0) {
                if (array[i][j] == target) {
                    return true;
                } else if (array[i][j] < target) {
                    i = i + 1;
                } else if (array[i][j] > target) {
                    j = j - 1;
                }
            }

            return false;
        }
    }
}
