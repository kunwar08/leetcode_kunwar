class Solution {
public:
    int i=0;
    string pal(string s){
        string ans="";
        while(i<s.length()&&s[i]!=')'){
            if(s[i]=='('){
                i++;
                ans+=pal(s);
                }
             else ans+=s[i];
            
            i++;
        }
        reverse(ans.begin(),ans.end());
        return ans;

    }
    string reverseParentheses(string s) {
        string ans=pal(s);
        reverse(ans.begin(),ans.end());
        return ans;
    }
};