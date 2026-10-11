class Solution {
public:
    int findMin(vector<int>& nums) {
     int low=0;
     int high=nums.size()-1;
     int ans=1e9;
     while(low<=high){
         int mid=(low+high)/2;
         ans=min(ans,nums[mid]);
        if(nums[low]<=nums[mid]){
            if(nums[high]<nums[mid])low=mid+1;
            else high=mid-1;
        }
        else{
            if(nums[high]>nums[mid])high=mid-1;
            else low=mid+1;
        }

     }   
     return ans;
    }
};