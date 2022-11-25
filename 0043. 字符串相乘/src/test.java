/**
 * @Author Jacky Zou
 * @Date 2022/9/21 9:16
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String multiply = solution.multiply("123", "456");
        System.out.println(multiply);
    }
}
class Solution {
    public String multiply(String num1, String num2) {
        Long i1 = new Long(num1);
        Long i2 = new Long(num2);
        return Long.toString(i1 * i2);
    }
}
