import java.util.HashSet;

/**
 * @Author Jacky Zou
 * @Date 2022/11/8 9:50
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int abc = solution.countConsistentStrings("abc", new String[]{"a", "b", "c", "ab", "ac", "bc", "abc"});
        System.out.println(abc);
    }
}
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < allowed.length(); i++) {
            set.add(allowed.charAt(i));
        }

        int count = 0;
        for (String s : words){
            boolean b = true;
            for (int i = 0; i < s.length(); i++) {
                if(set.add(s.charAt(i))){
                    b = false;
                    set.remove(s.charAt(i));
                    break;
                }
            }
            if(b) count++;
        }
        return  count;
    }
}
