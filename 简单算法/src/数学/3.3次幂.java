/**
 * @Author Jacky Zou
 * @Date 2022/6/18 10:33
 * @Version 1.0
 */
package 数学;

class QWEWQE {
    public static void main(String[] args) {
        Solution3_1 solution3 = new Solution3_1();
        boolean powerOfThree = solution3.isPowerOfThree(0);
        System.out.println(powerOfThree);
    }
}
//递归
class Solution3 {
    public boolean isPowerOfThree(int n) {
        int i = 1;
        while (i <= n){
            if(i == n) return true;
            i = there(i);
        }
        return false;
    }

    public int there(int n){
        return n * 3;
    }

}


class Solution3_1 {
    public boolean isPowerOfThree(int n) {
        if(n <= 0) return false;
        int i;
        while (n > 1){
            i = n % 3;
            if(i != 0) return false;
            n /= 3;
        }
        return true;
    }


}