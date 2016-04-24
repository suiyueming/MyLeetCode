package com.suiyue.LinkedList;

/**
 * Created by suiyue on 2016/4/24 0024.
 */
public class IsLoop {
    public boolean isLoop(Node head) {
        Node fastNode = head;
        Node slowNode = head;
        if (fastNode == null) return false;
        while (fastNode!=null && fastNode.next!=null) {
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
            if (fastNode == slowNode) {
                return true;
            }
        }
        return !(fastNode == null || fastNode.next == null);
    }
    public Node findLoopPort(Node head) {
        Node fastNode = head;
        Node slowNode = head;
        while (fastNode!=null && fastNode.next!=null) {
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
            if (fastNode == slowNode) {
                break;
            }
        }
        if (fastNode==null || fastNode.next==null) {
            return null;
        }
        slowNode = head;
        while (slowNode != fastNode) {
            slowNode = slowNode.next;
            fastNode = fastNode.next;
        }
        return slowNode;
    }
}
