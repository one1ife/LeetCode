public class test {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        int i = solution.searchInsert(new int[]{1, 3, 5, 6}, 7);
        System.out.println(i);
    }
}

//O(n)
class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(target <= nums[i]){
                return i;
            }
        }
        return nums.length;
    }
}
//二分查找
class Solution1 {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j){
            int mid = (i + j) / 2;
            if(target < nums[mid]){
                j = mid - 1;
            }else if(target > nums[mid]){
                i = mid + 1;
            }else {
                return mid;
            }
        }
        return i;
    }
}