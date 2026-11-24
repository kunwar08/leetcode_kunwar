class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int l=-1;
        int maxlen=0;
        map<char,int>mp;
        for(int i=0;i<s.length();i++){
            if(mp.find(s[i])!=mp.end())l=max(l,mp[s[i]]);   
               maxlen=max(maxlen,i-l);
            
            mp[s[i]]=i;
        }
        return maxlen;
    }
};