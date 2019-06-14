package net.yidooo.interviews;

import java.util.Stack;

/**
 * 包含min函数的栈
 */
public class MinStack {
    private Stack<Integer> items = null;
    private Stack<Integer> mininal = null;

    MinStack() {
        items = new Stack<>();
        mininal = new Stack<>();
    }

    public void push(int node) {
        items.push(node);
        if(mininal.isEmpty() || mininal.peek() >= node) {
            mininal.push(node);
        }
    }

    public void pop() {
        Integer item = items.pop();
        if(item == mininal.peek()) {
            mininal.pop();
        }
    }

    public int top() {
        return items.peek();
    }

    public int min() {
        return mininal.peek();
    }
}
