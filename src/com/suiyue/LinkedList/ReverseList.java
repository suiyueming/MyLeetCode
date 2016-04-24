package com.suiyue.LinkedList;

/**
 * Created by suiyue on 2016/4/24 0024.
 */
public class ReverseList {
    public Node reverseList(Node head) {
        Node reverseNode = head;
        Node curNode = head;
        Node preNode = null;
        while (curNode != null) {
            Node nextNode = curNode.next;
            if (nextNode == null) {
                reverseNode = curNode;
            }
            curNode.next = preNode;
            preNode = curNode;
            curNode = nextNode;
        }
        return reverseNode;
    }
}
