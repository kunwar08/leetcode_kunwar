class Solution {
public:
    vector<int> findThePrefixCommonArray(vector<int>& A, vector<int>& B) {
       unordered_map<int,int>mp;
       vector<int>ans;
       for(int i=0;i<A.size();i++){
        mp[A[i]]++;
        int cnt=0;
        for(int j=0;j<=i;j++){
            if(mp.find(B[j])!=mp.end())cnt++;
        }
        ans.push_back(cnt);
       } 
       return ans;
    }
};