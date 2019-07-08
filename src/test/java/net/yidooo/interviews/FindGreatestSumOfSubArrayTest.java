package net.yidooo.interviews;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindGreatestSumOfSubArrayTest {
    @Test
    public void testEmptyArray() {
        Assert.assertEquals(new FindGreatestSumOfSubArray().FindGreatestSumOfSubArray(new int[]{}), 0);
    }

    @Test
    public void testMultipleItems() {
        Assert.assertEquals(new FindGreatestSumOfSubArray().FindGreatestSumOfSubArray(new int[]{6,-3,-2,7,-15,1,2,2}), 8);
    }
}
