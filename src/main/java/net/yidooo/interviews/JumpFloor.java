package net.yidooo.interviews;

/**
 * 跳台阶
 */
public class JumpFloor {
    public int jumpFloor(int target) {
        int previous = 0;
        int current = 1;
        for(int i = 2; i <= target; i++) {
            int tmp = current;
            current += previous;
            previous = tmp;
        }
        return current;
    }
}
