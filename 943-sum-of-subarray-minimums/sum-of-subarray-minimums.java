class Solution {
    int[] sLeft(int[] arr){
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int[] left=new int[n];
        for(int i=0;i<n;i++){
            while(!st.empty()&&arr[st.peek()]>=arr[i])st.pop();
            if(st.empty())left[i]=-1;
            else left[i]=st.peek();
            st.push(i);
        }
        return left;
    }
    int[] sright(int[] arr){
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int[] left=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.empty()&&arr[st.peek()]>arr[i])st.pop();
            if(st.empty())left[i]=n;
            else left[i]=st.peek();
            st.push(i);
        }
        return left;
    }
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        long sum=0;
        int mod=1000000007;
        int[] left=sLeft(arr);
        int[] right=sright(arr);
        for(int i=0;i<n;i++){
            int l=i-left[i];
            int r=right[i]-i;
            long fre=(long)l*r;
            long val=(fre*arr[i])%mod;
            sum=(sum+val)%mod;
        }
        return (int)sum;
    }
}