import java.util.HashSet;

/**
 * @Author Jacky Zou
 * @Date 2024/3/2 17:51
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {

    }

//    public int[] searchRange(int[] nums, int target) {
//        int[] ints = {-1, -1};
//        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == target){
//                sum += target;
//                if(ints[0] == -1) ints[0] = i;
//                ints[1] = ints[0] + (i - ints[0]);
//            }
//
//        }
//        return ints;
//    }

    //双指针
    public int[] searchRange(int[] nums, int target) {
        int[] ints = {-1, -1};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                if(ints[0] == -1) ints[0] = i;
                ints[1] = ints[0] + (i - ints[0]);
            }

        }
        return ints;
    }

}

//二分查找
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int leftIdx = binarySearch(nums, target, true);
        int rightIdx = binarySearch(nums, target, false) - 1;
        if (leftIdx <= rightIdx && rightIdx < nums.length && nums[leftIdx] == target && nums[rightIdx] == target) {
            return new int[]{leftIdx, rightIdx};
        }
        return new int[]{-1, -1};
    }

    public int binarySearch(int[] nums, int target, boolean lower) {
        int left = 0, right = nums.length - 1, ans = nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target || (lower && nums[mid] >= target)) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}

