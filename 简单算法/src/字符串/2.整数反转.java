package 字符串;

import java.util.Arrays;

class demo2{
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int i = -123;
        int i1 = solution2.reverse(i);
        System.out.println(i1);
    }
}
class Solution2 {
    public int reverse(int x) {
        int i = 1;
        if(x < 0){
            i = -1;
            x *= i;
        }

        String str = String.valueOf(x);
        StringBuffer sb = new StringBuffer(str);
        StringBuffer reverse = sb.reverse();
        String str1 = new String(reverse);
        try {
            return new Integer(str1) * i;
        } catch (Exception e) {
            return 0;
        }
    }
}

