/**
 * @Author Jacky Zou
 * @Date 2022/7/22 8:10
 * @Version 1.0
 */
import java.util.Arrays;

class test322 {
    public static void main(String[] args) {

    }
}
class Solution322 {
    public int coinChange(int[] coins, int amount) {
        int[] ints = new int[coins.length + 1];
        ints[0] = 0;
        for (int i = 0; i < coins.length; i++) {
            ints[i + 1] = Math.min(ints[i],1);
        }


        return ints[coins.length];
    }
}
