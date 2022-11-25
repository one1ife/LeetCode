package 字符串;

import java.util.Arrays;

class demo1{
    public static void main(String[] args) {
        Solution1_1 solution1 = new Solution1_1();
        String str = "hello";
        char[] chars = str.toCharArray();
        solution1.reverseString(chars);
        System.out.println(new String(chars));
    }
}


class Solution1 {
    public void reverseString(char[] s) {
        int p = 0;
        int q = s.length - 1;
        while (p <= q){
            char temp = s[p];
            s[p] = s[q];
            s[q] = temp;
            p++;
            q--;
        }
        System.out.println(Arrays.toString(s));
    }
}

class Solution1_1 {
    public void reverseString(char[] s) {
        int p = 0;
        int q = s.length - 1;
        while (p < q){
            s[p] ^= s[q];
            s[q] ^= s[p];
            s[p] ^= s[q];
            p++;
            q--;
        }
        System.out.println(Arrays.toString(s));
    }
}