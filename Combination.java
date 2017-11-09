public class Combination{
	public static void main(String[] args){
		
	}

	public List<List<Integer>> combination(int[] nums){
		List<List<Integer>> results = new ArrayList<>();
		combine(results, nums, 0 , new ArrayList<Integer>());
		return results;
	}

	public void combine(List<List<Integer>> results, int[] nums, int index, ArrayList<Integer> items){
		if(index == nums.length){
			results.add(items);
			return;
		}

		ArrayList<Integer> newItems1 = new ArrayList<Integer>(items);
		combine(results, nums, index + 1, newItems1);

		ArrayList<Integer> newItems2 = new ArrayList<Integer>(items);
		newItems.add(nums[index]);
		combine(results, nums, index + 1, newItems2);
	}

	public List<List<Integer>> combine2(int[] nums){
		List<List<Integer>> results = new ArrayList<>();
		combination2(results, nums, 0, new ArrayList<Integer>());
		return results;
	}

	public void combination2(List<List<Integer>> results, int[] nums, int index, ArrayList<Integer> items){
		if(index == nums.length){
			results.add(new ArrayList<Integer>(items));
			return;
		}
		
		combination2(results, nums, index + 1, items);

		items.add(nums[index]);
		combination2(results, nums, index + 1, items);
		items.remove(items.size() - 1);

	}

	public void combination2(List<List<Integer>> results, int[] nums, int index, ArrayList<Integer> items){
		if(index == nums.length){
			results.add(new ArrayList<Integer>(items));
			return;
		}
		for(int i = index; i < nums.length; i++){
			items.add(nums[i]);
			combination2(results, nums, i + 1, items);
			items.remove(items.size() - 1);

		}	
		combination(results, nums, nums.length, items);
		
	}
}
