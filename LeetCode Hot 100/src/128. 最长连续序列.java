import java.util.HashSet;
import java.util.TreeSet;

/**
 * @Author Jacky Zou
 * @Date 2022/8/26 20:08
 * @Version 1.0
 */


class test128 {
    public static void main(String[] args) {
        Solution128 solution = new Solution128();
        int i = solution.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1});
        System.out.println(i);

    }
}
class Solution128 {
    public int longestConsecutive(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : nums){
            set.add(i);
        }
        Integer num =null;
        int count = 0;
        int max = 0;
        for(int i : set){
            if(num == null) {
                num = i;
                count = 1;
            }else if(i - 1 == num){
                num = i;
                count++;
            }else {
                num = i;
                if(max < count) max = count;
                count = 1;
            }
        }
        return Math.max(count,max
        );
    }
}
class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> set = new HashSet<>();
        for(int i = 0;i < s.length();i++){
            if(!set.add(s.charAt(i))) return s.charAt(i);
        }

        return ' ';
    }
}