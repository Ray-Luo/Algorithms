import java.util.ArrayList;
import java.util.List;

public class CombinationSum{
	public static void main(String[] args){
		int[] candidates = {1,2,3,4,5,6};
		int target = 6;
		System.out.println(combinationSum(candidates, target).toString());

	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target){
		List<List<Integer>> result = new ArrayList<>();

		solve(result, candidates, target, 0, new ArrayList<Integer>());
		return result;
	}

	public static void solve(List<List<Integer>> result, int[] candidates, int target, int index, List<Integer> item){
		if(target == 0){
			result.add(new ArrayList<Integer>(item));
		}
		
		for(int i = index; i < candidates.length; i++){
			if(candidates[i] <= target){
				item.add(candidates[i]);
				solve(result, candidates, target-candidates[i], i, item);
				item.remove(item.size() - 1);
			}
		}
	}

}
