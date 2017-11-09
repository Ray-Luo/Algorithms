public class Permute{
	public static void main(String[] args){

	}

	public static List<List<Integer>> permute(int[] num){
		Array.sort(num);
		return permute(new ArrayList<Integer>(), num);
	}

	public List<List<Integer>> permute(List<Integer> cur, int[] num){
		List<List<Integer>> results = new ArrayList<ArrayList<Integer>>();

		if(cur.size() == num.length){
			results.add(new ArrayList<Integer>(cur));
			return results;
		}

		for(int i = 0; i < num.length; i++){
			if(cur.contains(num[i])){
				continue;
			}

			cur.add(num[i]);
			result.addAll(permute(cur,num));
			cur.remove(cur.size() - 1);
		}
		return results;
	}
}

