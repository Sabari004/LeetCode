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
    public void solve(TreeNode root,int low,int high){
        if(root==null) return;
        solve(root.left,low,high);
        if(root.val>=low&&root.val<=high)c+=root.val;
        // else return;
        solve(root.right,low,high);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        solve(root,low,high);
        return c;
    }
}