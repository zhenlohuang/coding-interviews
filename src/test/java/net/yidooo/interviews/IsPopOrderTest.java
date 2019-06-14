package net.yidooo.interviews;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPopOrderTest {
    @Test
    public void testIsPopOrder() {
        Assert.assertTrue(new IsPopOrder().IsPopOrder(new int[]{1,2,3,4,5}, new int[]{4,5,3,2,1}));
        Assert.assertFalse(new IsPopOrder().IsPopOrder(new int[]{1,2,3,4,5}, new int[]{4,3,5,1,2}));
    }
}
