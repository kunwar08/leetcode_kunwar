class Solution {
public:
    long long maxAlternatingSum(vector<int>& nums) {
        
        for(int i=0;i<nums.size();i++){
            nums[i]=nums[i]*nums[i];
        }
        sort(nums.begin(),nums.end());
        int left=0;
        int right=nums.size()-1;
        long long sum=0;
        while(left<right){
            sum+=nums[right];
            sum-=nums[left];
            left++;
            right--;
        }
        if(left==right)sum+=nums[left];
        return sum;
    }
};