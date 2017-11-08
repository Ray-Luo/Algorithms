public class ReverseLinkedList{
    public static void main(){
                
    }

    public static ListNode reverse(ListNode head){
        if(head == null){
		return null;
	}

	ListNode newHead = reverse(head.next);
	head.next.next = head;
	head.next = null;
	return newHead;
    }
}
