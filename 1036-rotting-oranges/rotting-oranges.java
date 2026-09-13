class Solution {
    class Info{
        int t;
        int r;
        int c;
        Info(int t,int r,int c){
            this.t=t;
            this.r=r;
            this.c=c;
        }
    }
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] vis=new int[m][n];
        int[] row={-1,0,1,0};
        int[] col={0,-1,0,1};
        Queue<Info>pq=new LinkedList<>();
        int fresh=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    pq.offer(new Info(0,i,j));
                    vis[i][j]=1;
                }
                if(grid[i][j]==1)fresh++;
            }
        }
        int ans=0;
        while(!pq.isEmpty()){
            Info info=pq.poll();
            int t=info.t;
            int r=info.r;
            int c=info.c;
            ans=Math.max(ans,t);
            for(int i=0;i<4;i++){
                int nr=r+row[i];
                int nc=c+col[i];
                if(nr>=0&&nr<m&&nc>=0&&nc<n&&grid[nr][nc]==1&&vis[nr][nc]==0){
                    pq.offer(new Info(t+1,nr,nc));
                    vis[nr][nc]=1;
                    fresh--;
                }

            }
        }
        if(fresh==0)return ans;
        return -1;
    }
}