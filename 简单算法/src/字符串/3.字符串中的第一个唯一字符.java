package 字符串;

import java.util.HashSet;

/**
 * @Author Jacky Zou
 * @Date 2022/3/27 14:53
 * @Version 1.0
 */
class demo3{
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        String s = "aabb";
        int i = solution3.firstUniqChar(s);
        System.out.println(i);
    }
}
class Solution3 {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();

        for(char c : chars){
            if(!set1.add(c)) set2.add(c);
        }

        for (int i = 0;i < chars.length;i++){
            if (set2.add(chars[i])) return i;
        }
        return -1;
    }
}