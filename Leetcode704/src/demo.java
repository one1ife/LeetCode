public class demo {
    public static void main(String[] args) {
        Solution test = new Solution();
        int i = test.search(new int[]{-1,0,3,5,9,12},13);
        System.out.println(i);
    }
}

class Solution {
    public int search(int[] nums, int target) {
        //定义首尾指针
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int index = (end + start) / 2;

            if(nums[index] == target) {
                return index;
            }else if(nums[index] > target) {
                end = index - 1;
            }else {
                start = index + 1;
            }
        }
        return -1;
    }
}
