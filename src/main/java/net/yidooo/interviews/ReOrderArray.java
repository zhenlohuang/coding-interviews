package net.yidooo.interviews;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 调整数组顺序使奇数位于偶数前面
 */
public class ReOrderArray {
    public void reOrderArray(int [] array) {
        Queue<Integer> oddNumQueue = new LinkedList<Integer>();
        Queue<Integer> evenNumQueue = new LinkedList<Integer>();

        for(int num : array) {
            if(num % 2 == 0) {
                evenNumQueue.offer(num);
            } else {
                oddNumQueue.offer(num);
            }
        }

        int cursor = 0;
        while(!oddNumQueue.isEmpty()) {
            array[cursor] = oddNumQueue.poll();;
            cursor++;
        }
        while(!evenNumQueue.isEmpty()) {
            array[cursor] = evenNumQueue.poll();
            cursor++;
        }
    }
}
