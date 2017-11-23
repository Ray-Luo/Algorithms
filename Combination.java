import java.util.List;
import java.util.ArrayList;

public class Combination{
	public static void main(String[] args){
		int[] num = {1, 2, 3};
		List<List<Integer>> result = new ArrayList<>();
		solve2(result, num, new ArrayList<Integer>(), 0);
		System.out.println(result.toString());

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

	

}
