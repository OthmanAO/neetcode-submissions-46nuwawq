class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int numRows = grid.length;
        int numCols = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();

        for (int r = 0; r < numRows; r++) {
            for (int c = 0; c < numCols; c++) {
                if (grid[r][c] == 0) {
                    queue.offer(new int[]{r, c});
                }
            }
        }

        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int r = curr[0];
            int c = curr[1];

            for (int[] d : dirs) {
                int nr = r + d[0];
                int nc = c + d[1];

                if (nr < 0 || nc < 0 || nr >= numRows || nc >= numCols) {
                    continue;
                }

                // only visit empty rooms
                if (grid[nr][nc] != Integer.MAX_VALUE) {
                    continue;
                }

                grid[nr][nc] = grid[r][c] + 1;
                queue.offer(new int[]{nr, nc});
            }
        }
    }
}