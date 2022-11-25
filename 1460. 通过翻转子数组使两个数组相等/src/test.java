import java.util.Arrays;
import java.util.HashSet;

/**
 * @Author Jacky Zou
 * @Date 2022/8/24 8:23
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean b = solution.canBeEqual(new int[]{1, 2, 3, 4}, new int[]{2, 4, 1, 3});
        System.out.println(b);
    }
}
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : target){
            set.add(i);
        }

        for(int i : arr){
            if (set.add(i)) return false;
        }
        return true;
    }
}

//先排序再比较
class Solution1 {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        for (int i = 0; i < target.length; i++) {
            if(target[i] != arr[i]) return false;
        }
        return true;
    }
}
