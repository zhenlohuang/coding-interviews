package net.yidooo.interviews;

/**
 * 链表中倒数第k个结点
 */
public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null || k == 0) {
            return null;
        } else {
            ListNode tail = head;
            ListNode target = head;
            for (int i = 0; i < k - 1 && tail != null; i++) {
                tail = tail.next;
            }
            if(tail == null) {
                return null;
            }

            while (tail.next != null) {
                tail = tail.next;
                target = target.next;
            }

            return target;
        }
    }
}
