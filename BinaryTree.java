public class BinaryTree{
	public static void main(String[] args){
		
	}

	public static boolean find(TreeNode root, int target){
		if(root == null){
			return false;
		}

		if(root.val == target){
			return true;
		}

		target > root.val ? find(root.right, target) : find(root.left, target);	
	}

	public static boolean add(TreeNode root, int target){
		if(root == null){
			root = new TreeNode(target);
			return true;
		}
		TreeNode cur = root;
		while(cur != null){
			if(cur.val == target){
				return false;
			}
			if(target < cur.val){
				if(cur.left != null){
					cur = cur.left;
				}else{
					cur.left = new TreeNode(target);
					return true;
				}
			}else{
				if(cur.right != null){
					cur = cur.right;
				}else{
					cur.right = new TreeNode(target);
					return true;
				}
			}
		}
		return false;
	}

	public static boolean remove(TreeNode root, int target){
		if(root == null){
			return false;
		}


	}
}
