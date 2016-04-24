package com.suiyue.LinkedList;

/**
 * Created by suiyue on 2016/4/24 0024.
 */
public class MyLinkedList {
    Node head = null;
    /*
    在链表末尾插入数据
     */
    public void addNode(int d) {
        Node newNode = new Node(d);
        if (head == null) {
            head = newNode;
            return;
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = newNode;
    }
    /*
    删除第index个节点
     */
    public Boolean deleteNode(int index) {
        if (index<1 || index >length()) {
            return false;
        }
        if (index == 1) {
            head = head.next;
            return true;
        }
        int i=1;
        Node preNode = head;
        Node curNode = preNode.next;
        while (curNode != null) {
            if (i==index) {
                preNode.next = curNode.next;
                return true;
            }
            preNode = curNode;
            curNode = curNode.next;
            i++;
        }
        return true;
    }
    /*
    对链表排序
     */
    public Node orderList() {
        Node nextNode = null;
        int tmp = 0;
        Node curNode = head;
        while (curNode.next != null) {
            nextNode = curNode.next;
            while (nextNode!=null) {
                if (curNode.data > nextNode.data) {
                    tmp = curNode.data;
                    curNode.data = nextNode.data;
                    nextNode.data = tmp;
                }
                nextNode = nextNode.next;
            }
            curNode = curNode.next;
        }
        return head;
    }
    /*
    打印链表
     */
    public void printList() {
        Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }
    /*
    返回链表长度
     */
    public int length() {
        int length = 0;
        Node tmp = head;
        while (tmp != null) {
            length ++;
            tmp = tmp.next;
        }
        return length;
    }
}
