public class ClimbStairs{
    public static void main(String[] args){
        System.out.println(climb(10));
	printWays(10, "");
    }

    public static int climb(int n){
        if(n <= 2){
	    return n;
	}

	return climb(n-1) + climb(n-2);
    }

    public static void printWays(int n, String pre){
        if(n == 1){
	    System.out.println(pre + " 1");
	    return;
	}

	if (n == 2){
	    System.out.println(pre + " 2");
	    System.out.println(pre + " 1 1");
	    return;
	}

	String pre1 = pre + " 1";
	printWays(n-1, pre1);
	String pre2 = pre + " 2";
	printWays(n-2, pre2);
    }
}
