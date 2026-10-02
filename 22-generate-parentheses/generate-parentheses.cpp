class Solution {
public:
    void generate(string curr,int open,int close,vector<string>& ans,int n){
        if(curr.length()==2*n){
            ans.push_back(curr);
        }
        if(open<n)generate(curr+'(',open+1,close,ans,n);
        if(close<open)generate(curr+')',open,close+1,ans,n);
    }
    vector<string> generateParenthesis(int n) {
        string res="";
        vector<string>ans;
        generate(res,0,0,ans, n);
        return ans;
    }
};