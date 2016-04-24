package com.suiyue.LinkedList;

/**
 * Created by suiyue on 2016/4/24 0024.
 */
public class FindKthElem {
    //返回链表的倒数第k个元素
    public Node finfKthElem(Node head, int k) {
        if (k < 1 || k>new MyLinkedList().length(head)) {
            return null;
        }
        Node high = head;
        Node low = head;
        for(int i=0; i<k-1; i++) {
            high = high.next;
        }
        while (high != null) {
            high = high.next;
            low = low.next;
        }
        return low;
    }
}
