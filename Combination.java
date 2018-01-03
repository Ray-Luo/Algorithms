import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Combination{
	public static void main(String[] args){
		int[] nums = {1, 2, 2, 3, 3};
		int target = 6;
		Arrays.sort(nums);
		List<List<Integer>> results = new ArrayList<>();
		solve3(results, nums, new ArrayList<Integer>(), 0);
		System.out.println(results.toString());

	}
	
	public static void solve1(List<List<Integer>> result, int[] num, List<Integer> item, int index){
		if(index == num.length){
			result.add(new ArrayList<Integer>(item));
			return;
		}
		item.add(num[index]);
		solve1(result, num, item, index + 1);
		item.remove(item.size() - 1);

		solve1(result, num, item, index + 1);
	}

	public static void solve2(List<List<Integer>> result, int[] num, List<Integer> item, int index){
		if(index == num.length){
			result.add(new ArrayList<Integer>(item));
			return;
		}
			
		for(int i = index; i < num.length; i++){
			item.add(num[i]);
			solve2(result, num, item, i + 1);
			item.remove(item.size() - 1);
		}

		solve2(result, num, item, num.length);
	}

	public static void solve3(List<List<Integer>> results, int[] nums, List<Integer> items, int index) {
	    if (index == nums.length) {
	        results.add(new ArrayList<>(items));
		return;
	    }
	    for (int i = index; i < nums.length; i++) {
	        if (i > index && nums[i] == nums[i-1]) {
		    continue;
		}
		items.add(nums[i]);
		solve3(results, nums, items, i + 1);
		items.remove(items.size() - 1);
	    }
            solve3(results, nums, items, nums.length);
	}

	

}
