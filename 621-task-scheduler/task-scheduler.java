class Solution {
    public int leastInterval(char[] tasks, int n) {
    HashMap<Character,Integer>mp= new HashMap<>();
    int a=tasks.length;
    for(int i=0;i<a;i++){
        mp.put(tasks[i],mp.getOrDefault(tasks[i],0)+1);
    }
    PriorityQueue<Integer>pq=new PriorityQueue<>((x,y)->y-x);
    for(int it:mp.values()){
        pq.offer(it);
    }
    int time=0;
    while(!pq.isEmpty()){
        ArrayList<Integer> ans=new ArrayList<>();
        int cycle=n+1;
        int i=0;
        while(i<cycle&&!pq.isEmpty()){
            int cnt=pq.peek();
            pq.poll();
            cnt--;
            if(cnt>0)ans.add(cnt);
            time+=1;
            i++;
        }
        for(int val:ans)pq.offer(val);
        if(pq.isEmpty())break;
        time+=(cycle-i);
    }
    return time;

    }
}