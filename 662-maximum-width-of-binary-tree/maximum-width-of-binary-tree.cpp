/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int widthOfBinaryTree(TreeNode* root) {
        if(root==NULL)return 0;
        queue<pair<TreeNode*,int>>pq;
        pq.push({root,1});
        int last=0;
        int ans=0;
        while(!pq.empty()){
            long long siz=pq.size();
            long long  min=pq.front().second;
            while(siz--){
                auto f=pq.front();
                pq.pop();
                TreeNode* p=f.first;
                long long x=f.second-min;
                if(siz==0)last=x;
                
                if(p->left)pq.push({p->left,2*x+1});
                if(p->right)pq.push({p->right,2*x+2});
            }
            ans=max(ans,last+1);
        }
        return ans;
    }
};