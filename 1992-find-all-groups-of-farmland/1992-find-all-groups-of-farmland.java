class Solution {
    public int[][] findFarmland(int[][] land) {
        int m=land.length;
        int n=land[0].length;

        boolean[][] vis=new boolean[m][n];

        List<int []> ansList=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!vis[i][j] && land[i][j]==1){
                    int[] maxC={i,j};
                    solve(i,j,maxC,land,vis);
                    ansList.add(new int[]{i,j,maxC[0],maxC[1]});
                }
            }
        }
        int[][] ans = new int[ansList.size()][4];
        for (int i = 0; i < ansList.size(); i++) {
            ans[i] = ansList.get(i);
        }
        return ans;
    }
    void solve(int r, int c, int[] maxCoordinates, int[][] land, boolean[][] vis) {
        int m = land.length;
        int n = land[0].length;
        
        vis[r][c] = true;
        
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        
        for (int i = 0; i < 4; i++) {
            int nr = dr[i] + r; 
            int nc = dc[i] + c; 
            
            if (nr >= 0 && nr < m && nc >= 0 && nc < n && land[nr][nc] == 1 && !vis[nr][nc]) {
                maxCoordinates[0] = Math.max(maxCoordinates[0], nr);
                maxCoordinates[1] = Math.max(maxCoordinates[1], nc);
                
                solve(nr, nc, maxCoordinates, land, vis);
            }
        }
    }
}