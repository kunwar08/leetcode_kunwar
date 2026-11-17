class Solution {
public:
    string removeKdigits(string num, int k) {
        stack<int>st;
        int n=num.length();
        for(int i=0;i<n;i++){
            while(!st.empty() &&k>0&& st.top()> num[i]-'0'){
                st.pop();
                k--;
            }
            st.push(num[i]-'0');
        }
        string ans="";
        while(!st.empty()&&k>0){
            st.pop();
            k--;
        }
        if(st.empty())return "0";
        while(!st.empty()){
            ans+=st.top()+'0';
            st.pop();
        }
        while(ans.size()>0&&ans.back()=='0')ans.pop_back();
        if(ans.size()==0)return "0";
        reverse(ans.begin(),ans.end());
        return ans;
    }
};