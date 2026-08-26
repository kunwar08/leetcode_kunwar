class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        int n=asteroids.length;
        for(int i=0;i<n;i++){
                if(asteroids[i]<0){
                    while(!st.empty()&&st.peek()>0&&st.peek()<Math.abs(asteroids[i]))st.pop();
                    if(!st.empty()&&st.peek()==Math.abs(asteroids[i]))st.pop();  
                    else if(st.empty()||st.peek()<0)st.push(asteroids[i]);
                }
                 
                 else st.push(asteroids[i]);
        }
        int m=st.size();
        int[] ans=new int[m];
        int i=m-1;
        while(!st.empty()){
            ans[i--]=st.peek();
            st.pop();
        }
        return ans;
    }
}