import java.util.Arrays;

/**
 * @Author Jacky Zou
 * @Date 2022/7/18 16:28
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = {0, 1, 2, 2, 3, 0, 4, 2};
        int i = solution.removeElement(ints, 2);
        System.out.println(i);
        String s = Arrays.toString(ints);
        System.out.println(s);
    }
}
class Solution {
    public int removeElement(int[] nums, int val) {
        int end = nums.length - 1;
        int start = 0;
        while(start <= end) {
            if(nums[start] == val) {
                nums[start] = nums[end];
                end--;
                start--;
            }
            start++;
        }
        return start;
    }
}
