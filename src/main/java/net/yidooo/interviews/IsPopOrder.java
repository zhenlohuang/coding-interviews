package net.yidooo.interviews;

import java.util.Stack;

/**
 * 栈的压入、弹出序列
 */
public class IsPopOrder {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        int pushAIndex = 0;
        int popAIndex = 0;
        Stack<Integer> stack = new Stack<>();

        while(pushAIndex < pushA.length && popAIndex < popA.length) {
            stack.push(pushA[pushAIndex++]);
            if(stack.peek() == popA[popAIndex]) {
                popAIndex++;
                stack.pop();
            }
        }

        while(popAIndex < pushA.length) {
            if(stack.pop() != popA[popAIndex++]) {
                return false;
            }
        }

        return true;
    }
}
