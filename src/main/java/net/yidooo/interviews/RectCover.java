package net.yidooo.interviews;

/**
 * 矩形覆盖
 */
public class RectCover {
    public int rectCover(int target) {
        if(target == 0) {
            return 0;
        } else {
            int previous = 1;
            int current = 1;
            for (int i = 2; i <= target; i++) {
                int tmp = current;
                current += previous;
                previous = tmp;
            }
            return current;
        }
    }
}
