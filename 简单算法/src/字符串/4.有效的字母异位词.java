package 字符串;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author Jacky Zou
 * @Date 2022/3/27 14:53
 * @Version 1.0
 */
class demo4{
    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        String s = "aabb";
        String t = "baba";
        System.out.println(solution4.isAnagram(s, t));
    }
}

//hashmap效率太低
class Solution4 {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();
        if(chars.length != chars1.length) return false;

        for(char c : chars){
            if(map.containsKey(c)){
                map.put(c,map.get(c) + 1);
            }else {
                map.put(c,1);
            }
        }

        for (char c : chars1){
            if(map.containsKey(c)){
                map.put(c,map.get(c) - 1);
            }else {
                return false;
            }
        }

        for (char c : chars){
            if(map.get(c) != 0){
                return false;
            }else {
                return true;
            }
        }

        return false;
    }
}
//映射字母表
class Solution4_1 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] table = new int[26];
        for(int i = 0; i< s.length(); i++) {
            table[s.charAt(i) - 'a'] ++;
            table[t.charAt(i) - 'a'] --;
        }
        for(int i=0;i<26;i++)
            if(table[i] != 0)
                return false;
        return true;

    }

}