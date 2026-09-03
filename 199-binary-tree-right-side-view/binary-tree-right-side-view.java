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
    public List<Integer> rightSideView(TreeNode root) {
    Queue<TreeNode>qp=new LinkedList<>();
    List<Integer> ans =new ArrayList<>();
    if(root==null)return ans;
    qp.offer(root);
    while(!qp.isEmpty()){
        int siz=qp.size();
        while(siz-->0){
            TreeNode f=qp.poll();
            if(siz==0)ans.add(f.val);
            if(f.left!=null)qp.offer(f.left);
            if(f.right!=null)qp.offer(f.right);

        }
    }
    return ans;
    }
}