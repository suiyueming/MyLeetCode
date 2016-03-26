package com.suiyue;



public class RemoveDuplicatesfromSortedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}
	
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null) return head;
		ListNode nex = head;
		while (nex.next != null){
			while(nex.val == nex.next.val) {
				if (nex.next.next != null) {
					nex.next = nex.next.next;
				} else {
					nex.next = null;
					return head;
				}
			}
			nex = nex.next;
		}	
		return head;        
    }

}
