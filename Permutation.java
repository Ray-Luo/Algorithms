import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Permutation{
	public static void main(String[] args){
		int[] nums = {1,1,2};
		Arrays.sort(nums);
		List<List<Integer>> results = new ArrayList<>();
		boolean[] visited = new boolean[nums.length];
		solve1(results, nums, new ArrayList<Integer>(), visited);
		for (List<Integer> items: results) {
		    System.out.print(items.toString());

		}
		
	}

	public static void solve1(List<List<Integer>> results, int[] nums, List<Integer> items, boolean[] visited){
	    if (items.size() == nums.length) {
	        results.add(new ArrayList<>(items));
		return;
	    }

	    for (int i = 0; i < nums.length; i++ ) {
	        if (visited[i]) {
		    continue;
		}
		if (i > 0 && nums[i] == nums[i-1]) {
		    continue;
		}
		items.add(nums[i]);
		visited[i] = true;
		solve1(results,nums,items, visited);
		items.remove(items.size() - 1);
		visited[i] = false;
	    }
	}

}

