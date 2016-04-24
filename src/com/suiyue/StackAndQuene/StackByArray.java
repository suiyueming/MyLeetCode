package com.suiyue.StackAndQuene;

import java.util.Arrays;

/**
 * Created by suiyue on 2016/4/24 0024.
 */
public class StackByArray<E> {
    private Object[] stack;
    private int size;
    public StackByArray() {
        stack = new Object[10];
    }
    public boolean isEmpty() {
        return size==0;
    }
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return (E)stack[size-1];
    }
    public E pop() {
        E e = peek();
        stack[size-1] = null;
        size --;
        return e;
    }
    public E push(E e) {
        checkCapacity(size+1);
        stack[size++] = e;
        return e;
    }
    public void checkCapacity(int size) {
        int len = stack.length;
        if (size > len) {
            int newLen = 10;
            stack = Arrays.copyOf(stack, newLen);
        }
    }
}
