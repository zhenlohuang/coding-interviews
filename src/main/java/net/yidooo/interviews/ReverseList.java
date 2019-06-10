package net.yidooo.interviews;

/**
 * 反转链表
 */
public class ReverseList {
    public ListNode ReverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        } else {
            ListNode nextNode = head.next;
            ListNode newHead = ReverseList(nextNode);
            nextNode.next = head;
            head.next = null;
            return newHead;
        }
    }
}
