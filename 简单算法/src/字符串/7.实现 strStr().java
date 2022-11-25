package 字符串;
/**
 * @Author Jacky Zou
 * @Date 2022/4/4 9:25
 * @Version 1.0
 */

class demo7{
    public static void main(String[] args) {
        Solution7 solution7 = new Solution7();
        String s = "mississippi";

        String s1 = "pi";
        System.out.println(solution7.strStr(s,s1));
    }
}

class Solution7 {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0) return 0;
        int p = 0;
        boolean b =false;
        int index = 0;
        for (int i= 0;i < haystack.length();i++){
                if (haystack.charAt(i) == needle.charAt(p)) {
                    if (!b) index = i;
                    b = true;
                    if ((i - p) != index) {
                        p = -1;
                        b = false;
                        i = index;
                    }
                    if(p == needle.length() - 1) return index;
                    p++;
                }
        }
        return -1;
    }
}