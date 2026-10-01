class Solution {
public:
    
     bool solve(vector<int>&houses,vector<int>&heaters,int r){
        int i=0;
        int j=0;
        
        while(i<houses.size()&&j<heaters.size()){
            int left=heaters[j]-r;
            int right=heaters[j]+r;

            if(houses[i]<left)return false;
            if(houses[i]<=right)i++;
            else j++;
        }
        return i==houses.size();
     }
   
    int findRadius(vector<int>& houses, vector<int>& heaters) {
       sort(houses.begin(),houses.end());
       sort(heaters.begin(),heaters.end());

       int low=0;
       int high=max(abs(heaters.back()-houses.front()),abs(heaters.front()-houses.back()));
       int ans=high;
       while(low<=high){
        int mid=(low+high)/2;
        if(solve(houses,heaters,mid)){
            ans=mid;
            high=mid-1;

        }
        else{
            low=mid+1;
        }
       }
       return ans;
    }
};