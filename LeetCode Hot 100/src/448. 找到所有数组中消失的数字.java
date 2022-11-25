/**
 * @Author Jacky Zou
 * @Date 2022/7/22 8:45
 * @Version 1.0
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class test448 {
    public static void main(String[] args) {
        Solution448 solution = new Solution448();
        List<Integer>  list = solution.findDisappearedNumbers(new int[]{1,1});
        list.forEach(System.out::println);
    }
}

class Solution448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i : nums){
            set.add(i);
        }
        for (int i = 1; i <= nums.length; i++) {
            if(set.add(i)) list.add(i);
        }
        return list;
    }
}