class Solution {
public:
    void solve(vector<int>& cand,int k,int i,vector<int>& ans1,vector<vector<int>>&ans){
        if(k==0){
            ans.push_back(ans1);
            return;
        }
        if(i==cand.size()||k<0)return;
        

        for(int j=i;j<cand.size();j++){
            if(i!=j&&cand[j]==cand[j-1])continue;
           ans1.push_back(cand[j]);
           solve(cand,k-cand[j],j+1,ans1,ans);
           ans1.pop_back();
        }
    }
    vector<vector<int>> combinationSum2(vector<int>& candidates, int target) {
        sort(candidates.begin(),candidates.end());
        vector<int>ans1;
        vector<vector<int>>ans;
        solve(candidates,target,0,ans1,ans);
        return ans;
    }
};