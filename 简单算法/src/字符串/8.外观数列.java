package 字符串;

import java.util.HashSet;

/**
 * @Author Jacky Zou
 * @Date 2022/4/5 9:40
 * @Version 1.0
 */
class demo8{
    public static void main(String[] args) {
        Solution8 solution8 = new Solution8();
        System.out.println(solution8.countAndSay(13));
    }
}

//递归+hashset
class Solution8 {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        String str = countAndSay(n-1);
        int count = 1;
        HashSet<Character> set = new HashSet<>();
        StringBuffer str1 = new StringBuffer();
        for (int i = 0;i < str.length();i++){
            if(set.add(str.charAt(i))){
                if((i == str.length() - 1) || str.charAt(i) != str.charAt(i + 1)){
                    str1.append(count);
                    str1.append(str.charAt(i));
                    set.remove(str.charAt(i));
                    count = 1;
                }

            }else {
                if((i == str.length() - 1) || (str.charAt(i) != str.charAt(i + 1))){
                    str1.append(count + 1);
                    str1.append(str.charAt(i));
                    set.remove(str.charAt(i));
                    count = 1;
                }else {
                    count++;
                }
            }
        }
        return new String(str1);
    }
}