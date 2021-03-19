class Solution {
    ListNode revLinkedList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        
        ListNode previous = head;
        ListNode current = head.next, next = null;
        head.next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        
        return previous;
    }
  
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1)
            return head;

        ListNode sentinel = new ListNode();
        sentinel.next = head;
        ListNode curSentinel = sentinel;
        while (curSentinel != null) {
            int ctr = 0;        
            ListNode ptr = curSentinel;        
            while (ptr != null && ctr < k) {
                ++ctr;
                ptr = ptr.next;
            }           
            if (ptr == null) {
                break;
            }
                        
            ListNode first = curSentinel.next; 
	    ListNode last = ptr, nextPtr = last.next;          
            last.next = null;           
            curSentinel.next = revLinkedList(curSentinel.next);
            first.next = nextPtr;
            curSentinel = first;
            
        }
        
        return sentinel.next;
    }
}