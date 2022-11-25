/**
 * @Author Jacky Zou
 * @Date 2022/6/23 19:49
 * @Version 1.0
 */
import java.util.ArrayList;
import java.util.HashSet;

class test005{
    public static void main(String[] args) {
        Solution005 solution005 = new Solution005();
        int i = solution005.maxProduct(new String[]{"eae","ea","aaf","bda","fcf","dc","ac","ce","cefde","dabae"});
        System.out.println(i);

    }
}
class Solution005 {
    public int maxProduct(String[] words) {
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int count = 0;
        int size = 0;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                set.add(words[i].charAt(j));
                size++;
            }
            for (int j = i + 1; j < words.length; j++) {
                for (int k = 0; k < words[j].length(); k++) {
                    if (!set.add(words[j].charAt(k))) {
                        count = 0;
                        break;
                    }else {
                        count++;
                        set.remove(words[j].charAt(k));
                    }
                }
                if(size * count > max){
                    max = size * count;
                }
                count = 0;
            }
            set.removeAll(set);
            size = 0;
        }
        return max;
    }
}