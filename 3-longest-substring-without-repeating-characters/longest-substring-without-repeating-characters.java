class Solution {
    public int lengthOfLongestSubstring(String s) {
    HashMap<Character,Integer> mp=new HashMap<>();
    int  n=s.length();
    int ans=0;
    int len=-1;
    for(int i=0;i<n;i++){
        
        if(mp.containsKey(s.charAt(i)))len=Math.max(len,mp.get(s.charAt(i)));
        ans=Math.max(ans,i-len);
        mp.put(s.charAt(i),i);

        
    }
    return ans;
    }
}