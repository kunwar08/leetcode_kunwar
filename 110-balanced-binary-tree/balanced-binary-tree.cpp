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
    int height(TreeNode* root){
        if(root==NULL)return 0;
        int lh=0;
        if(root->left)lh=height(root->left);
        int rh=0;
        if(root->right)rh=height(root->right);
        return 1+max(lh,rh);
    }
    
    bool isBalanced(TreeNode* root) {
        if(root==NULL)return true;
        int lh=0;
        if(root->left)lh=height(root->left);
        int rh=0;
        if(root->right)rh=height(root->right);
        if(abs(lh-rh)>=2)return false;
        return isBalanced(root->left)&&isBalanced(root->right);
    }
};