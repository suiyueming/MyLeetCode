package com.suiyue.StackAndQuene;

import java.util.LinkedList;

/**
 * Created by suiyue on 2016/4/24 0024.
 */
public class QueueSynchronized<E> {
    private LinkedList<E> list = new LinkedList<>();
    private int size = 0;
    public synchronized void put(E e) {
        list.addLast(e);
        size ++;
    }
    public synchronized E pop(){
        size --;
        return list.removeFirst();
    }
    public synchronized boolean isEmpty() {
        return size==0;
    }
    public synchronized int size() {
        return size;
    }
}
