package com.suiyue.LinkedList;

/**
 * Created by suiyue on 2016/4/24 0024.
 */
public class IsIntersect {
    public boolean isIntersect(Node head1, Node head2) {
        if (head1 == null || head2 == null) {
            return false;
        }
        Node tmp1 = head1;
        while (tmp1 != null) {
            tmp1 = tmp1.next;
        }
        Node tmp2 = head2;
        while (tmp2 != null) {
            tmp2 = tmp2.next;
        }
        return tmp1 == tmp2;
    }
    public Node getFirstMeetNode(Node head1, Node head2) {
        if (head1 == null || head2 == null) {
            return null;
        }
        Node tmp1 = head1;
        int len1 = 1;
        while (tmp1 != null) {
            tmp1 = tmp1.next;
            len1 ++;
        }
        Node tmp2 = head2;
        int len2 = 1;
        while (tmp2 != null) {
            tmp2 = tmp2.next;
            len2 ++;
        }
        //链表不想交
        if (tmp1 != tmp2) {
            return null;
        }
        Node t1 = head1;
        Node t2 = head2;
        if (len1 > len2) {
            int d = len1 - len2;
            while (d != 0) {
                t1 = t1.next;
                d --;
            }
        } else {
            int d = len2 = len1;
            while (d != 0) {
                t2 = t2.next;
                d --;
            }
        }
        while (t1 != t2) {
            t1 = t1.next;
            t2 = t2.next;
        }
        return t1;
    }
}
