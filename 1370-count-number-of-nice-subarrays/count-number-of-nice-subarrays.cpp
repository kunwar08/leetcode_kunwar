class Solution {
public:
    int solve(vector<int>& nums,int k){
        int l=0;
        int r=0;
        int cnt=0;
        int ans=0;
        while(r<nums.size()){
              if(nums[r]%2==1)cnt++;
              while(l<=r&&cnt>k){
                if(nums[l]%2)cnt--;
                l++;
              }
              ans+=r-l+1;
              r++;

        }
        return ans;
    }
    int numberOfSubarrays(vector<int>& nums, int k) {
        return solve(nums,k)-solve(nums,k-1);
        
    }
};