/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int c=0;
    public TreeNode  solve(TreeNode root,int []preorder,int min,int max){
        TreeNode nn=new TreeNode(preorder[c++]);
        
        if(c<preorder.length&&nn.val>preorder[c]&&preorder[c]>min&&preorder[c]<max){
            nn.left=solve(nn.left,preorder,min,nn.val);
        }
         if(c<preorder.length&&nn.val<preorder[c]&&preorder[c]>min&&preorder[c]<max)  nn.right=solve(nn.right,preorder,nn.val,max);
        return nn;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=null;
        root=solve(root,preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
        return root;
        
    }
}