import java.util.HashSet;

/**
 * @Author Jacky Zou
 * @Date 2022/9/19 16:53
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.maxLengthBetweenEqualCharacters("abca");
        System.out.println(i);

    }
}
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int count = -1;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if(!set.add(s.charAt(i))){
                for (int j = 0; j < i; j++) {
                    if(s.charAt(i) == s.charAt(j)){
                        count = Math.max(i - j - 1,count);
                        break;
                    }
                }
            }
        }
        return count;
    }
}
