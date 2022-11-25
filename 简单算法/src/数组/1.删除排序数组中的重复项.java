package 数组;

import java.util.Arrays;

class Demo {
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        Solution1 solution = new Solution1();
        int i = solution.removeDuplicates1(nums);
        System.out.println(i);
        System.out.println(Arrays.toString(nums));


    }

}

class Solution1 {
    public int removeDuplicates(int[] nums) {
        int num = 1;
        for(int i = 1;i < nums.length;i++){
            if(nums[i] == nums[i - 1]){
                nums[i - 1] = nums[i];
            }else {
                num++;
                nums[num - 1] = nums[i];
            }
        }


        return num;
    }

    public int removeDuplicates1(int[] nums) {
        if((nums == null) || (nums.length == 0)){
            return 0;
        }
        int p = 0;
        int q = 1;
        while (q < nums.length){
            if(nums[p] == nums[q]){
                q++;
            }else {
                nums[++p] = nums[q];
            }
        }
        return p + 1;
    }
}

