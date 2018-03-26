import java.util.HashSet;
import java.util.Set;


//Given a linked list, determine if it has a cycle in it.
public class DetectLinkedListCycle_141 {
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	
	public boolean detect(ListNode head) {
		 
		 Set<ListNode> s = new HashSet<>();
		 
		 while(head != null) {
			 if(s.contains(head)) { 
				 return true;
			 }else{
				 s.add(head);
			 } 
			 
			 head = head.next;
		 }
		 return false;
	 }
	
	public boolean detect2(ListNode head) {
		if (head == null || head.next == null) {
	        return false;
	    }
		ListNode slow = head;
		ListNode fast = head.next;
		while(slow != fast) {
			if(fast == null || fast.next == null) {
				return false;
				}
			slow = slow.next;
			fast = fast.next.next;
		}
		return true;
	}

}
