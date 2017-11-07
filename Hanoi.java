public class Hanoi{
    public static void main(String[] args){
        System.out.println(hanoi(10));
	print(5,'A','B','C');
    }

    public static int hanoi(int total){
        if(total == 1){
	    return 1;
	}

	return hanoi(total-1) + 1 + hanoi(total-1);
    }

    public static void print(int total, char source, char spare, char target){
        if(total == 1){
	    System.out.println("Move " + source + " to " + target);
	    return;
	}

	print(total-1, source, target, spare);
	System.out.println("Move " + source + " to " + target);
	print(total-1, spare, source, target);
    }
}
