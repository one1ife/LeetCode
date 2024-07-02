/**
 * @Author Jacky Zou
 * @Date 2024/7/1 18:51
 * @Version 1.0
 */

class Solution0392 {

    public static void main(String[] args) {

        Solution0392 solution0392 = new Solution0392();
        boolean subsequence = solution0392.isSubsequence("acb", "ahbgdc");
        System.out.println(subsequence);

    }
    public boolean isSubsequence(String s, String t) {
        int start = 0;
        boolean b = false;
        if(s.equals("")) return true;
        for (int i = 0; i < s.length(); i++) {
            b = false;
            for (int j = start; j < t.length(); j++) {
                if(s.charAt(i) == t.charAt(j)) {
                    start = j + 1;
                    b = true;
                    break;
                }
                b = false;
            }
            if (!b) return false;
        }

        return b;

    }


    //优化
    public boolean isSubsequence1(String s, String t) {
        int start = 0;
        if(s.equals("")) return true;
        for (int i = 0; i < t.length(); i++) {
            if(t.charAt(i) == s.charAt(start)){
                start++;
            }
            if (start == s.length()) return true;
        }

        return false;

    }
}