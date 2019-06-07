package net.yidooo.interviews;

/**
 * 二进制中1的个数
 */
public class NumberOf1 {
    public int numberOf1(int n) {
        int tmp = n;
        int count = 0;
        while(tmp != 0) {
            count++;
            tmp &= tmp - 1;
        }
        return count;
    }
}
