class Solution {
public:
    int minInsertions(string s) {
        int insert=0;
        int left=0;
        int n=s.length();
        int ind=0;
        while(ind<n){
            char c=s[ind];
            if(c=='('){
                left++;
                ind++;
            }
            else{
                if(left>0){
                    left--;
                }
                else{
                    insert++;
                }
                if(ind<n-1&&s[ind+1]==')'){
                    ind+=2;
                }
                else{
                    insert++;
                    ind++;
                }
            }
        }
        insert+=left*2;
        return insert;
    }
};