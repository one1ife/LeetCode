/**
 * @Author Jacky Zou
 * @Date 2022/12/13 9:36
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        boolean b = solution.checkIfPangram("thequickbrownfoxjumpsoverthelazydog");
        System.out.println(b);
    }
}
class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 25) return false;
        int[] ints = new int[26];
        for (int i = 0; i < ints.length; i++) {
            ints[i]++;
        }
        for (int i = 0; i < sentence.length(); i++) {
            ints[sentence.charAt(i) - 'a']--;
        }
        for(int i : ints){
            if (i > 0) return false;
        }
        return true;
    }
}
class Solution1 {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 25) return false;
        int[] ints = new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            ints[sentence.charAt(i) - 'a']++;
        }
        for(int i : ints){
            if (i < 1) return false;
        }
        return true;
    }
}