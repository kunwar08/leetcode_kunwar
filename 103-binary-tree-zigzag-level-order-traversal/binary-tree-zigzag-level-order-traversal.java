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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        if(root==null)return ans;
        Queue<TreeNode>pq =new LinkedList<>();
        pq.offer(root);
        int i=0;
        while(!pq.isEmpty()){
            int siz=pq.size();
            List<Integer>ans1 = new ArrayList<>();
            while(siz-->0){
                 TreeNode f=pq.poll();
                 
                 ans1.add(f.val);
                 if(f.left!=null)pq.offer(f.left);
                 if(f.right!=null)pq.offer(f.right);
            }
            if(i%2==1){
                Collections.reverse(ans1);
            }
            ans.add(ans1);
            i++;
        }
        return ans;
    }
}