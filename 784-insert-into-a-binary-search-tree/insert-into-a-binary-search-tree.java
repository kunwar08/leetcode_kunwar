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
    public TreeNode insertIntoBST(TreeNode root, int val) {
       TreeNode temp=new TreeNode(val);
       if(root==null)return temp;
       TreeNode curr=root;
       TreeNode past=curr;
       while(curr!=null){
        if(curr.val>val){
            past=curr;
            curr=curr.left;
        }
        else if(curr.val<val){
            past=curr;
            curr=curr.right;
        }
       } 
       if(past.val>val)past.left=temp;
       else past.right=temp;
       return root;
    }
}