class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));

        for(Map.Entry<Integer,Integer> it:mp.entrySet()){
            int num=it.getKey();
            int fre=it.getValue();

            if(pq.size()<k){
                pq.offer(new int[]{fre,num});
            }
            else if(pq.peek()[0]<fre){
                pq.poll();
                pq.offer(new int[]{fre,num});

            }
        }
        int[] ans=new int[k];
        int i=0;
        while(!pq.isEmpty()){
            ans[i++]=pq.poll()[1];
        }
        return ans;
    }
}