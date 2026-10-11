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
    int gNodes=0;
    public void dfs(TreeNode root, int maxSoFar){
        if(root.val>=maxSoFar){
            this.gNodes+=1;
            maxSoFar=root.val;
        }
        if(root.left!=null){
            this.dfs(root.left,maxSoFar);
        }
        if(root.right!=null){
            this.dfs(root.right,maxSoFar);
        }
    }
    public int goodNodes(TreeNode root) {
        this.dfs(root,root.val);
        return this.gNodes;
    }
}
