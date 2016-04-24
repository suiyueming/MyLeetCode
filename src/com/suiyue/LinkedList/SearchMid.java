package com.suiyue.LinkedList;

/**
 * Created by suiyue on 2016/4/24 0024.
 */
public class SearchMid {
    public Node searchMid(Node head) {
        Node fastNode = head;
        Node slowNode = head;
        while (fastNode!=null && fastNode.next!=null
                && fastNode.next.next!=null) {
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }
        return slowNode;
    }
}
