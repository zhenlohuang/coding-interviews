package net.yidooo.interviews;

/**
 * 斐波那契数列
 */
public class Fibonacci {
    public int fibonacci(int n) {
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        } else{
            int previous = 0;
            int current = 1;
            for(int i = 2; i <= n; i++) {
                int tmp = current;
                current += previous;
                previous = tmp;
            }
            return current;
        }
    }
}
