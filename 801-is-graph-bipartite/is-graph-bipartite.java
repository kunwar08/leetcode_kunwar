class Solution {
    public boolean dfs(int[][] graph,int[] vis,int[] col,int i,int c){
        vis[i]=1;
        col[i]=c;
        for(int it:graph[i]){
            if(vis[it]==0){
                if(dfs(graph,vis,col,it,1-c)==false)return false;
            }
            else{
                if(col[i]==col[it])return false;
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int V=graph.length;
        int[] vis=new int[V];
        int[] col=new int[V];
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                if(dfs(graph,vis,col,i,0)==false)return false;
            }
        }
        return true;
    }
}