package net.yidooo.interviews;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyQueueTest {
    @Test
    public void testPushThenPop() {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);

        Assert.assertEquals(queue.pop(), 1);
        Assert.assertEquals(queue.pop(), 2);
        Assert.assertEquals(queue.pop(), 3);
        Assert.assertEquals(queue.pop(), 4);
        Assert.assertEquals(queue.pop(), 5);
    }
}
