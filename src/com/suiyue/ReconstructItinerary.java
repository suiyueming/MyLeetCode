package com.suiyue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ReconstructItinerary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<String> findItinerary(String[][] tickets) {
		HashMap<String, List<String>> tmp = new HashMap<>();
		List<String> result = new ArrayList<>();
		result.add("JFK");
		for(int i=0; i<tickets.length; i++) {
			if(tmp.containsKey(tickets[i][0])) {
				tmp.put(tickets[i][0], order(tmp.get(tickets[i][0]), tickets[i][1]));
			} else {
				List<String> list = new ArrayList<>();
				list.add(tickets[i][1]);
				tmp.put(tickets[i][0], list);
			}
			
		}
		String nowCap = "JFK";
		while (!tmp.isEmpty()) {
			System.out.println(nowCap);
			System.out.println(tmp.get(nowCap).size());
			String tmpCap = tmp.get(nowCap).get(0);
			if(tmp.size()>2 && !tmp.containsKey(tmpCap)) {
				tmp.get(nowCap).remove(0);
				tmp.get(nowCap).add(nowCap);
			}
			result.add(tmp.get(nowCap).get(0));		
			tmp.get(nowCap).remove(0);
			if(tmp.get(nowCap).size() == 0) {
				tmp.remove(nowCap);
			}
			nowCap = tmpCap;
		}
		return result;  
    }
	
	public List<String> order(List<String> ori, String newT) {
		for(int i=0; i<ori.size(); i++) {
			if(ori.get(i).charAt(0) > newT.charAt(0)) {
				ori.add(i, newT);
				return ori;
			} else if(ori.get(i).charAt(0) < newT.charAt(0)) {
				continue;
			} else if(ori.get(i).charAt(1) > newT.charAt(1)) {
				ori.add(i, newT);
				return ori;
			} else if(ori.get(i).charAt(1) < newT.charAt(1)) {
				continue;
			} else if(ori.get(i).charAt(2) > newT.charAt(2)) {
				ori.add(i, newT);
				return ori;
			}
		}
		ori.add(newT);
		return ori;
		
	}

}
