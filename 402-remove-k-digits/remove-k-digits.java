class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character>st=new Stack<>();
        int n=num.length();
        for(int i=0;i<n;i++){
            while(!st.empty()&&k>0&&st.peek()>num.charAt(i)){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));

        }
        while(k>0&&!st.empty()){
            st.pop();
            k--;
        }
        StringBuilder ans=new StringBuilder();

        while(!st.empty()){
             ans.append(st.peek());
             st.pop();
        }
        ans.reverse();
        int i=0;
        while(i<ans.length()&&ans.charAt(i)=='0')i++;
        if(i==ans.length())return "0";
        return ans.substring(i);
    }
}