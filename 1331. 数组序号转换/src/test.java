import java.util.*;

/**
 * @Author Jacky Zou
 * @Date 2022/7/28 8:18
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = solution.arrayRankTransform(new int[]{37,12,28,9,100,56,80,5,12});
        System.out.println(Arrays.toString(ints));
    }
}
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] ints = Arrays.copyOf(arr, arr.length);
        Arrays.sort(ints);
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            if(map.get(ints[i]) == null){
                count++;
            }
            map.put(ints[i],count);
        }
        for (int i = 0; i < arr.length; i++) {
            ints[i] = map.get(arr[i]);
        }
        return ints;
    }
}
