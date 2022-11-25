/**
 * @Author Jacky Zou
 * @Date 2022/8/14 8:53
 * @Version 1.0
 */
import java.util.HashSet;

public class test {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int i = solution.maxScore("00");
        System.out.println(i);
    }
}
class Solution {
    public int maxScore(String s) {

        int count1 = 0;
        int count0 = 0;

        if(s.charAt(0) == '0') count0++;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count1++;
            }
        }

        int max = count0 + count1;
        for (int i = 1; i < s.length() - 1; i++) {

            if(s.charAt(i) == '0'){
                count0++;
            }
            if(s.charAt(i) == '1'){
                count1--;
            }
            if(count0 + count1 > max){
                max = count0 + count1;
            }

        }
        return max;
    }
}