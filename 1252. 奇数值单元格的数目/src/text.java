/**
 * @Author Jacky Zou
 * @Date 2022/7/12 8:23
 * @Version 1.0
 */
public class text {
}
class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int res = 0;
        int[][] matrix = new int[m][n];
        for (int[] index : indices) {
            for (int i = 0; i < n; i++) {
                matrix[index[0]][i]++;
            }
            for (int i = 0; i < m; i++) {
                matrix[i][index[1]]++;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((matrix[i][j] & 1) != 0) {
                    res++;
                }
            }
        }
        return res;
    }
}
