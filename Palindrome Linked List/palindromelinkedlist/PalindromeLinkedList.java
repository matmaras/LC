package palindromelinkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PalindromeLinkedList {

	public static class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	}
	 
	public static void main (String[] args) {
		
		ListNode head = new ListNode(10);
		head.next = new ListNode(5);
		head.next.next = new ListNode(11);
		
		System.out.println(isPalindrome(head));
	}
	
    public static boolean isPalindrome(ListNode head) {
        
    	if (head == null || head.next == null) {
    		return true;
    	}
    	
    	List<Integer> list = new ArrayList<>();
    	
    	while(head != null) {
    		list.add(head.val);
    		head = head.next;
    	}
    	
    	return isPalindromic(list);
    }
    
    public static boolean isPalindromic(List<Integer> list) {
	    int left = -1, right = list.size();
	    while (++left < --right) 
	        if (!list.get(left).equals(list.get(right))) {
	        	return false;
	        }
    	
    	return true;
    }
	
    public static boolean isPalindrome2(ListNode head) {
        
    	List<Integer> list = new ArrayList<>();
    	List<Integer> reverseLlist = new ArrayList<>();
    	
    	while(head != null) {
    		list.add(head.val);
    		reverseLlist.add(head.val);
    		head = head.next;
    	}
    	
    	if(list.size() == 1) {
    		return true;
    	}
    	
    	Collections.reverse(reverseLlist);
    	
    	if(list.equals(reverseLlist)) {
    		return true;
    	}
    	
    	return false;
    }
}
