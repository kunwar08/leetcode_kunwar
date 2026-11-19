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
    int height(TreeNode root){
        if(root==null)return 0;
        int lh=0;
        if(root.left!=null)lh=height(root.left);
        int rh=0;
        if(root.right!=null)rh=height(root.right);
        return 1+Math.max(lh,rh);
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null)return true;
        int lh=0;
        if(root.left!=null)lh=height(root.left);
        int rh=0;
        if(root.right!=null)rh=height(root.right);
        if(Math.abs(lh-rh)>=2)return false;
        return isBalanced(root.left)&&isBalanced(root.right);
    }
}