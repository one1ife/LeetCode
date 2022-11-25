package 其他;

import java.util.ArrayList;
import java.util.List;

class demo02 {
    public static void main(String[] args) {
        Solution02_1 solution02 = new Solution02_1();
        int i = solution02.hammingDistance(1, 3);
        System.out.println(i);
    }
}
class Solution02 {
    public int hammingDistance(int x, int y) {
        String max;
        String min;
        if(x > y){
            max = Integer.toBinaryString(x);
            min = Integer.toBinaryString(y);
        }else {
            min = Integer.toBinaryString(x);
            max = Integer.toBinaryString(y);
        }
        int count = 0;
        for (int i = 0; i < min.length(); i++) {
            if(max.charAt(max.length() - 1 - i) != min.charAt(min.length() - 1 - i)){
                count++;
            }
        }
        String s = max.substring(0,max.length() - min.length());
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') count++;
        }
        return count;
    }
}
class Solution02_1 {
    public int hammingDistance(int x, int y) {
        int i = x ^ y;
        String s = Integer.toBinaryString(i);
        int count = 0;
        for (int j = 0; j < s.length(); j++) {
            if(s.charAt(j) == '1') count++;
        }
        return count;
    }
}