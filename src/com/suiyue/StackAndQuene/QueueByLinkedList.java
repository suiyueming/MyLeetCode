package com.suiyue.StackAndQuene;

/**
 * Created by suiyue on 2016/4/24 0024.
 */
public class QueueByLinkedList<E> {
    private Node<E> headNode = null;
    private Node<E> tailNode = null;
    public boolean isEmpty() {
        return headNode == tailNode;
    }
    public void push(E data) {
        Node<E> newNode = new Node<>(data);
        if (headNode == null && tailNode == null) {
            headNode = newNode;
            tailNode = newNode;
        } else {
            tailNode.next = newNode;
            tailNode = newNode;
        }
    }

    public E pop() {
        if(isEmpty()) {
            return null;
        }
        E data = headNode.data;
        headNode = headNode.next;
        return data;
    }

    public int size() {
        Node<E> temp = headNode;
        int n = 0;
        while (temp != null) {
            n ++;
            temp = temp.next;
        }
        return n;

    }
}
