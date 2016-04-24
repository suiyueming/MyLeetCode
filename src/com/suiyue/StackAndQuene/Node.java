package com.suiyue.StackAndQuene;

/**
 * Created by suiyue on 2016/4/24 0024.
 */
public class Node<E> {
    Node<E> next = null;
    E data;
    public Node(E data) {
        this.data = data;
    }
}
