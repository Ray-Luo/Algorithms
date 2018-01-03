public class Sort {
	public static void main(String[] args) {
	    int[] nums = {9, 8 ,7, 6, 5, 4, 3, 2, 1, 0};
	    quickSort(nums);
	    for (int i : nums) {
	        System.out.println(i);
	    }
	    //System.out.println(nums.toString());
	}

	public static void bubbleSort(int[] nums) {
	    for (int i = 0; i < nums.length; i++) {
		for (int j = 0; j < nums.length - 1; j++) {
		    if (nums[j] > nums[j+1]) {
		        swap(nums, j, j + 1);
		    }
		}	   
	    }
	}

	public static void insertSort(int[] nums) {
            boolean swapped = false;
	    for (int i = 0; i < nums.length - 1; i++) {
	        for (int j = i + 1; j > 0; j--) {
		    if (nums[j] < nums[j-1]) {
		        swap(nums, j, j - 1);
			swapped = true;
		     }
		}
		if (!swapped) {
		    return;
		}
	    }
	}

	public static void selectionSort(int[] nums) {
	    for (int i = 0; i < nums.length; i++) {
		int min = nums[i];
		int minIndex = i;
	        for (int j = i; j < nums.length; j++) {
		    if (min > nums[j]) {
			    minIndex = j;
			    min = nums[j];
		    }
		}
		swap(nums, i, minIndex);
	    }
	}

	public static void mergeSort(int[] nums) {
	    solveMergeSort(nums, 0, nums.length - 1);
	}

	public static void solveMergeSort(int[] nums, int start, int end) {
	    if (start < end) {
	        int mid = start + (end - start)/2;
		solveMergeSort(nums, start, mid);
		solveMergeSort(nums, mid + 1, end);
		merge(nums, start, mid, end);
	    }
	}

	public static void merge(int[] nums, int start, int mid, int end) {
	    int k = start;
	    int i = start;
	    int j = mid + 1;
	    int[] helper = new int[nums.length]; 
	    for (int m = start; m <= end; m++) {
	        helper[m] = nums[m];
	    }
	    while (i <= mid && j <= end) {
	        if (helper[i] < helper[j]) {
		    nums[k++] = helper[i++];
		} else {
		    nums[k++] = helper[j++];
		}
	    }
	    while (i <= mid) {
	        nums[k++] = helper[i++];
	    }
	    while (j <= end) {
	        nums[k++] = helper[j++];
	    }
	}

	public static void quickSort(int[] nums) {
	    
	    quickSort(nums, 0, nums.length - 1);
	    
	}

	public static void quickSort(int[] nums, int start, int end) {
	     if (start < end) {
	         int pivot = partition(nums, start, end);
                 quickSort(nums, start, pivot - 1);
		 quickSort(nums, pivot + 1, end);
	     }

	}

	public static int partition(int[] nums, int start, int end) {
	    int tmp = nums[start];
	    while (start < end) {
	        while (start < end && nums[end] >= tmp) {
		    end--;
		}
		nums[start] = nums[end];
		while (start < end && nums[start] <= tmp) {
		    start++;
		}
		nums[end] = nums[start];
	    }
	    nums[start] = tmp;
	    return start;
	}

	public static void swap(int[] nums, int i, int j) {
	    int temp = nums[i];
	    nums[i] = nums[j];
	    nums[j] = temp;
	}
}
