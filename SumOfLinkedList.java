public class SumOfLinkedList{
    public static void main(String[] args){
        
    }

    public static int sum(ListNode head){
        if(head == null){
	    return 0;
	}

	return head.val + sum(head.next);
    }
}
