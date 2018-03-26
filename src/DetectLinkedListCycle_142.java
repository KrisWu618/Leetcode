public class DetectLinkedListCycle_142 {
/*
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 */
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x;next = null;}
		 }
	
	public ListNode detectCycle(ListNode head) {
		
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast) {
				ListNode slow2 = head;
				while(slow != slow2) {
					slow2 = slow2.next;
					slow = slow.next;
				}
				return slow;
			}
			
			
		}
		return null;
		
	}
	
}
