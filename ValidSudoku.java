//computation: O(n^2)
//space complexity: O(n)
public class Solution {
    public boolean isValidRow(char[][] board) {
        HashSet<Character> set = new HashSet<Character>();
        for (int i = 0; i < 9; i++) {
            set.clear();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.')
                    continue;
                else if (set.contains(board[i][j])){
                    return false;
                }
                set.add(board[i][j]);
            }
        }
        return true;
    }
    public boolean isValidColumn(char[][] board) {
        HashSet<Character> set = new HashSet<Character>();
        for (int i = 0; i < 9; i++) {
            set.clear();
            for (int j = 0; j < 9; j++) {
                char tmp = board[j][i];
                if (tmp == '.')
                    continue;
                else if (set.contains(tmp)) 
                    return false;
                set.add(tmp);
            }
        }
        return true;
    }
    public boolean isValidBlock(char[][] board, int a, int b) {
        HashSet<Character> set = new HashSet<Character>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char tmp = board[i+a][j+b];
                if (tmp == '.')
                    continue;
                else if (set.contains(tmp))
                    return false;
                set.add(tmp);
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!isValidBlock(board, 3*i, 3*j)) {
                    return false;
                }
            }
        }
        if (!isValidRow(board))
            return false;
        if (!isValidColumn(board))
            return false;
        return true;
    }
}
