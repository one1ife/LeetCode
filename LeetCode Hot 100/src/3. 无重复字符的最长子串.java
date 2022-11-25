import java.util.HashSet;
import java.util.Set;

/**
 * @Author Jacky Zou
 * @Date 2022/7/15 8:13
 * @Version 1.0
 */
class test03 {
    public static void main(String[] args) {
        Solution03_1 solution03 = new Solution03_1();
        int i = solution03.lengthOfLongestSubstring("au");
        System.out.println(i);
    }
}
class Solution03 {
    public int lengthOfLongestSubstring(String s) {
        // 哈希集合，记录每个字符是否出现过
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();
        // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
        int rk = -1, ans = 0;
        for (int i = 0; i < n; ++i) {
            if (i != 0) {
                // 左指针向右移动一格，移除一个字符
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                // 不断地移动右指针
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            // 第 i 到 rk 个字符是一个极长的无重复字符子串
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;

    }
}

class Solution03_1 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        HashSet<Character> set = new HashSet<>();
        int length = 1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (!set.add(s.charAt(j))) {
                        set.clear();
                        break;
                }
                if (length < set.size()) {
                    length = set.size();
                }
            }
            set.clear();
        }
        return length;
    }
}
