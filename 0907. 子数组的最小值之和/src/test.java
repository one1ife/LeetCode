import javax.xml.transform.SourceLocator;
import java.util.TreeSet;

/**
 * @Author Jacky Zou
 * @Date 2022/10/28 15:37
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.sumSubarrayMins(new int[]{11,81,94,43,3});
        System.out.println(i);
    }
}
class Solution {
    public int sumSubarrayMins(int[] arr) {
        int sum = 0;
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 1; i <= arr.length; i++) {
            for (int j = 0; j + i <= arr.length; j++) {
                TreeSet<Integer> minSet = new TreeSet<>();
                for (int k = 0; k < i; k++) {
                    minSet.add(arr[j + k]);
                }
                sum += minSet.first();
            }
        }
        return sum;
   }
}
