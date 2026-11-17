class Solution {
    public String removeKdigits(String num, int k) {
         Stack<Character>st = new Stack<>();
        int n=num.length();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() &&k>0&& st.peek()> num.charAt(i)){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()&&k>0){
            st.pop();
            k--;
        }
        if(st.isEmpty())return "0";
        while(!st.isEmpty()){
            ans.append(st.peek());
            st.pop();
        }
        while(ans.length()>0&&ans.charAt(ans.length()-1)=='0')ans.deleteCharAt(ans.length()-1);
        if(ans.length()==0)return "0";
        ans.reverse();
        return ans.toString();
    }
}