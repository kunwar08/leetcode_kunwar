class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        int V=graph.length;
        int[] deg=new int[V];
        for(int i=0;i<V;i++)adj.add(new ArrayList<>());
        for(int i=0;i<V;i++){
            for(int it:graph[i]){
                adj.get(it).add(i);
                deg[i]++;
            }
        }
        Queue<Integer>qp=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(deg[i]==0)qp.offer(i);
        }
        List<Integer>ans=new ArrayList<>();
        while(!qp.isEmpty()){
            int f=qp.poll();
            ans.add(f);
            for(int it:adj.get(f)){
                deg[it]--;
                if(deg[it]==0)qp.offer(it);
            }
        }
        Collections.sort(ans);
        return ans;
        }
}