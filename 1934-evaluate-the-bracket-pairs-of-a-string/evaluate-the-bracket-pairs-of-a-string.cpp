class Solution {
public:
    string evaluate(string s, vector<vector<string>>& knowledge) {
        map<string,string>mp;
        for(vector<string> it:knowledge){
            mp[it[0]]=it[1];
        }
        string ans="";
        for(int i=0;i<s.length();i++){
            if(s[i]!='('){
                ans+=s[i];
            }
            else{
                i++;
                string a="";
                while(s[i]!=')'){
                    a+=s[i];
                    i++;
                }
                if(mp.find(a)!=mp.end())ans+=mp[a];
                else ans+='?';
            }
        }
        return ans;
    }
};