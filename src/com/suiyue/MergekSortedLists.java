package com.suiyue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.suiyue.OddEvenLinkedList.ListNode;

public class MergekSortedLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode mergeKLists(ListNode[] lists) {
		if(lists.length == 0) return null;
		List<ListNode> listsList= Arrays.asList(lists);
		listsList = getMin(listsList);
		if(listsList.size() == 0) return null;
		ListNode result = null;
        ListNode resHead = listsList.get(0);
        resHead.next = result;
        listsList.remove(0);
        while(listsList.size() != 0) {
        	listsList = getMin(listsList);
        	if(listsList.size() == 0) {
        		return resHead;
        	} else {
        		result = listsList.get(0);
        		
        	}
            
        }
        return resHead;
        
    }
	public List<ListNode> getMin(List<ListNode> listsList) {
		List<ListNode> result = new ArrayList<ListNode>();
		if(listsList.size() == 0) {return result;}
		ListNode minValue = listsList.get(0);
		for(int i=0; i<listsList.size(); i++) {
			if(listsList.get(i) == null) {
				listsList.remove(i);
			} else if(minValue.val > listsList.get(i).val) {
				minValue = listsList.get(i);
				listsList.set(i, listsList.get(i).next);
			}
		}
		listsList.add(0, minValue);
		return listsList;
		
	}

}
