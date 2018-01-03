import java.util.List;
import java.util.ArrayList;

public class Knapsack{
    public static void main(String[] args){
         int[] nums = {1,2,3,4,5};
	 int target = 6;
	 //boolean result = exist(nums, target, 0);
	 List<List<Integer>> results = new ArrayList<>();
	 solve(results, new ArrayList<Integer>(), nums, target, 0);
	 for (List<Integer> items : results) {
	     System.out.println(items.toString());
	 }
	 
    }

    public static boolean exist(int[] nums, int target, int index) {
    	 if (target == 0) {
	     return true;
	 }
	 if (index == nums.length || target < 0) {
	     return false;
	 }
	 return exist(nums, target - nums[index], index++) || exist(nums, target, index++);
    }

    public static void solve(List<List<Integer>> results, List<Integer> items, int[] nums, int target, int i) {
        if (target == 0) {
	    results.add(new ArrayList<>(items));
	    return;
	}
	if (target < 0 || i == nums.length) {
	    return;
	}
	
	items.add(nums[i]);
        solve(results, items, nums, target - nums[i], i + 1);
	items.remove(items.size() - 1);
	solve(results, items, nums, target, i + 1);	
    }        
    
       

}
