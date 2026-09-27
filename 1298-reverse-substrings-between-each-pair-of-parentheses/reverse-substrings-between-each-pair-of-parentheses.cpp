class Solution {
public:
    int i=0;
    string pal(string s){
        string ans="";
        while(i<s.length()&&s[i]!=')'){
            if(s[i]=='('){
                i++;
                string temp=pal(s);
                reverse(temp.begin(),temp.end());
                ans+=temp;
                }
             else ans+=s[i];
            
            i++;
        }
       
        return ans;

    }
    string reverseParentheses(string s) {
        string ans=pal(s);
        
        return ans;
    }
};