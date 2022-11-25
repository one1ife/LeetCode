package 动态规划;

/**
 * @Author Jacky Zou
 * @Date 2022/6/10 9:10
 * @Version 1.0
 */

class demo01 {
    public static void main(String[] args) {
        Solution1_1 solution = new Solution1_1();
        int i = solution.climbStairs(1);
        System.out.println(i);
    }
}
//斐波那契数列
//递归
class Solution {
    public int climbStairs(int n) {
        if(n == 1) return 1;
        if (n == 2) return 2;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}

//非递归
class Solution1_1 {
    public int climbStairs(int n) {
        int[] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
        if (n <= 1) return nums[n];
        nums[2] = 2;
        for(int i = 3;i <= n;i++){
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        return nums[n];

    }
}
