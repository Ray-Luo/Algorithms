package Tree;
import Tree.TreeNode;
import java.util.Queue;
import java.util.LinkedList;
import java.lang.Math;



public class MaximumDepth{
	public static void main(String[] args){
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.left.left = new TreeNode();
		root.left.right = new TreeNode();
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		System.out.println(solve1(root));

	}

	public static int solve1(TreeNode root){
		if(root == null){
			return 0;
		}else{
			return Math.max(solve1(root.left), solve1(root.right)) + 1;
		}
	}

	public static int min(TreeNode root){
		if(root == null){
			return 0;
		}

		if(root.left == null && root.right == null){
			return 1;
		}

		if(root.left == null && root.right != null){
			return min(root.right) + 1;
		}

		if(root.left != null && root.right == null){
			return min(root.left) + 1;
		}

		if(root.left != null && root.right != null){
			return Math.min(min(root.left), min(root.right)) + 1;
		}
	}

	public static int minBinary(TreeNode root){
		if(root == null){
			return 0;
		}

		int level = 1;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);

		while(!queue.isEmpty()){
			Queue<TreeNode> queue2 = new LinkedList<>();
			while(!queue2.isEmpty()){
				TreeNode newRoot = queue.poll();
				if(newRoot.left != null){
					queue2.offer(newRoot.left);
				}
				if(newRoot.right != null){
					queue2.offer(newRoot.right);
				}
				if(newRoot.right == null && newRoot.left == null){
					return level;
				}
				
			}
			level++;
			queue = queue2;
		}
		return level;

	}

	public static boolean same(TreeNode root1, TreeNode root2)
		if(root1 == null && root2 != null){
			return false;
		}
		if(root1 != null && root2 == null){
			return false;
		}
		if(root1 == null && root2 == null){
			return true;
		}

		if(root1.val != root2.val){
			return false;	
		}

		return same(root1.left, root2.left) && same(root1.right, root2.right);
	}

	public static boolean symmetric(TreeNode root){
		if(root == null){
			return true;
		}
		return symHelper(root.left, root.right);
	}

	public static boolean symHelper(TreeNode root1, TreeNode root2){
		if(root1 == null && root2 == null){
			return true;
		}else if(root1 == null || root2 == null){
			return false;
		}

		return root.val1 == root2.val && same(root1.left, root2.right) && same(root1.rigth, root2.left);

	}

	public static boolean pathSum(TreeNode root, int target){
		if(root == null){
			return false;
		}

		if(root.left == null && root.right == null){
			if(root.val == target){
				return true;
			}
			return false;
		}

		return pathSum(root.left, target - root.val) || pathSum(root.right, target - root.val); 
	}

	public static Liss<List<Integer>> path2(TreeNode root, int sum){
		if(root == null){
			return false;
		}

		List<List<Integer>> result = new ArrayList<>();
		solvePath(result, new ArrayList<Integer>(), root, sum);
		return result;
	}

	public static void solvePath(List<List<Integer>> result, List<Integer> items, TreeNode root, int sum){
		if(sum == 0){
			result.add(new ArrayList<Integer>(items));
			return;
		}
		
		if(root == null || root.val > sum){
			return;
		}

		while(root != null){
			if(root.val <= sum){
				items.add(root.val);
				solvePath(result, items, root.left, sum - root.val);
				solvePath(result, items, root.right, sum - root.val);
				items.remove(items.size() - 1);
			}
		}
	}


}




