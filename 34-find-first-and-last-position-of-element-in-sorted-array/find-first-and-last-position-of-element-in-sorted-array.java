class Solution {
    public int lower(int[] nums,int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>=target)high=mid-1;
            else low=mid+1;
        }
        if(low<n&&nums[low]==target)return low;
        return -1;
        
    }
    public int upper(int[] nums,int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]<=target)low=mid+1;
            else high=mid-1;
        }
        return high;
        
    }
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        if(n==0)return new int[]{-1,-1}; 
        int left=lower(nums,target);
        if(left==-1)return new int[]{-1,-1};
        int high=upper(nums,target);
        
        return new int[]{left,high};
    }
}