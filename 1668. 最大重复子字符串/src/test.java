/**
 * @Author Jacky Zou
 * @Date 2022/11/3 10:57
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.maxRepeating("ababc", "ab");
        System.out.println(i);
    }
}
class Solution {
    public int maxRepeating(String sequence, String word) {
        if(sequence.equals(word)) return 1;
        int count = 0;
        for (int i = 0; i < sequence.length(); i++) {
            boolean b = false;
            for (int j = 0; j < word.length(); j++) {
                if(i + j  + 1 == sequence.length() || sequence.charAt(i + j) != word.charAt(j)) {
                    b = false;
                    break;
                }else {
                    b = true;
                }
            }
            if(b) {
                i += word.length() - 1;
                count++;
            }
        }
        return count;
    }
}