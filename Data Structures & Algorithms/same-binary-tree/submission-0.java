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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(this.res==false){
            return false;
        }
        if(p==null && q==null){
            return this.res;
        }
        else{
            if((p!=null && q==null)||(p==null && q!=null)){
                this.res=false;
                return false;
            }
            else if(p.val!=q.val){
                this.res=false;
                return false;
            }
            else{
                this.res=isSameTree(p.left,q.left);
                this.res=isSameTree(p.right,q.right);
            }
        }
        return this.res;
    }
}
