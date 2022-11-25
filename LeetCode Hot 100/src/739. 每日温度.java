/**
 * @Author Jacky Zou
 * @Date 2022/7/22 8:45
 * @Version 1.0
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class test739 {
    public static void main(String[] args) {
        Solution739_1 solution739 = new Solution739_1();
        int[] ints = solution739.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
        System.out.println(Arrays.toString(ints));
    }
}

class Solution739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ints = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            for (int j = i + 1; j < temperatures.length; j++) {
                if(temperatures[j] > temperatures[i]){
                    ints[i] = (j - i);
                    break;
                }
            }
        }
        return ints;
    }
}
//倒序
class Solution739_1 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ints = new int[temperatures.length];
        ints[temperatures.length - 1] = 0;
        for (int i = temperatures.length - 2; i >= 0; i--) {
            for (int j = i + 1; j <= temperatures.length; j += ints[j]) {
                if(temperatures[i] < temperatures[j]){
                    ints[i] = j - i;
                    break;
                }else if (ints[j] == 0){
                    ints[i] = 0;
                    break;
                }
            }
        }
        return ints;
    }
}