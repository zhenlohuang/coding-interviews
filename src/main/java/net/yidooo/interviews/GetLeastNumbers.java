package net.yidooo.interviews;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * 最小的K个数
 */
public class GetLeastNumbers {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if(input.length < k || k == 0) {
            return new ArrayList<>();
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(k, (o1, o2) -> o2 - o1);
        for(int num : input) {
            if(queue.size() < k) {
                queue.offer(num);
            } else if(queue.peek() > num) {
                queue.poll();
                queue.offer(num);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        for(int num: queue) {
            result.add(num);
        }

        return result;
    }
}
