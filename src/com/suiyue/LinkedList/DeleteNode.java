package com.suiyue.LinkedList;

/**
 * Created by suiyue on 2016/4/24 0024.
 */
public class DeleteNode {
    public boolean deleteNode(Node node) {
        if (node == null || node.next == null) {
            return false;
        }
        int tmp = node.data;
        node.data = node.next.data;
        node.next.data = tmp;
        node.next = node.next.next;
        return true;
    }
}
