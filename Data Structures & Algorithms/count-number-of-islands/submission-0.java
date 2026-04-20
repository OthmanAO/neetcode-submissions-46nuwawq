class Solution {
    public int numIslands(char[][] grid) {
        int islandCount = 0;

        int numRow = grid.length;
        int numCol = grid[0].length; 
        
        for (int r = 0; r < numRow; r++){
            for (int c = 0; c < numCol; c++){
                if (grid[r][c] == '1'){
                    dfs(grid, r, c);
                    islandCount++;
                }
            }
        }


        return islandCount;

    }

    private void dfs (char[][] grid, int r, int c){
        int numRow = grid.length;
        int numCol = grid[0].length; 

        if (r < 0 || c < 0 || r >= numRow || c >= numCol || grid[r][c] == '0') return;

        grid[r][c] = '0';
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c + 1);
        dfs(grid, r, c - 1);

    }
}
