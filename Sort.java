public class Sort{
	public static void main(String[] args){
		int[] a = {3,4,2,1,5};
		quick(a, 0, a.length - 1);
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}

	public static void quick(int[] num, int begin, int end){
		if(begin >= end){
			return;
		}
		int pivot = helper(num, begin, end);
		quick(num, begin, pivot - 1);
		quick(num, pivot + 1, end);
		
	}

	public static int helper(int[] num, int begin, int end){
		int start = begin;
		int pivot = num[begin];

		while(begin < end)
		{
			while(begin < end && pivot <= num[end]){
				end--;
			}

			//num[begin] = num[end];

			while(begin < end && pivot >= num[begin]){
				//System.out.println(begin);
				begin++;
			}
			//num[end] = num[begin];	
			

			//System.out.println(Integer.toString(begin) + " " +Integer.toString(end));
			swap(num, begin, end);

			if(begin < end){
				begin++;
				end--;

			}
						
		}
		swap(num, start, begin);
	//	num[begin] = pivot;
		return begin;
	}

	public static void swap(int[] num, int begin, int end){
		int tmp = num[end];
		num[end] = num[begin];
		num[begin] = tmp;
	}
	
}
