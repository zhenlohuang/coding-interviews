package net.yidooo.interviews;

/**
 * 合并两个排序的链表
 */
public class MergeLinkedList {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null) {
            return list2;
        } else if(list2 == null) {
            return list1;
        } else {
            if(list1.val < list2.val) {
                ListNode nextNode1 = list1.next;
                list1.next = Merge(nextNode1, list2);
                return list1;
            } else {
                ListNode nextNode2 = list2.next;
                list2.next = Merge(list1, nextNode2);
                return list2;
            }
        }
    }
}
