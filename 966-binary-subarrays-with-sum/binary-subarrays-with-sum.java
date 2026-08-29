class Solution {
    public int solve(int[] nums,int k){
        int l=0;
        int r=0;
        int n=nums.length;
        int ans=0;
        int sum=0;
        while(r<n){
            sum+=nums[r];
            while(l<=r&&sum>k){
                sum-=nums[l];
                l=l+1;
            }
            ans+=(r-l+1);
            r++;
        }
        return ans;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
       return solve(nums,goal)-solve(nums,goal-1);

    }
}