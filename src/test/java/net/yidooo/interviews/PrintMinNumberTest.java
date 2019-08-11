package net.yidooo.interviews;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrintMinNumberTest {
    @Test
    public void testEmptyArray() {
        Assert.assertEquals(new PrintMinNumber().PrintMinNumber(new int[]{}), "");
    }

    @Test
    public void testSingleNumber() {
        Assert.assertEquals(new PrintMinNumber().PrintMinNumber(new int[]{321}), "321");
    }

    @Test
    public void testMultipleNumbers() {
        Assert.assertEquals(new PrintMinNumber().PrintMinNumber(new int[]{3, 32, 321}), "321323");
    }
}
