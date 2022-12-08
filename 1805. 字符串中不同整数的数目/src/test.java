import java.util.HashSet;
import java.util.Set;

/**
 * @Author Jacky Zou
 * @Date 2022/12/6 10:05
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.numDifferentIntegers("167278959591294");
        System.out.println(i);
    }
}
class Solution {
    public int numDifferentIntegers(String word) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) <= '9') {
                int j = i;
                while (j < word.length() && word.charAt(j) <= '9') j++;
                while (i < j && word.charAt(i) == '0') i++;
                set.add(word.substring(i, j));
                i = j;
            }
        }
        return set.size();

    }
}
