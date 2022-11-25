import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @Author Jacky Zou
 * @Date 2022/7/28 15:52
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        int[][] ints1 = new int[][]{{2,8,7},{7,1,3},{1,9,5}};
        Solution solution = new Solution();
        int i = solution.maximumWealth(ints1);
        System.out.println(i);
    }
}
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] ints : accounts){
            int sum = Arrays.stream(ints).sum();
            if(max < sum) max = sum;
        }
        return max;

}
