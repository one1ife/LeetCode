/**
 * @Author Jacky Zou
 * @Date 2022/6/22 16:16
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean palindrome = solution.isPalindrome(10);
        System.out.println(palindrome);
    }
}
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        String s = String.valueOf(x);
        char [] array =s.toCharArray();
        int length = s.length()-1;
        for(int i =0;i<length;i++,length--){
            array[i]^=array[length];
            array[length]^=array[i];
            array[i]^=array[length];
        }
        String s1 = new String(array);
        return s.equals(s1);
    }
}
