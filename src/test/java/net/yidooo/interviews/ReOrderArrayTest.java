package net.yidooo.interviews;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReOrderArrayTest {
    @Test
    public void testReOrderArray() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        new ReOrderArray().reOrderArray(array);
        Assert.assertEquals(array, new int[]{1, 3, 5, 2, 4});
    }

}
