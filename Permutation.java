public class Permutation{
	public static void main(String[] args){

	}

	public static List<List<Integer>> permutation(int[] nums){
		List<Integer> numList = new ArrayList<Integer>();
		Array.sort(num);
		for(int i = 0; i < nums.length; i++){
			numList.add(num[i]);
		}
		return permute(new ArrayList<Integer>(), numList);
	}

	public List<List<Integer>> permute(List<Integer> cur, List<Integer> num){
		List<List<Integer>> results = new ArrayList<ArrayList<Integer>>();

		if(num.size() == 0){
			results.add(cur);
			return results;
		}

		for(int i = 0; i < num.size(); i++){
			ArrayList<Integer> newCur = new ArrayList<Integer>(cur);
			newCur.add(num.get(i));
			ArrayList<Integer> newNum = new ArrayList<Integer>(num);
			newNum.remove(i);
			results.addAll(permute(newCur, newNum));
		}
		return results;
	}
}

