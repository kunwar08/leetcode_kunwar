class Solution {
public:
    int scoreOfParentheses(string s) {
        stack<int>st;
        int ans=0;
        int i=0;
        while(i<s.length()){
            if(s[i]=='('){
               st.push(-1);
            }
            else{
                if(st.top()==-1){
                    st.pop();
                    st.push(1);
                }
                else{
                    int temp=0;
                    while(st.top()!=-1){
                        temp+=st.top();
                        st.pop();
                    }
                    st.pop();
                    st.push(2*temp);
                }

            }
            i++;
        }
        while(!st.empty()){
            ans+=st.top();
            st.pop();
        }
        return ans;
    }
};