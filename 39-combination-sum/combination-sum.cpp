class Solution {
public:
    void solve(vector<int>& candidates,int i,int k,vector<int>& ans1,vector<vector<int>>& ans){
        if(k<0)return;
        if(k==0){
            ans.push_back(ans1);
            return;
        }
        for(int j=i;j<candidates.size();j++){
           ans1.push_back(candidates[j]);
           solve(candidates,j,k-candidates[j],ans1,ans);
           ans1.pop_back();
        }
        
    }
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        vector<int>ans1;
        vector<vector<int>>ans;
        solve(candidates,0,target,ans1,ans);
        return ans;
    }
};