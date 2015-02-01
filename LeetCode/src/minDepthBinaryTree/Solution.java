package minDepthBinaryTree;


class TreeNode{
	TreeNode left;
	TreeNode right;
	int val;
	TreeNode(int x){
		val=x;
	}
}

public class Solution {
	public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        
        if(root.left!=null && root.right!=null ){
            return 1+Math.min(minDepth(root.left), minDepth(root.right));
        }else if(root.left==null){
            return 1+minDepth(root.right);
        }else{
            return 1+minDepth(root.left);
        }
    }
}
