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
    vector<vector<int>> zigzagLevelOrder(TreeNode* root) {
        vector<vector<int>>ans;
        if(root==NULL)return ans;
        queue<TreeNode*>pq;
        pq.push(root);
        int i=0;
        while(!pq.empty()){
            int siz=pq.size();
            vector<int>ans1;
            while(siz--){
                 TreeNode* f=pq.front();
                 pq.pop();
                 ans1.push_back(f->val);
                 if(f->left)pq.push(f->left);
                 if(f->right)pq.push(f->right);
            }
            if(i%2){
                reverse(ans1.begin(),ans1.end());
            }
            ans.push_back(ans1);
            i++;
        }
        return ans;
    } 
};