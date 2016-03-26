package com.suiyue;

public class AddTwoNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);	
		ListNode tmp = new ListNode(0);
		result.next = tmp;
		int add = 0;
		while(l1!=null || l2 != null) {
		    add /= 10;
			if(l1!= null && l2 !=null) {
				add = l1.val + l2.val + tmp.val;
				tmp.next = new ListNode(add % 10);
				l1 = l1.next;
				l2 = l2.next;
				tmp = tmp.next;
			} else if(l1 != null){
				add = l1.val + tmp.val;
				tmp.next = new ListNode(add % 10);
				l1 = l1.next;
				tmp = tmp.next;
			} else {
				add = l2.val + tmp.val;
				tmp.next = new ListNode(add % 10);
				l2 = l2.next;
				tmp = tmp.next;
			}
		}
		if(add / 10 == 1) {
			tmp.next = new ListNode(1);
		}
		return result.next.next;
        
    }
	
	public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);	
		ListNode tmp = new ListNode(0);
		result.next = tmp;
		while(l1!=null || l2 != null) {
			if(l1!= null && l2 !=null) {
				if(l1.next == null && l2.next == null && (l1.val + l2.val + tmp.val) / 10 == 0) {
				    tmp.val = (l1.val + l2.val + tmp.val) % 10;
				    return result.next;
				}
				tmp.next = new ListNode((l1.val + l2.val + tmp.val) / 10);
				tmp.val = (l1.val + l2.val + tmp.val) % 10;
				l1 = l1.next;
				l2 = l2.next;
				tmp = tmp.next;
			} else if(l1 != null){
				if(l1.next == null && (l1.val + tmp.val) / 10 == 0) {
				    tmp.val = (l1.val + tmp.val) % 10;
				    return result.next;
				}
				tmp.next = new ListNode((l1.val + tmp.val) / 10);
				tmp.val = (l1.val + tmp.val) % 10;
				l1 = l1.next;
				tmp = tmp.next;
			} else {
				
				if(l2.next == null && (l2.val + tmp.val) / 10 == 0) {
				    tmp.val = (l2.val + tmp.val) % 10;
				    return result.next;
				}
				
				tmp.next = new ListNode((l2.val + tmp.val) / 10);
				tmp.val = (l2.val + tmp.val) % 10;
				l2 = l2.next;
				tmp = tmp.next;
			}
		}
		return result.next;
    }
	
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}

}
