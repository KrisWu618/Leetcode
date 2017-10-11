import java.util.HashSet;
import java.util.Set;

public class RemovedLinkedList_203 {
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	 public ListNode removeElements(ListNode head, int val) {
	        while (head != null && head.val == val) head = head.next;      
	        ListNode current = head;
	        while(current != null && current.next != null){
	            if(current.next.val == val){
	                current.next = current.next.next;
	            }else{
	                current = current.next;
	            }
	        }
	        return head;
	        
	    }
	 
	 public ListNode removeElements_Recursive(ListNode head, int val) {
		 if(head == null) return head;
		 head.next = removeElements_Recursive(head.next,val);
		 return head.val == val ? head.next : head;
	 }
	 
	 
	 

}
