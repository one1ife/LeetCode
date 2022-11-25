/**
 * @Author Jacky Zou
 * @Date 2022/11/8 10:33
 * @Version 1.0
 */
import java.util.*;

class test438 {
    public static void main(String[] args) {
        Solution438 solution = new Solution438();
        List<Integer> anagrams = solution.findAnagrams("cbaebabacd", "abc");
        anagrams.forEach(System.out::println);
    }
}

class Solution438 {
    public List<Integer> findAnagrams(String s, String p) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            if(map.get(p.charAt(i)) == null){
                map.put(p.charAt(i),1);
            }else {
                map.put(p.charAt(i),map.get(p.charAt(i)) + 1);
            }
        }
        int length = p.length();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= s.length() - length; i++) {
            HashMap<Character, Integer> map1 = new HashMap<>();
            map1.putAll(map);
            String str = s.substring(i,i + length);
            boolean b = true;
            for (int j = 0; j < str.length(); j++) {
                if(map1.get(str.charAt(j)) != null && map1.get(str.charAt(j)) > 0){
                    map1.put(str.charAt(j),map1.get(str.charAt(j)) - 1);
                }else {
                    b = false;
                    break;
                }
            }
            if(b) list.add(i);
        }
        return list;
    }
}