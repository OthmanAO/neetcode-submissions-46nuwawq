class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int numRows = grid.length;
        int numCols = grid[0].length;

        int maxArea = 0;

        for (int r = 0; r < numRows; r++) {
            for (int c = 0; c < numCols; c++){
                maxArea = Math.max(dfsArea(grid, r,c), maxArea);
            }
        }
        return maxArea;
    }

    private int dfsArea(int[][] grid, int r, int c){
        int numRows = grid.length;
        int numCols = grid[0].length;

        
        if (r < 0 || c < 0 || r >= numRows || c >= numCols || grid[r][c] == 0){
            return 0;
        }


        if (grid[r][c] == 1){
            grid[r][c] = 0;
            return 1 
            + dfsArea(grid, r - 1,c) 
            + dfsArea(grid, r + 1,c) 
            + dfsArea(grid,r, c + 1) 
            + dfsArea(grid, r, c-1);
        }

        return 0;
    }
}
