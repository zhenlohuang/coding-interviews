package net.yidooo.interviews;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MinStackTest {
    @Test
    public void testPush() {
        MinStack stack = new MinStack();
        stack.push(1);
        stack.push(2);

        Assert.assertEquals(stack.top(), 2);
    }

    @Test
    public void testPop() {
        MinStack stack = new MinStack();
        stack.push(1);
        stack.push(2);
        stack.pop();

        Assert.assertEquals(stack.top(), 1);
    }

    @Test
    public void testMin() {
        MinStack stack = new MinStack();
        stack.push(1);
        stack.push(3);
        stack.push(2);

        Assert.assertEquals(stack.min(), 1);
    }

    @Test
    public void testMinAfterPop() {
        MinStack stack = new MinStack();
        stack.push(4);
        stack.push(3);
        stack.push(2);
        Assert.assertEquals(stack.min(), 2);
        stack.pop();
        Assert.assertEquals(stack.min(), 3);
    }
}
