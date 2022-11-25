import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.kthGrammar(3, 1);
        System.out.println(i);
    }
}

class Solution {
    public int kthGrammar(int n, int k) {
        String s = "0";
        for (int i = 1; i < n; i++) {
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(j) == '0'){
                    sb.append("01");
                }else {
                    sb.append("10");
                }
            }
            s = sb.toString();
        }
        return s.charAt(k - 1) - '0';
    }
}
