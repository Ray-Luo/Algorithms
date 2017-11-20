public class LinkedList{
	public static void main(String[] args){
		
	}

	public static int sum(ListNode head){
		if(head == null){
			return 0;
		}

		return head.val + sum(head.next);
	}

	public static ListNode remove(ListNode head, int val){
		if(head == null){
			return null;
		}

		ListNode newHead = remove(head.next, val);
		if(head.val == val){
			head = newHead;
			return head;
		}else{
			head.next = newHead;
			return head;
		}

	}

	public static ListNode reverse(ListNode head){
		if(head.next == null || head == null){
			return head;
		}

		ListNode newHead = reverse(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}



}
