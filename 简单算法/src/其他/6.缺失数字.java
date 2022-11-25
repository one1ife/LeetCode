/**
 * @Author Jacky Zou
 * @Date 2022/6/22 16:26
 * @Version 1.0
 */
package 其他;

import java.util.HashSet;

class demo06 {
    public static void main(String[] args) {
        Solution6_1 solution = new Solution6_1();
        int i = solution.missingNumber(new int[]{8,6,4,2,3,5,0,1});
        System.out.println(i);
    }
}
class Solution6 {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int i = 0; i <= nums.length; i++) {
            if (set.add(i)) return i;
        }
        return -1;
    }
}

//求和
class Solution6_1 {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return nums.length * (nums.length + 1) / 2 - sum;
    }
}
