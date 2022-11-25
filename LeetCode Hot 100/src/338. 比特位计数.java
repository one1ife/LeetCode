/**
 * @Author Jacky Zou
 * @Date 2022/7/22 8:10
 * @Version 1.0
 */
import java.util.Arrays;
import java.util.HashSet;

class test338 {
    public static void main(String[] args) {
        Solution338_1 solution338 = new Solution338_1();
        int[] ints = solution338.countBits(5);
        System.out.println(Arrays.toString(ints));
    }
}
class Solution338 {
    public int[] countBits(int n) {
        int[] ints = new int[n + 1];
        ints[0] = 0;
        for (int i = 1; i <= n; i++) {
            String s = Integer.toBinaryString(i);
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '1') count++;
            }
            ints[i] = count;
        }
        return ints;
    }
}
class Solution338_1 {
    public int[] countBits(int n) {
        int[] ints = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int num = i;
            int count = 0;
            while (num > 0){
                count += num & 1;
                num = num >>> 1;
            }
            ints[i] = count;
        }
        return ints;
    }
}
