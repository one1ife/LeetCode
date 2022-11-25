/**
 * @Author Jacky Zou
 * @Date 2022/8/11 15:48
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {

    }
}
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String s : sentences){
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == ' ') count++;
            }

            if(count > max) max = count;
        }
        return max + 1;
    }
}