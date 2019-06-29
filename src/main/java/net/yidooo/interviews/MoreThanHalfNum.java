package net.yidooo.interviews;

import java.util.HashMap;
import java.util.Map;

/**
 * 数组中出现次数超过一半的数字
 */
public class MoreThanHalfNum {
    public int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer, Integer> stats = new HashMap<>();

        for(int num : array) {
            stats.put(num, stats.getOrDefault(num, 0) + 1);
        }

        int maxNum = 0;
        for(int num: stats.keySet()) {
            if(stats.get(num) > maxNum) {
                maxNum = num;
            }
        }

        if(stats.get(maxNum) > array.length / 2) {
            return maxNum;
        } else {
            return 0;
        }
    }
}
