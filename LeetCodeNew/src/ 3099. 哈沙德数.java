/**
 * @Author Jacky Zou
 * @Date 2024/7/3 19:37
 * @Version 1.0
 */

class Solution3099 {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        String s = x + "";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }
        if(x % sum != 0) return -1;
        return sum;

    }
}