class Solution {
public:
    void solve(vector<int>& nums,int i,vector<int>&ans1,vector<vector<int>>&ans){
        ans.push_back(ans1);
        if(i==nums.size())return ;
        

        for(int j=i;j<nums.size();j++){
            ans1.push_back(nums[j]);
            solve(nums,j+1,ans1,ans);
            ans1.pop_back();
        }

    }
    vector<vector<int>> subsets(vector<int>& nums) {
        vector<int>ans1;
        vector<vector<int>>ans;
        solve(nums,0,ans1,ans);
        return ans;
    }
};