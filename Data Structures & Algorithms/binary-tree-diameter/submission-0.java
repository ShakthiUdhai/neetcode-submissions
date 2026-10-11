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
    int res=Integer.MIN_VALUE;
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
        this.res=Math.max(this.res,(left+right));
        return Math.max(left,right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        this.findHeight(root);
        return this.res;
    }
}
