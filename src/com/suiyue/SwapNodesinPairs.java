package com.suiyue;

import com.suiyue.AddTwoNumbers.ListNode;
public class SwapNodesinPairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


	}
	public ListNode swapPairs(ListNode head) {
		//链表为空或链表只有一个节点
        if ((head == null)||(head.next == null))
            return head;
        ListNode n = head.next;
        head.next = swapPairs(head.next.next);
        n.next = head;
        return n;
	}

}
