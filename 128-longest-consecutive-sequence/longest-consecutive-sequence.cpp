class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        unordered_set<int>st;
        for(int i=0;i<nums.size();i++){
            st.insert(nums[i]);
        }
        int ans=0;
        for(int it:st){
            
            if(st.find(it-1)==st.end()){
                int cnt=1;
                int x=it;
                 while(st.find(x+1)!=st.end()){
                    cnt++;
                    x=x+1;
                 }
                 ans=max(ans,cnt);
            }
        }
        return ans;
    }
};