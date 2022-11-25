import java.lang.reflect.Array;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        Solution_1 solution = new Solution_1();
        int kthLargest = solution.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2);
        System.out.println(kthLargest);
    }
}
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
class Solution_1 {
    public int findKthLargest(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if(nums[j] > nums[j + 1]){
                    nums[j] ^= nums[j + 1];
                    nums[j + 1] ^= nums[j];
                    nums[j] ^= nums[j + 1];
                }
            }
            if (i == k) return nums[nums.length - i];
        }
        return 0;
    }
}