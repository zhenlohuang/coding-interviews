package net.yidooo.interviews;

import org.testng.annotations.Test;

import java.util.Arrays;

public class MergeLinkedListTest {
    @Test
    public void testMergeLinkedList() {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        Util.verifyLinkedList(new MergeLinkedList().Merge(list1, list2), Arrays.asList(1, 2, 3, 4, 5, 6));
    }
}
