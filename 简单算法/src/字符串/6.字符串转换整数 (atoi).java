package 字符串;

import java.math.BigInteger;

/**
 * @Author Jacky Zou
 * @Date 2022/4/3 9:39
 * @Version 1.0
 */
class demo6{
    public static void main(String[] args) {
        Solution6 solution6 = new Solution6();
        String s = "9565-";
        System.out.println(solution6.myAtoi(s));
    }
}
class Solution6_1 {
    public int myAtoi(String s) {
        // String trim()：返回字符串的副本，忽略前导空白和尾部空白
        StringBuffer str = new StringBuffer(s.trim() + " ");
        boolean b = false;
        int start = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) <= '9' && str.charAt(i) >= '0') || (str.charAt(i) == '-') || (str.charAt(i) == '+')) {
                if(!b) start = i;
                b = true;
            }
            if (b && !(str.charAt(i) <= '9' && str.charAt(i) >= '0') && !(str.charAt(i) == '-') && !(str.charAt(i) == '+')) {
//                System.out.println(str.substring(start,i));

                return Integer.parseInt(str.substring(start,i));
            }

        }
        return 0;
    }
}

class Solution6 {
    public int myAtoi(String s) {
        // String trim()：返回字符串的副本，忽略前导空白和尾部空白
            StringBuffer str = new StringBuffer(s.trim() + " ");
            for (int i = 0; i < str.length(); i++) {
                if (!(str.charAt(i) <= '9' && str.charAt(i) >= '0') && i >= 1) {
                    try {
                        return Integer.parseInt(str.substring(0, i));
                    } catch (NumberFormatException e) {
                        try {
                            Double d = Double.parseDouble(str.substring(0, i));
                            if(str.charAt(0) == '.') return 0;
                            if(d >= 0) return 2147483647;
                            if(d < 0) return -2147483648;
                        } catch (NumberFormatException ex) {
                            return 0;
                        }
                    }
                }
            }
        return 0;
    }
}