package net.yidooo.interviews;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PowerTest {
    @Test
    public void testBaseIsZero() {
        Assert.assertEquals(new Power().power(0, 10), 0d);
    }

    @Test
    public void testExponentIsZero() {
        Assert.assertEquals(new Power().power(2, 0), 1d);
    }

    @Test
    public void testExponentIsOne() {
        Assert.assertEquals(new Power().power(2, 1), 2d);
    }

    @Test
    public void testExponentIsOdd() {
        Assert.assertEquals(new Power().power(2, 3), 8d);
    }

    @Test
    public void testExponentIsEven() {
        Assert.assertEquals(new Power().power(2, 2), 4d);
    }

    @Test
    public void testExponentIsNegative() {
        Assert.assertEquals(new Power().power(2, -1), 0.5);
    }
}
