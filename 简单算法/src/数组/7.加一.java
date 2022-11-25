package 数组;

import java.util.Arrays;

/**
 * @Author Jacky Zou
 * @Date 2022/3/15 16:45
 * @Version 1.0
 */
class demo7{
    public static void main(String[] args) {
        Solution7 test = new Solution7();
        int[] ints = {9, 9, 9, 9};
        int[] plusOne = test.plusOne(ints);
        System.out.println(Arrays.toString(plusOne));
    }


}

class Solution7 {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length - 1] == 9){
            for (int i = digits.length - 1;i >= 0;i--){
                digits[i]=0;
                if(i == 0){
                    int[] ints = new int[digits.length + 1];
                    ints[0] = 1;
                    return ints;

                }
                if(!(digits[i - 1] == 9)){
                    digits[i - 1]++;
                    return Arrays.copyOf(digits,digits.length);
                }
            }
        }
        digits[digits.length - 1]++;
        return Arrays.copyOf(digits,digits.length);
    }
}

//
