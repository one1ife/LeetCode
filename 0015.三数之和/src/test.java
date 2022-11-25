import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/**
 * @Author Jacky Zou
 * @Date 2022/6/21 17:11
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<List<Integer>> lists = solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        lists.forEach(System.out::println);
    }
}
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        if(nums.length <3 ) return lists;
        Boolean b = true;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1;k < nums.length;k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        ArrayList<Integer> list = new ArrayList<>(3);
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        Collections.sort(list);
                        for (List<Integer> list1 : lists){
                            if (list.get(0) == list1.get(0) & list.get(1) == list1.get(1)){
                                b = false;
                                break;
                            }
                        }
                    if(b) lists.add(list);
                    b = true;
                    }
                }
            }
        }
        return lists;
    }
}