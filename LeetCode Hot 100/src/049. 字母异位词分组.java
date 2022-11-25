import java.util.*;

/**
 * @Author Jacky Zou
 * @Date 2022/10/10 10:42
 * @Version 1.0
 */
class test049{
    public static void main(String[] args) {

    }
}

//排序
class Solution049 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String str : strs) {
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String key = new String(array);
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}