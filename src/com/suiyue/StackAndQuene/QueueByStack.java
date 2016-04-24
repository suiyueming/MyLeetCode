package com.suiyue.StackAndQuene;

import java.util.Stack;

/**
 * Created by suiyue on 2016/4/24 0024.
 */
public class QueueByStack<E> {
    private Stack<E> stackA = new Stack<>();
    private Stack<E> stackB = new Stack<>();
    public synchronized void put(E e) {
        stackA.push(e);
    }
    public synchronized E pop() {
        if (stackB.isEmpty()) {
            while (!stackA.isEmpty()) {
                stackB.push(stackA.pop());
            }
        }
        return stackB.pop();
    }
    public synchronized boolean isEmpty() {
        return stackA.isEmpty()&&stackB.isEmpty();
    }
}
