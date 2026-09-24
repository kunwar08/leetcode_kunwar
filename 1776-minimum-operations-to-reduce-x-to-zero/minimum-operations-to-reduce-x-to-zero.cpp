class Solution {
public:
    int minOperations(vector<int>& nums, int x) {
        int n=nums.size();
        int total=0;
        for(int i=0;i<n;i++)total+=nums[i];
        int tar=total-x;
        
        if(tar==0)return n;
        int left=0;
        int sum=0;
        int right=0;
        int mlen=-1;
        while(right<n){
            sum+=nums[right];
            while(left<=right&&sum>tar){
                sum-=nums[left];
                left++;
            }
            if(sum==tar){
                mlen=max(mlen,right-left+1);
            }
            right++;
        }
        if(mlen==-1)return -1;
        return n-mlen;
    }
};