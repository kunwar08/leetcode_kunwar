class Solution {
    public int characterReplacement(String s, int k) {
      int l=0;
      int r=0;
      int n=s.length();
      HashMap<Character,Integer>mp = new HashMap<>();
      int maxi=0;
      int ans=0;
      while(r<n){
           mp.put(s.charAt(r),mp.getOrDefault(s.charAt(r),0)+1);
           maxi=Math.max(maxi,mp.get(s.charAt(r)));
            if(r-l+1-maxi>k){
               mp.put(s.charAt(l),mp.get(s.charAt(l))-1);
               l++;
           }
           ans=Math.max(ans,r-l+1);
           r++;
      }
      return ans;
    }
}