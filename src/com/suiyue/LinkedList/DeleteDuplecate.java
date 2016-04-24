package com.suiyue.LinkedList;

import java.util.HashMap;

/**
 * Created by suiyue on 2016/4/24 0024.
 */
public class DeleteDuplecate {
    //删除链表中重复元素
    //HashMap
    public void deleteDuplecate(Node head) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Node tmp = head;
        Node pre = null;
        while(tmp != null) {
            if (hashMap.containsKey(tmp.data)) {
                pre.next = tmp.next;
            } else {
                hashMap.put(tmp.data, 1);
                pre = tmp;
            }
            tmp = tmp.next;
        }
    }
}
