class Solution {
public:
    void left(vector<int>& arr,map<int,int>& mp){
        stack<int>st;
        int n=arr.size();
        for(int i=0;i<n;i++){
            while(!st.empty()&&arr[st.top()]>=arr[i])st.pop();
            if(st.empty())mp[i]=-1;
            else mp[i]=st.top();
            st.push(i);
        }
    }

    void right(vector<int>& arr,map<int,int>& mp){
        stack<int>st;
        int n=arr.size();
        for(int i=n-1;i>=0;i--){
            while(!st.empty()&&arr[st.top()]>arr[i])st.pop();
            if(st.empty())mp[i]=n;
            else mp[i]=st.top();
            st.push(i);
        }
    }
    int sumSubarrayMins(vector<int>& arr) {
        int n=arr.size();
        map<int,int>mp1;
        map<int,int>mp2;
        left(arr,mp1);
        right(arr,mp2);
        int sum=0;
        int mod=1e9+7;
        for(int i=0;i<n;i++){
            long long val=(mp2[i]-i)*(i-mp1[i]);
            long long temp=(val*arr[i])%mod;
            sum=(sum+temp)%mod;

        }
        return sum;
    }
};