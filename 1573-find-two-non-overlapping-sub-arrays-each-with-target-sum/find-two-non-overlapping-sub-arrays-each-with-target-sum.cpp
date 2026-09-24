class Solution {
public:
    int minSumOfLengths(vector<int>& arr, int target) {
     int n=arr.size();
     int left=0;
     int right=0;
     int sum=0;
     int ans=1e9;
    vector<int>best(n+1,1e9);
     while(right<n){
         sum+=arr[right];
        while(left<=right&&sum>target){
            sum-=arr[left];
            left++;
        }
        best[right+1]=best[right];
        if(sum==target){
            int len=right-left+1;
            if(best[left]!=1e9){
                ans=min(ans,len+best[left]);
            }
            best[right+1]=min(best[right+1],len);
        }
        right++;
     }   
     
     return ans==1e9?-1:ans;
    }
};