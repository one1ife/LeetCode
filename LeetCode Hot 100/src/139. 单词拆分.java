/**
 * @Author Jacky Zou
 * @Date 2022/7/22 8:10
 * @Version 1.0
 */
import java.awt.print.Book;
import java.util.*;

class test139 {
    public static void main(String[] args) {
        Solution139 solution = new Solution139();
        ArrayList<String> list = new ArrayList<>();
        list.add("aaaa");
        list.add("aa");
//        list.add("sand");
//        list.add("and");
//        list.add("cat");
        boolean leetcode = solution.wordBreak("aaaaaaa", list);
        System.out.println(leetcode);
    }
}
class Solution139{
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean b = false;
        int index = s.length();
        for (int i = 0; i < index; i++) {
            String sb = s.substring(i,index);
            for(String s1 : wordDict){
                b = s1.equals(sb);
                if(b) {
                    index = i;
                    i = -1;
                    break;
                }
            }
        }
        return b;
    }
}
class Solution139_1{
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
            for (int i = 1; i <= s.length(); i++) {
                for (int j = 0; j < i; j++) {
                    if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                    }
            }
        }
        return dp[s.length()];

    }
}
