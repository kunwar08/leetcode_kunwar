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
    void solve(TreeNode root,ArrayList<Integer> ans){
        if(root==null)return;

        if(root.left!=null)solve(root.left,ans);
        ans.add(root.val);
        if(root.right!=null)solve(root.right,ans);

    }
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer>ans = new ArrayList<>();
        solve(root,ans);

        for(int i=1;i<ans.size();i++){
            if(ans.get(i-1)>=ans.get(i))return false;
        }

        return true;
    }
}