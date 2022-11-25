package 数组;

import java.util.HashSet;

/**
 * @Author Jacky Zou
 * @Date 2022/3/11 16:54
 * @Version 1.0
 */
class demo4{
    public static void main(String[] args) {
        Solution41 test = new Solution41();
        int[] nums = {1,2,3,1};
        System.out.println(test.containsDuplicate(nums));
    }

}
class Solution4 {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 0) return false;
        for(int i = 0;i < nums.length - 1;i++){
            for (int j = i + 1;j < nums.length;j++){
                if(nums[i] == nums[j]) return true;
            }
        }
        return false;
    }
}

//hashset
class Solution41 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            if(!(set.add(i))) return true;
        }
        return false;
    }
}