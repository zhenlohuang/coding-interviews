package net.yidooo.interviews;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MinNumberInRotateArrayTest {
    @Test
    public void testEmptyArray() {
        int[] array = new int[] {};
        Assert.assertEquals(new MinNumberInRotateArray().minNumberInRotateArray(array), 0);
    }

    @Test
    public void testOnlyOneNumberInArray() {
        int[] array = new int[] {1};
        Assert.assertEquals(new MinNumberInRotateArray().minNumberInRotateArray(array), 1);
    }

    @Test
    public void testArrayInOrder() {
        int[] array = new int[] {1, 2, 3};
        Assert.assertEquals(new MinNumberInRotateArray().minNumberInRotateArray(array), 1);
    }

    @Test
    public void testRotateArray() {
        int[] array = new int[] {3,4,5,1,2};
        Assert.assertEquals(new MinNumberInRotateArray().minNumberInRotateArray(array), 1);
    }
}
