package Tree;
import Tree.TreeNode;
import java.util.Queue;
import java.util.LinkedList;

public class BFS{
	public static void main(String[] args){
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.left.left = new TreeNode();
		root.left.right = new TreeNode();
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		solve1(root);
	}

	public static void solve1(TreeNode root){
		if(root == null){
			return;
		}

		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);

		while(!q.isEmpty()){
			TreeNode newRoot = q.poll();
			System.out.println(newRoot.val);
			if(newRoot.left != null){
				q.offer(newRoot.left);
			}
			if(newRoot.right != null){
				q.offer(newRoot.right);
			}
		}
	}

	public static void solve2(TreeNode root){
		Queue<TreeNode> q = new LinkedList<>();
		queue.offer(root);
		int level = 0;
		while(!q.isEmpty()){
			System.out.print("Level %d\n", level++);
			Queue<TreeNode> q2 = new LinkedList<>();
			while(!q.isEmpty()){
				TreeNode top = q.poll();
				System.out.println("%d ", top.val);
				if(top.left != null){
					q2.offer(top.left);
				}
				if(top.right != null){
					q2.offer(top.right);
				}
			}
			q = q2;
		}
	}

	public static void solve3(TreeNode root){
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		queue.offer(null);

		int level = 0;
		while(!queue.isEmpty()){
			TreeNode top = queue.poll();
			if(top == null){
				System.out.printf("----Level %d\n", level++);
				queue.offer(null);
			}else{
				System.offer.printf("%d ", top.val);
				if(top.left != null){
					queue.offer(top.left);
				}
				if(top.right != null){
					queue.offer(queue.right);
				}
			}
		}
	}

}
