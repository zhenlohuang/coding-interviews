package net.yidooo.interviews;

/**
 * 连续子数组的最大和
 */
public class FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array.length == 0) {
            return 0;
        } else {
            int[] dp = new int[array.length];
            dp[0] = array[0];
            for (int i = 1; i < array.length; i++) {
                dp[i] = Math.max(dp[i-1] + array[i], array[i]);
            }

            int max = dp[0];
            for(int i = 1; i < array.length; i++) {
                if(dp[i] > max) {
                    max = dp[i];
                }
            }
            return max;
        }
    }
}
