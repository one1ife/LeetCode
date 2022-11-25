package 数组;

import java.util.Arrays;

class Demo3{
    public static void main(String[] args) {
        int[] nums = new int[]{-1,-100,3,99};
        Solution3 solution3 = new Solution3();
        solution3.rotate(nums,2);
        System.out.println(Arrays.toString(nums));
    }
}
class Solution3 {
    public void rotate(int[] nums, int k) {
        int[] nums1 = new int[nums.length];
        for(int i = 0;i < nums.length;i++){
            int a = k % nums.length;
            System.out.println(a);
            int abs = (nums.length - a + i) % nums.length;
            nums1[i] = nums[abs];
        }
        for(int i = 0;i < nums.length;i++){
            nums[i] = nums1[i];
        }
    }
}

