class Solution {
public:
    int characterReplacement(string s, int k) {
    int n=s.length();
    int l=0,r=0;
    int maxi=0;
    int ans=0;
    map<char,int>mp;
    while(r<n){
          mp[s[r]]++;
          maxi=max(maxi,mp[s[r]]);

          if(r-l+1-maxi>k){
               mp[s[l]]--;
               l++;
          }

          ans=max(ans,r-l+1);
          r++;
    }
        return ans;
    }
};