class Solution {
public:
    int reverseDegree(string s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            char c=s[i];
            int a='z'-c;
            sum+=(a+1)*(i+1);
        }
        return sum;
    }
};