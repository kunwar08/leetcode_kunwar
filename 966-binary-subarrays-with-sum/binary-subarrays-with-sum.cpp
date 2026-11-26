class Solution {
public:
    int numSubarraysWithSum(vector<int>& nums, int goal) {
        map<int,int>mp;
        int sum=0;
        int ans=0;
        for(int i=0;i<nums.size();i++){
            sum+=nums[i];
            if(sum==goal){
                ans++;
            }
            int rem=sum-goal;
            ans+=mp[rem];
            mp[sum]++;
        }
        return ans;
    }
};