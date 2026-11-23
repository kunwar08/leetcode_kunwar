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
 class NodeInfo{
    int x;
    TreeNode p;
    NodeInfo(TreeNode p,int x){
        this.x=x;
        this.p=p;
    }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
        Queue<NodeInfo>pq = new LinkedList<>();
        pq.offer(new NodeInfo(root,1));
        int last=0;
        int ans=0;
        while(!pq.isEmpty()){
            int siz=pq.size();
            int  min=pq.peek().x;
            while(siz-->0){
                NodeInfo f=pq.peek();
                pq.poll();
                TreeNode p=f.p;
                int x=f.x-min;
                if(siz==0)last=x;
                
                if(p.left!=null)pq.offer(new NodeInfo(p.left,2*x+1));
                if(p.right!=null)pq.offer(new NodeInfo(p.right,2*x+2));
            }
            ans=Math.max(ans,last+1);
        }
        return ans;
    }
}