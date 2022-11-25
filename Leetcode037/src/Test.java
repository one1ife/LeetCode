import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[][] chars = new char[9][9];
        chars[0] = new char[]{'4','.','.','.','.','.','.','.','.'};
        chars[1] = new char[]{'.','.','.','2','3','.','.','1','.'};
        chars[2] = new char[]{'.','6','.','.','9','.','8','2','5'};
        chars[3] = new char[]{'5','8','1','.','6','.','2','.','.'};
        chars[4] = new char[]{'.','.','.','8','.','.','.','6','.'};
        chars[5] = new char[]{'.','.','.','.','.','2','.','.','.'};
        chars[6] = new char[]{'2','9','.','6','.','.','.','.','7'};
        chars[7] = new char[]{'.','.','.','9','5','.','4','.','.'};
        chars[8] = new char[]{'.','.','4','.','.','.','.','9','6'};

        solution.solveSudoku(chars);
//        for (int i = 0;i < 9;i++){
//                System.out.println(Arrays.toString(chars[i]));
//        }
    }
}
class Solution {
    public void solveSudoku(char[][] board) {
        /**
         * 记录某行，某位数字是否已经被摆放
         */
        boolean[][] row = new boolean[9][9];
        /**
         * 记录某列，某位数字是否已经被摆放
         */
        boolean[][] col = new boolean[9][9];
        /**
         * 记录某 3x3 宫格内，某位数字是否已经被摆放
         */
        boolean[][] block = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    row[i][num] = true;
                    col[j][num] = true;
                    // blockIndex = i / 3 * 3 + j / 3，取整
                    block[i / 3 * 3 + j / 3][num] = true;
                }
            }
        }
        dfs(board, row, col, block, 0, 0);
        printBoard(board);
    }

    private boolean dfs(char[][] board, boolean[][] row, boolean[][] col, boolean[][] block, int i, int j) {
        // 找寻空位置
        while (board[i][j] != '.') {
            if (++j >= 9) {
                i++;
                j = 0;
            }
            if (i >= 9) {
                return true;
            }
        }
        for (int num = 0; num < 9; num++) {
            int blockIndex = i / 3 * 3 + j / 3;
            if (!row[i][num] && !col[j][num] && !block[blockIndex][num]) {
                // 递归
                board[i][j] = (char) ('1' + num);
                row[i][num] = true;
                col[j][num] = true;
                block[blockIndex][num] = true;
                if (dfs(board, row, col, block, i, j)) {
                    return true;
                } else {
                    // 回溯
                    row[i][num] = false;
                    col[j][num] = false;
                    block[blockIndex][num] = false;
                    board[i][j] = '.';
                }
            }
        }
        return false;
    }

    private void printBoard(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}