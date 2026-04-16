class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for (int i = 0; i < board.length; i++){
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < board.length; j++){
                if (board[i][j] == '.') continue;
                if (!set.add(board[i][j]) || board[i][j] > '9' || board[i][j] < '0'){
                    return false;
                }
            }
        }

        for (int i = 0; i < board.length; i++){
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < board.length; j++){
                if (board[j][i] == '.') continue;
                if (!set.add(board[j][i]) || board[j][i] > '9' || board[j][i] < '0'){
                    return false;
                }
            }
        }

        for (int box = 0; box < 9; box++) {
            HashSet<Character> set = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                int row = (box / 3) * 3 + i / 3;
                int col = (box % 3) * 3 + i % 3;

                if (board[row][col] == '.') continue;

                if (!set.add(board[row][col])) {
                    return false;
                }
            }
        }

        return true;
    }
}