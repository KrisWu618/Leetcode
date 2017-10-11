

public class IntersectionTwoLinkedLists_160 {
	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; next = null;}
	 }
	
	
	public ListNode intersection(ListNode headA, ListNode headB) {
		if(headA == null || headB == null) return null;
		ListNode a = headA;
		ListNode b = headB;
		
		//for the end of first iteration, we just reset the pointer to the head of another linkedlist
		while(a != b) {
			a = a == null ? headB : a.next;
			b = b == null ? headA : b.next;
		}
		return a;
		
	}
}
