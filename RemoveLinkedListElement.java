public class RemoveLinkedListElement{
    public static void main(String[] agrs){
       
    }

    public static ListNode remove(int val, ListNode head){
        if(head == null){
	    return null;
	}

	ListNode newHead = remove(val, head.next);
	if(head.val == val){
	    return newHead;
	}else{
	    head.next = newHead;
	    return head;
	}



	    
    }
}
