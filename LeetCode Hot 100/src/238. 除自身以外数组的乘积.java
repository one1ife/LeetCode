/**
 * @Author Jacky Zou
 * @Date 2022/7/22 8:10
 * @Version 1.0
 */
import java.util.Arrays;

class test238 {
    public static void main(String[] args) {
        Solution238 solution238 = new Solution238();
        int[] ints = solution238.productExceptSelf(new int[]{-1,1,0,-3,3});
        System.out.println(Arrays.toString(ints));
    }
}
class Solution238{
    public int[] productExceptSelf(int[] nums) {
        int zeroIndex = -1;
        int count = 1;
        int[] ints = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                if(zeroIndex == -1){
                    zeroIndex = i;
                }else {
                    return ints;
                }
            }else {
                count *= nums[i];
            }
        }
        if(zeroIndex != -1){
            ints[zeroIndex] = count;
            return ints;
        }
        for (int i = 0; i < nums.length; i++) {
            ints[i] = count / nums[i];
        }
        return ints;
    }
}

