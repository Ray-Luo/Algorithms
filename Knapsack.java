public class Knapsack{
    public static void main(String[] args){
         
    }

    public static boolean knapsack(int[] input, int total, int index){
        if(total == 0){
	    return true;
	}

	if(total < 0 || index >= input.length){
	    return false;
	}

	return knapsack(input, total - input[index], index+1) || knapsack(input, total, index+1);
    }
}
