package 数组;

/**
 * @Author Jacky Zou
 * @Date 2022/3/13 15:55
 * @Version 1.0
 */
class demo5{
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1, 7};
        Solution5 test5 = new Solution5();
        System.out.println(test5.singleNumber(nums));

    }
}

//异或运算
class Solution5 {
    public int singleNumber(int[] nums) {
        int a = 0;
        for (int b : nums){
            a ^= b;
        }
        return a;
        }
}
