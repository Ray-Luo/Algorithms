public class DFS{
	public static void main(String[] args){
		
	}

	public void pre(TreeNode root){
		if(root == null){
			return;
		}
		System.out.println(root.val);
		pre(root.left);
		pre(root.right);
	}

	public void in(TreeNode root){
		if(root == null){
			return;
		}
		in(root.left);
		System.out.println(root.val);
		pre(root.right);
	}

	public void post(TreeNode root){
		if(root == null){
			return;
		}
		post(root.left);
		post(root.right);
		System.out.println(root.val);

	}

}
