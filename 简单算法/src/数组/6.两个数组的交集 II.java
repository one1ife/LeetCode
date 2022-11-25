package 数组; /**
 * @Author Jacky Zou
 * @Date 2022/3/15 15:50
 * @Version 1.0
 */
import java.util.*;

class demo6{
    public static void main(String[] args) {
        Solution6 solution6 = new Solution6();
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(solution6.intersect(nums1,nums2)));
    }
}


//哈希表
class Solution6 {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i : nums1){
            if(hashMap.containsKey(i)){
                hashMap.put(i,hashMap.get(i) + 1);
            }else {
                hashMap.put(i,1);
            }
        }
        ArrayList<Integer> integers = new ArrayList<>();
        for(int i : nums2){
            if(hashMap.containsKey(i) && hashMap.get(i) != 0){
                integers.add(i);
                hashMap.put(i,hashMap.get(i) - 1);
            }
        }

        int[] ints = new int[integers.size()];
        int index = 0;
        for (int i : integers){
            ints[index] = i;
            index++;
        }

        return ints;
    }
}