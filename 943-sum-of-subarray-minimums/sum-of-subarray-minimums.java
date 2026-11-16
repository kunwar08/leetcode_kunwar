class Solution {
    void left(int[] arr,int[] ans){
        int n=arr.length;
        Stack<Integer>st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&&arr[st.peek()]>=arr[i])st.pop();
            if(!st.isEmpty())ans[i]=st.peek();
            else ans[i]=-1;
            st.push(i);
        }
    }

    void right(int[] arr,int[] ans){
        int n=arr.length;
        Stack<Integer>st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&&arr[st.peek()]>arr[i])st.pop();
            if(!st.isEmpty())ans[i]=st.peek();
            else ans[i]=n;
            st.push(i);
        }
    }
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int[] ans1=new int[n];
        int[] ans2=new int[n];

        left(arr,ans1);
        right(arr,ans2);
        
        long sum=0;
        int mod=1000000007;

        for(int i=0;i<n;i++){
            long val=(i-ans1[i])*(ans2[i]-i);
            long temp=(val*arr[i])%mod;
            sum=(sum+temp)%mod;
        }

        return (int)sum;

    }
}