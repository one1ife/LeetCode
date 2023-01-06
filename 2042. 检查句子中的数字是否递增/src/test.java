/**
 * @Author Jacky Zou
 * @Date 2023/1/3 9:26
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {

    }
}
class Solution {
    public boolean areNumbersAscending(String s) {
        int pre = 0, pos = 0;
        while (pos < s.length()) {
            if (Character.isDigit(s.charAt(pos))) {
                int cur = 0;
                //Character.isDigit()判断是不是字符
                while (pos < s.length() && Character.isDigit(s.charAt(pos))) {
                    cur = cur * 10 + s.charAt(pos) - '0';
                    pos++;
                }
                if (cur <= pre) {
                    return false;
                }
                pre = cur;
            } else {
                pos++;
            }
        }
        return true;
    }
}