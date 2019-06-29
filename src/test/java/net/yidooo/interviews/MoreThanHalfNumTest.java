package net.yidooo.interviews;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MoreThanHalfNumTest {
    @Test
    public void testSingleNumInArray() {
        Assert.assertEquals(new MoreThanHalfNum().MoreThanHalfNum_Solution(new int[]{1}), 1);
    }

    @Test
    public void testTheNumExistsInArray() {
        Assert.assertEquals(new MoreThanHalfNum().MoreThanHalfNum_Solution(new int[]{1,2,3,2,2,2,5,4,2}), 2);
    }
    @Test
    public void testTheNumDoesNotExistsInArray() {
        Assert.assertEquals(new MoreThanHalfNum().MoreThanHalfNum_Solution(new int[]{1,2,3,2,4,2,5,2,3}), 0);
    }
}
