class Solution {
public:
    void solve(vector<int>& cand,int k,int i,vector<int>& ans1,vector<vector<int>>&ans){
        if(k==0){
            ans.push_back(ans1);
            return;
        }
        if(i>cand.size()||k<0)return;
        for(int j=i;j<cand.size();j++){
            ans1.push_back(cand[j]);
            solve(cand,k-cand[j],j,ans1,ans);
            ans1.pop_back();
        }
        

    }
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        vector<int>ans1;
        vector<vector<int>>ans;
        solve(candidates,target,0,ans1,ans);
        return ans;
    }
};