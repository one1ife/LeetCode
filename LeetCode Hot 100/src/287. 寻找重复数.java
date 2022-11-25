/**
 * @Author Jacky Zou
 * @Date 2022/7/22 8:10
 * @Version 1.0
 */
import java.util.Arrays;
import java.util.HashSet;

class test287 {
    public static void main(String[] args) {
        Solution287_1 solution287 = new Solution287_1();
        int duplicate = solution287.findDuplicate(new int[]{3,1,3,4,2});
        System.out.println(duplicate);
    }
}
class Solution287 {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums){
            if (set.add(i) == false) return i;
        }
        return -1;
    }
}
class Solution287_1 {
    public int findDuplicate(int[] nums) {
        int index = 0;
        while (true){
            int tmp = nums[index];
            if (tmp < 0){
                return index;
            }
            nums[index] = 0 - nums[index];
            index = tmp;
        }
    }
}



