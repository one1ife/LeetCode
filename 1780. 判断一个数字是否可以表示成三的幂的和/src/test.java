/**
 * @Author Jacky Zou
 * @Date 2022/12/9 15:36
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean b = solution.checkPowersOfThree(21);
        System.out.println(b);
    }
}

//进制转换
class Solution {
    public boolean checkPowersOfThree(int n) {
        // 三进制 1 1 0 1 代表 1 * 3^3 + 1 * 3^2 + 0 * 3^1 + 1
        // 三进制 2 1 0 1 代表 2 * 3^3 + 1 * 3^2 + 0 * 3^1 + 1
        // 这样就有两个3^3，不符合题意, 所以判断三进制每一位有没有2即可
        while(n > 0){
            if(n % 3 == 2) return false;
            n = n / 3;
        }
        return true;
    }
}
