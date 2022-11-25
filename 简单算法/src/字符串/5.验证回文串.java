package 字符串;

import java.util.Locale;

/**
 * @Author Jacky Zou
 * @Date 2022/4/1 10:58
 * @Version 1.0
 */
class demo5{
    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        String s = "sereres";
        System.out.println(solution5.isPalindrome(s));
    }
}
class Solution5 {
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < s1.length();i++){
            if((s1.charAt(i) <= '9' && s1.charAt(i) >= '0') || (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z')){
                sb.append(s1.charAt(i));
            }
        }
//        System.out.println(sb);
        return sb.toString().equals(sb.reverse().toString());
    }
}
