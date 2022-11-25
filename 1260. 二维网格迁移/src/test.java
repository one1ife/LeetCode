import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author Jacky Zou
 * @Date 2022/7/20 8:13
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] ints = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<List<Integer>> lists = solution.shiftGrid(ints, 1);
        lists.forEach(System.out::println);
    }
}
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int length = grid[0].length;
        int[] ints = new int[grid.length * length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                ints[length * i + j] = grid[i][j];
            }
        }
        ArrayList<List<Integer>> lists = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            if(list.size() < length) {
                list.add(ints[(i + ints.length - k % ints.length) % ints.length]);
            }else {
                List<Integer> list1 = new ArrayList<>();
                i--;
                list1.addAll(list);
                lists.add(list1);
                list.clear();
            }
        }
        lists.add(list);
        return lists;
    }
}