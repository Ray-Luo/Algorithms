public class TwoSum{
	public static void main(String[] args){
		
	}

	public static int[] solve1(int[] nums, int target){
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < nums.length; i++){
			map.put(nums[i], i);
		}

		int[] result = new int[2];
		for(int i = 0; i < result.length; i++){
			int complement = target - nums[i];
			if(map.containsKey(complement) && map.get(complement) != i){
				return new int[] {i, map.get(complement)};
			}
		}
	}

	public static int[] solve2(int[] nums, int target){
		HashMap<Integer, Integer> map = new HashMap<>();

		for(int i = 0; i < nums.length; i++){
			int complement = taget - nums[i];
			if(map.containsKey(complement)){
				return new int[] {map.get(complement), i};
			}
			map.put(nums[i], i);
		}
		return null;
	}
}
