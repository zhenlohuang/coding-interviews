package net.yidooo.interviews;


import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class Util {
    public static void verifyLinkedList(ListNode head, List<Integer> expected) {
        ListNode p = head;
        List<Integer> actual = new ArrayList<Integer>();
        while(p != null) {
            actual.add(p.val);
            p = p.next;
        }

        Assert.assertEquals(actual, expected);
    }
}
