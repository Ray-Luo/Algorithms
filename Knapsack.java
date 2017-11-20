public class Knapsack{
    public static void main(String[] args){
         int[] weight = {1,2,3,4,5};
	 if(knapsack(weight, 6, 0)){
	 	System.out.println("Good");
	 }
    }

    public static boolean knapsack(int[] weight, int target, int index){
    	if(target == 0){
		return true;
	}
	
	if(target < 0 || index >= weight.length){
		return false;
	}
	

	return knapsack(weight, target, index+1) || knapsack(weight, target - weight[index], index+1);

    }

    // TODO: need to think how to use for-loop to implement
    public static boolean solve2(int[] weight, int target){
    	if(target == 0){
		return true;
	}
	
	if(target < 0 || index >= weight.length){
		return false;
	}

	boolean result = false;
	for(int i = 0; i < weight.length; i++){
		result += solve2(weight, target-weight[i])
	}

    }

}
