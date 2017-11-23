import java.util.List;
import java.util.ArrayList;

public class Knapsack{
    public static void main(String[] args){
         int[] weight = {1,2,3,4,5};
	 //if(solve3(weight, 6, 0)){
	 //	System.out.println("Good");
	// }
	 int target = 6;
	 List<List<Integer>> result = new ArrayList<>();
	 solve3(result, new ArrayList<Integer>(), weight, target, 0);
	 System.out.println(result.toString());
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

        
    public static boolean solve2(int[] weight, int target, int index){
    	if(target == 0){
		return true;
	}

	if(target < 0 || index > weight.length){
		return false;
	}

	for(int i = index; i < weight.length; i++){
		return solve2(weight, target - weight[i], i + 1) || solve2(weight, target, i + 1);
	}

	return solve2(weight, target, weight.length);
    }

    public static void solve3(List<List<Integer>> result, List<Integer> item, int[] weight, int target, int index){
    	if(target == 0){
		result.add(new ArrayList<Integer>(item));
		return;
	}

	if(target < 0 || index >=  weight.length){
		return;
	}

	for(int i = index; i < weight.length; i++){
		if(weight[i] <= target){
			item.add(weight[i]);
			solve3(result, item, weight, target - weight[i], i + 1);
			item.remove(item.size() - 1);
		}
	}
	solve3(result, item, weight, target, weight.length);
    }
    
    public static void solve4(List<List<Integer>> result, List<Integer> item, int[] weight, int target, int index){
    	if(target == 0){
		result.add(new ArrayList<Integer>(item));
		return;
	}

	if(target < 0 || index >= weight.length){
		return;
	}

	item.add(weight[index]);
	solve4(result, item, weight, target - weight[index], index + 1);
	item.remove(item.size() - 1);

	solve4(result, item, weight, target, index + 1);
    }


}
