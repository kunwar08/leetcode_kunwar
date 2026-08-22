class Solution {
    public int solve(int[] blooms,int mid,int m,int k){
        int cnt=0;
        int ans=0;
        for(int bloom:blooms){
            if(bloom<=mid){cnt++;
            if(cnt==k){
                ans++;
                cnt=0;
            }}
            else cnt=0;
        }
        if(ans>=m)return 1;
        return 0;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if(n<(long)m*k)return -1;
        int low=Integer.MAX_VALUE;
        int high=0;
        int ans=0;
        
        for(int i=0;i<n;i++){
           low=Math.min(low,bloomDay[i]);
           high=Math.max(high,bloomDay[i]);
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(solve(bloomDay,mid,m,k)==1){
                ans=mid;
                high=mid-1;
                }
            else low=mid+1;
        }
        return ans;
    }
}