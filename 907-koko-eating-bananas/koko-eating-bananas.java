class Solution {
    public int solve(int[] piles,int k,int h){
        int n=piles.length;
        long  cnt=0;
        for(int pile:piles){
            if(pile%k==0)cnt+=pile/k;
            else cnt+=(pile/k)+1;
        }
        if (cnt<=h)return 1;
        return 0;
    } 
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int low=1;
        int high=0;
        for(int i=0;i<n;i++){
            high=Math.max(piles[i],high);
        }
        long  ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(solve(piles,mid,h)==1){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return (int)ans;
    }
}