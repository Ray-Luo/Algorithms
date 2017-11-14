public class PracticeRecursion{
	public static void main(String[] args){
		//System.out.println(climb2(3));
		hanoi2(3, "A", "B", "C");
	}

	public static int factorial(int n){
		if(n == 1){
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static int fibonacci(int n){
		if(n == 1){
			return 1;
		}
		if(n == 2){
			return 2;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}

	public static int climb(int n){
		if(n == 1){
			return 1;
		}
		if(n == 2){
			return 2;
		}
		return climb(n-1) + climb(n-2);
	}

	public static void climb2(int n, String pre){
		if(n == 1){
			System.out.println(pre + " 1");
			return;
		}
		if(n == 2){
			System.out.println(pre +" 1 1");
			System.out.println(pre + " 2");
			return;
		}
		String way1 = pre + " 1";
		climb2(n-1, way1);

		String way2 = pre + " 2";
		climb2(n-2, way2);
	}

	public static int hanoi(int n){
		if(n == 1){
			return 1;
		}
		return hanoi(n-1) + 1 + hanoi(n-1);
	}

	public static void hanoi2(int n, String source, String extra, String target){
		if(n == 1){
			System.out.println("Move 1 from " + source + " to " + target);
			return;
		}
		
		hanoi2(n-1, source, target, extra);
		System.out.println("Move 1 from " + source + " to " + target);
		hanoi2(n-1, extra, source, target);
	}

	public static int sumOfLinkedList(ListNode head){
		if(head == null){
			return 0;
		}

		return head.val + sumOfLinkedList(head.next);
	}

	public static ListNode removeNodes(ListNode head, int val){
		if(head == null){
			return null;
		}

		ListNode newHead = removeNodes(head.next, val);
		if(head.val == val){
			return newHead;
		}else{
			head.next = newHead;
			return head;
		}
	}

	
}

