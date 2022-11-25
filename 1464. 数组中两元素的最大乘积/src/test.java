import java.util.Arrays;

/**
 * @Author Jacky Zou
 * @Date 2022/8/26 16:10
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        int[] ints = {3,7};
        Solution1 solution = new Solution1();
        int i = solution.maxProduct(ints);
        System.out.println(i);
    }
}
class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }
}
class Solution1 {
    public int maxProduct(int[] nums) {
        int max = 0;
        int i1 = max;
        for (int i : nums){
            int num = i - max;
            int j = Math.abs(num);
            if(num > 0) {
                max += num;
                i1 = j;
            }
            if (j < i1) i1 = j;
        }
        return (max - i1 - 1) * (max - 1);
    }
}
