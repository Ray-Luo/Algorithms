import java.util.List;
import java.util.ArrayList;

public class Permutation{
	public static void main(String[] args){
		int[] num = {1, 2, 3};
		List<List<Integer>> result = new ArrayList<>();
		solve1(result, num, new ArrayList<Integer>(), 0);
		System.out.print(result.toString());
	}

	public static void solve1(List<List<Integer>> result, int[] num, List<Integer> item, int index){
		if(item.size() == num.length){
			result.add(new ArrayList<>(item));
			return;
		}

		for(int i = 0; i < num.length; i++){
			if(item.contains(num[i])){
				continue;
			}else{
				item.add(num[i]);
				solve1(result, num, item, i + 1);
				item.remove(item.size() - 1);
			}

		}
		return;
	}

}

