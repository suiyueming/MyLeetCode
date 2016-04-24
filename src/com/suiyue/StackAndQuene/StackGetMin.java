package com.suiyue.StackAndQuene;

/**
 * Created by suiyue on 2016/4/24 0024.
 */
public class StackGetMin {
    StackByArray<Integer> elem;
    StackByArray<Integer> min;
    public StackGetMin() {
        elem = new StackByArray<>();
        min = new StackByArray<>();
    }
    public void push(int data) {
        elem.push(data);
        if (min.isEmpty()) {
            min.push(data);
        } else {
            if (data < min.peek()) {
                min.push(data);
            }
        }
    }
    public int pop() {
        int top = elem.peek();
        elem.pop();
        if (top == min()) {
            min.pop();
        }
        return top;
    }

    public int min() {
        if (min.isEmpty()) {
            return Integer.MAX_VALUE;
        } else {
            return min.peek();
        }
    }
}
