import java.sql.Array;
import java.util.ArrayList;

/**
 * @Author Jacky Zou
 * @Date 2022/7/9 22:03
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.lenLongestFibSubseq(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        System.out.println(i);
    }
}
class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        list.add(arr[1]);
        int index = 2;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == list.get(index - 2) + list.get(index - 1)){
                index++;
                list.add(arr[i]);
            }
        }
        list.forEach(System.out::println);
        return list.size();

        }
    }
