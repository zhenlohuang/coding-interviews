package net.yidooo.interviews;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 从尾到头打印链表
 */
public class PrintLinkedListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<Integer>();
        ListNode cursor = listNode;
        while(cursor != null) {
            stack.push(cursor.val);
            cursor = cursor.next;
        }

        ArrayList<Integer> result = new ArrayList<Integer>(stack.size());
        while(!stack.isEmpty()) {
            result.add(stack.pop());
        }

        return result;
    }
}
