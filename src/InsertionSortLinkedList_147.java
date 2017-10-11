public class InsertionSortLinkedList_147 {
	
	/*
	 * Sort a linked list using insertion sort.
	 */
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x;}
		 }
	
	public ListNode insertionSortList(ListNode head) {
		ListNode curr = head, next = null;
		  // l is a fake head, use to save sorted list
		ListNode l = new ListNode(0);
		  
		while (curr != null) {
			next = curr.next;
			ListNode p = l; // p is copied sorted list 
			
			//use p to find the insertion index
			while (p.next != null && p.next.val < curr.val) {
				p = p.next;
			}
			    
		// insert curr between p and p.next
			curr.next = p.next; 
			p.next = curr; 
			curr = next;
		}
		return l.next;
	}
	

	public static void main(String[] args) {
	      ListNode head = new ListNode(2);
	      ListNode sec = new ListNode(4);
	      ListNode thr = new ListNode(3);
	      ListNode four = new ListNode(1);

	      
	      head.next = sec;
	      sec.next = thr;
	      thr.next = four;
	      
	      InsertionSortLinkedList_147 nl = new InsertionSortLinkedList_147();
	      ListNode sorted = nl.insertionSortList(head);
	      
  
	      
	      while(sorted != null){
	         System.out.println(sorted.val);
	         sorted = sorted.next;
	      }
	      
  }
}