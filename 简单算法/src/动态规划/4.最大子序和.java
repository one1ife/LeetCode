/**
 * @Author Jacky Zou
 * @Date 2022/6/16 8:41
 * @Version 1.0
 */
package 动态规划;

class demo04 {
    public static void main(String[] args) {
        Solution4_1 solution4 = new Solution4_1();
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int i = solution4.maxSubArray(nums);
        System.out.println(i);
    }
}

//f(i)=max{f(i−1)+nums[i],nums[i]}
class Solution4 {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(Math.max(nums[0],nums[1]),nums[0] + nums[1]);
        int[] ints = new int[nums.length];
        ints[0] = nums[0];
        ints[1] = Math.max(Math.max(nums[0],nums[1]),nums[0] + nums[1]);
        int pre = Math.max(ints[0] + nums[1],nums[1]);
        for (int i = 2; i < nums.length; i++) {
            pre = Math.max(pre + nums[i],nums[i]);
            ints[i] = Math.max(pre,ints[i - 1]);
        }
        return ints[nums.length - 1];
    }
}

class Solution4_1 {
    public int maxSubArray(int[] nums) {
        int pre = 0;
        int max = nums[0];
        for (int x : nums){
            pre = Math.max((pre + x),x);
            max = Math.max(pre,max);
        }
        return max;
    }
}