import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author Jacky Zou
 * @Date 2022/8/4 8:16
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> list = solution.minSubsequence(new int[]{4,4,7,6,7});
        list.forEach(System.out::println);
    }
}
class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        ArrayList<Integer> list = new ArrayList<>();
        int sum1 = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            list.add(nums[i]);
            sum1 += nums[i];
            if(sum1 > (sum - sum1)) break;
        }
        return list;
    }
}