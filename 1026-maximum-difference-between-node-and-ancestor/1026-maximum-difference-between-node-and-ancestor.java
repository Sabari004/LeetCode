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
    int max=0;
    public  void solve(TreeNode root,int up,int down){
        if(root==null) return;
        max=(max<Math.abs(up-root.val))?Math.abs(up-root.val):max;
        max=(max<Math.abs(down-root.val))?Math.abs(down-root.val):max;
        if(root.val>up){
            up=root.val;
        }
        else if(root.val<down){
            down=root.val;
        }
        solve(root.right,up,down);
        solve(root.left,up,down);
        
        
    }
    public int maxAncestorDiff(TreeNode root) {
        solve(root,root.val,root.val);
        return max;
    }
}