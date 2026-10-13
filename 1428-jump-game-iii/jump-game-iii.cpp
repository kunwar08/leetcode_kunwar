class Solution {
public:
    bool solve(vector<int>& arr,int start,vector<bool>& vis){
        if(start<0||start>arr.size()-1)return false;

        if(vis[start])return false;
        if(arr[start]==0)return true;
        vis[start]=true;
        return solve(arr,start+arr[start],vis)||solve(arr,start-arr[start],vis);
    }
    
    bool canReach(vector<int>& arr, int start) {
        vector<bool>vis(arr.size(),0);
        return solve(arr,start,vis);
        
        
    }
};