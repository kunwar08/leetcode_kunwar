class Solution {
    int[]  leftmin(int[] nums){
        Stack<Integer> st=new Stack<>();
        int n=nums.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            while(!st.empty()&&nums[st.peek()]>=nums[i])st.pop();
            if(st.empty())ans[i]=-1;
            else ans[i]=st.peek();
            st.push(i);
        }
        return ans;
    }
     int[]  rightmin(int[] nums){
        Stack<Integer> st=new Stack<>();
        int n=nums.length;
        int[] ans=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.empty()&&nums[st.peek()]>nums[i])st.pop();
            if(st.empty())ans[i]=n;
            else ans[i]=st.peek();
            st.push(i);
        }
        return ans;
    }
    int[]  leftmax(int[] nums){
        Stack<Integer> st=new Stack<>();
        int n=nums.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            while(!st.empty()&&nums[st.peek()]<=nums[i])st.pop();
            if(st.empty())ans[i]=-1;
            else ans[i]=st.peek();
            st.push(i);
        }
        return ans;
    }
     int[]  rightmax(int[] nums){
        Stack<Integer> st=new Stack<>();
        int n=nums.length;
        int[] ans=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.empty()&&nums[st.peek()]<nums[i])st.pop();
            if(st.empty())ans[i]=n;
            else ans[i]=st.peek();
            st.push(i);
        }
        return ans;
    }
    public long subArrayRanges(int[] nums) {
        int[] lmin=leftmin(nums);
        int[] rmin=rightmin(nums);
        int[] lmax=leftmax(nums);
        int[] rmax=rightmax(nums);
        int n=nums.length;
        long sum=0;
        for(int i=0;i<n;i++){
           int a=i-lmin[i];
           int b=rmin[i]-i;
           long c=a*b;
           sum-=c*nums[i];
           int d=i-lmax[i];
           int e=rmax[i]-i;
           long f=d*e;
           sum+=f*nums[i];

        }
        return sum;
    }
}