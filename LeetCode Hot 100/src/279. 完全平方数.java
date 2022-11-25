/**
 * @Author Jacky Zou
 * @Date 2022/7/22 8:10
 * @Version 1.0
 */
import java.util.HashSet;

class test279{
    public static void main(String[] args) {
        Solution279 solution279 = new Solution279();
        int i = solution279.numSquares(12);
        System.out.println(i);
    }

}
class Solution279 {
    public int numSquares(int n) {
        int[] ints = new int[n + 1];
        ints[0] = 0;
        for (int i = 1; i < ints.length; i++) {
            ints[i] = i;
            for (int j = 1; i - j * j >= 0; j++) {
                ints[i] = Math.min(ints[i],ints[i - j * j] + 1);
            }
        }
        return ints[n];
    }
}


