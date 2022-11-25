/**
 * @Author Jacky Zou
 * @Date 2022/6/15 8:45
 * @Version 1.0
 */
package 动态规划;

import java.util.Arrays;

class demo03 {
    public static void main(String[] args) {
        Solution3_1 solution3 = new Solution3_1();
        int rob = solution3.rob(new int[]{2, 1, 1, 2});
        System.out.println(rob);
    }
}

//递推方程：Math.max(ints[i - 2] + nums[i],ints[i - 1])
class Solution3 {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0],nums[1]);
        int[] ints = new int[nums.length];
        ints[0] = nums[0];
        ints[1] = Math.max(nums[0],nums[1]);
        for (int i = 2; i < ints.length; i++) {
            ints[i] = Math.max(ints[i - 2] + nums[i],ints[i - 1]);
        }
        return ints[nums.length - 1];
    }
}

class Solution3_1 {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0],nums[1]);
        int[] ints = new int[nums.length];
        ints[0] = nums[0];
        ints[1] = Math.max(nums[0],nums[1]);
        for (int i = 2; i < ints.length; i++) {
            ints[i] = Math.max(ints[i - 2] + nums[i],ints[i - 1]);
        }
        return ints[nums.length - 1];
    }
}

