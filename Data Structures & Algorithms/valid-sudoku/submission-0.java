class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> rows = new HashSet<>();

        //check if rows are correct
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                if (board[j][i] != '.' && (!rows.add(board[j][i]) || board[j][i] > '9' || board[j][i] < '0')){
                    return false;
                }
            }
            rows.clear();
        }

        HashSet<Character> cols = new HashSet<>();
        //check if columns are correct
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                if (board[i][j] != '.' && (!cols.add(board[i][j]) || board[i][j] > '9' || board[i][j] < '0')){
                    return false;
                }
            }
            cols.clear();
        }



        //check if sub boxes are correct
        //loop for the 9 sub boxes
        // check sub-boxes
        for (int boxRow = 0; boxRow < 3; boxRow++) {
            for (int boxCol = 0; boxCol < 3; boxCol++) {
                HashSet<Character> subBox = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char val = board[3 * boxRow + i][3 * boxCol + j];
                        if (val != '.' && (!subBox.add(val) || val < '1' || val > '9')) {
                            return false;
                        }
                    }
                }
            }
        }
        //else return true
        return true;
    }
}
