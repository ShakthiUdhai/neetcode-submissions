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
    boolean res=true;
    public int findHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=0,right=0;
        if(root.left!=null){
            left=1+(this.findHeight(root.left));
        }
        if(root.right!=null){
            right=1+(this.findHeight(root.right));
        }
        if(Math.abs(left-right)>1){
            this.res=false;
        }
        return Math.max(left,right);
    }
    public boolean isBalanced(TreeNode root) {
        this.findHeight(root);
        return this.res;
    }
}
