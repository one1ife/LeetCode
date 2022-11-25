import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author Jacky Zou
 * @Date 2022/7/29 18:06
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = solution.minWindow("DOBECODEBANC", "ABC");
        System.out.println(s);
    }
}
class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()) return "";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            if(map.get(t.charAt(i)) == null){
                map.put(t.charAt(i),1);
            }else {
                map.put(t.charAt(i),map.get(t.charAt(i)) + 1);
            }
        }
        int length = t.length();
        int start = 0;
        while (length <= s.length()){
            int end = start + length;
            if(isWindow(map,s.substring(start,end))) return s.substring(start,end);
            if(end == s.length()) {
                start = 0;
                length++;
            }else {
                start++;
            }
        }
        return "";
    }
    public Boolean isWindow(Map<Character,Integer> map1,String s){
        HashMap<Character, Integer> map = new HashMap<>();
        map.putAll(map1);
        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) != null){
                map.put(s.charAt(i),map.get(s.charAt(i)) - 1);
                if(map.get(s.charAt(i)) == 0) map.remove(s.charAt(i));
            }
        }
        if(map.size() == 0) return true;
        return false;
    }
}
class Solution1 {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()) return "";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            if(map.get(t.charAt(i)) == null){
                map.put(t.charAt(i),1);
            }else {
                map.put(t.charAt(i),map.get(t.charAt(i)) + 1);
            }
        }
        int start = 0;
        String s1 = new String(s);
        while (start < s.length()){
            s1 = s.substring(start);
            if (!isWindow(map,s1)){
                if (start == 0 ) return "";
                s1 = s.substring(--start);
                break;
            }
            start++;
        }
        int end = s.length();
        while (end > start){
            s1 = s.substring(start,end);
            if (!isWindow(map,s1) & end != 0){
                s1 = s.substring(start,end + 1);
                break;
            }
            end--;
        }
        return s1;
    }

    public Boolean isWindow(Map<Character,Integer> map1,String s){
        HashMap<Character, Integer> map = new HashMap<>();
        map.putAll(map1);
        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) != null){
                map.put(s.charAt(i),map.get(s.charAt(i)) - 1);
                if(map.get(s.charAt(i)) == 0) map.remove(s.charAt(i));
            }
        }
        if(map.size() == 0) return true;
        return false;
    }
}
class Solution {
    public String minWindow(String s, String t) {
        // 定义窗口大小，从A到z一共58
        int[] arr = new int[58];
        // 定义二者长度
        int sLen = s.length();
        int tLen = t.length();
        // 特殊情况，如果s的长度小于t的长度，直接返回
        if(sLen < tLen){
            return "";
        }
        // 填充数据，将窗口中的值挖坑
        for(int i = 0; i< tLen; i++){
            arr[t.charAt(i) - 'A']--;
        }
        // 定义窗口的左右指针
        int left = 0;
        int right = 0;
        // 将结果暂存于一个数组中，result[0]放左边的left，result[1]放右边的索引
        int[] result = new int[2];
        // result[1]定义初始值为最大值，为后续比较作基础
        result[1] = Integer.MAX_VALUE;
        // 遍历右节点
        while( right < sLen){
            // 填入右值
            arr[s.charAt(right)-'A']++;
            // 只要结果符合，且左边小于等于右边，则一一直移动左边节点
            while(allMoreZero(arr) && left<=right){
                // 找到了更小的值，更新结果
                if(result[1] - result[0] > (right - left)){
                    result[0] = left;
                    result[1] = right+1;
                }
                // 移除左节点值
                arr[s.charAt(left) - 'A']--;
                // 左边节点向右移动
                left++;
            }
            // 右边节点++
            right++;
        }
        // 如果值没变过，说明没有找到对应的值
        if(result[1] - result[0] == Integer.MAX_VALUE){
            return "";
        }
        return s.substring(result[0], result[1]);

    }

    // 用于比较所有的元素，如果所有元素不小于0，则返回true，否则返回false
    private boolean allMoreZero(int[] nums){
        for(int i = 0; i< nums.length; i++){
            if(nums[i] < 0){
                return false;
            }
        }
        return true;
    }
}
