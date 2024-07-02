/**
 * @Author Jacky Zou
 * @Date 2024/6/28 19:06
 * @Version 1.0
 */
class Solution0300 {
    //
    public int lengthOfLIS(int[] nums) {
        int length = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            int count = 1;
            int start = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[j] > start) {
                    count++;
                    start = nums[j];
                }

            }
            if(count > length) length = count;
        }

        return length;
    }

    //递归

    public int lengthOfLIS1(int[] nums) {



        return -1;

    }


}