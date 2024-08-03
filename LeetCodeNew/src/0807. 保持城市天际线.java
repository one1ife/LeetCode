/**
 * @Author Jacky Zou
 * @Date 2024/7/14 12:53
 * @Version 1.0
 */

//保持城市天际线
class Solution0807 {
    public static void main(String[] args) {
        Solution0807 solution = new Solution0807();
        int[][] ints = {{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}};
        int i = solution.maxIncreaseKeepingSkyline(ints);
        System.out.println(i);
    }
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] row = new int[grid.length];
        int[] col = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            int max = 0;
            for (int j = 0; j < grid[0].length; j++) {
                max = Math.max(max, grid[i][j]);
            }
            row[i] = max;
        }
        for (int i = 0; i < grid[0].length; i++) {
            int max = 0;
            for (int j = 0; j < grid.length; j++) {
                max = Math.max(max, grid[j][i]);
            }
            col[i] = max;
        }
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                sum += Math.min(row[i], col[j]) - grid[i][j];
            }
        }
        return sum;
    }
}