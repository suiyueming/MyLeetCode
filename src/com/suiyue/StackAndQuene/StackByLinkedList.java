package com.suiyue.StackAndQuene;

/**
 * Created by suiyue on 2016/4/24 0024.
 */
public class StackByLinkedList<E> {
    Node<E> top;

    public boolean isEmpty() {
        return top == null;
    }
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return (E)top.data;
    }
    public E pop() {
        if (isEmpty()) {
            return null;
        }
        E data = top.data;
        top = top.next;
        return data;
    }
    public void push(E e) {
        Node<E> newE = new Node<>(e);
        newE.next = top;
        top = newE;
    }
}
