class Solution {
    int solve(int[] nums,int k){
        if(k<0)return 0;
        int n=nums.length;
        int l=0;
        int r=0;
        int cnt=0;
        int ans=0;
        while(r<n){
            if(nums[r]%2==1)cnt++;
            while(l<=r&&cnt>k){
                if(nums[l]%2==1)cnt--;
                l++;
            }
            ans+=(r-l+1);
            r++;
        }
        return ans;

    }
    public int numberOfSubarrays(int[] nums, int k) {
        return solve(nums,k)-solve(nums,k-1);
    }
}