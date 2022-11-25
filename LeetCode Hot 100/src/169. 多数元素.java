/**
 * @Author Jacky Zou
 * @Date 2022/7/22 8:10
 * @Version 1.0
 */

import java.util.*;

class test169 {
    public static void main(String[] args) {
        Solution169 solution169 = new Solution169();
        int i = solution169.majorityElement(new int[]{3,2,3});
        System.out.println(i);
    }
}
class Solution169{
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            if(map.get(i) == null){
                map.put(i,1);
            }else {
                map.put(i,map.get(i) + 1);
            }
            if(map.get(i) > nums.length / 2) return i;
        }
        return -1;
    }
}

//排序
class Solution169_1{
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}

