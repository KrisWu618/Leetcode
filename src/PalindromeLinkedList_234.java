

public class PalindromeLinkedList_234 {
	private static ListNode head;
	public static class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x;}
	 }
	
	
	
	public boolean isPalindrome(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		if(fast != null) {
			// odd nodes: let right half smaller
			slow = slow.next;
		}
		slow = Reverse(slow);
		fast = head;
		
		while(slow != null) {
			if(slow.val != fast.val) {
				return false;
			}else {
				slow = slow.next;
				fast = fast.next;
			}
		}
		return true;
	}
	
	public ListNode Reverse(ListNode head) {
		ListNode previous = null;
		while(head != null) {
			ListNode temp = head.next;
			head.next = previous;
			previous = head;
			head = temp;
		}
		return previous;
	}
	
}
