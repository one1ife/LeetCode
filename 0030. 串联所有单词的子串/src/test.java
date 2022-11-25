/**
 * @Author Jacky Zou
 * @Date 2022/8/23 15:44
 * @Version 1.0
 */
import java.sql.Array;
import java.util.*;

public class test {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        List<Integer> barfoothefoobarman = solution.findSubstring("wordgoodgoodgoodbestword",
                new String[]{"word","good","best","word"});
        barfoothefoobarman.forEach(System.out::println);
    }
}
class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        HashSet<String> set = new HashSet<>();
        set.add(words[0]);
        int length = words[0].length();
        for (int i = 1; i < words.length; i++) {
            set = allStrs(set, words[i], length);
        }
        int length1 = length * words.length;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= s.length() - length1; i++) {
            String str = s.substring(i,i + length1);
            if(set.add(str)){
                set.remove(str);
                break;
            }else {
                list.add(i);
            }
        }
        return list;
        
    }
    
    private HashSet<String> allStrs(Set<String> words,String word,int length){
        HashSet<String> set = new HashSet<>();
        for (String s : words){
            for (int i = 0; i <= s.length(); i += length) {
                set.add(s.substring(0,i) + word + s.substring(i));
            }
        }
        return set;
    }
}

class Solution1 {
    public List<Integer> findSubstring(String s, String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words){
            if(map.get(word) == null){
                map.put(word,1);
            }else {
                map.put(word,map.get(word) + 1);
            }
        }
        int length = words[0].length();
        int length1 = length * words.length;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= s.length() - length1; i++) {
            HashMap<String,Integer> map1 = new HashMap<>();
            map1.putAll(map);
            Boolean b = true;
            String str = s.substring(i,i + length1);
            for (int j = 0; j < str.length(); j+=length) {
                String s1 = str.substring(j,j + length);
                if(map1.get(s1) != null && map1.get(s1) > 0){
                    map1.put(s1,map1.get(s1) - 1);
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