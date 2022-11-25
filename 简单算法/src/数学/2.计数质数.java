package 数学;

class demo02 {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int i = solution2.countPrimes(10);
        System.out.println(i);
    }
}

class Solution2 {
    public int countPrimes(int n) {
        //定义一个标记位
        int i, j;
        boolean isPrime;
        int count = 0;

        for (i = 2; i < n; i++) {
            //默认所有数都是质数
            isPrime = true;
            //优化二：对本身是质数的自然数是有效的 根号i
            for (j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    //如果能被整除，那么这个数就不是质数，这里标记下不是质数
                    isPrime = false;
                    break;//优化一：只对本身非质数的自然数是有效的。
                }
            }
            //break会跳出最近的一个循环体，即跳到这里
            if (isPrime) {
                count++;
            }

        }
        return count;
    }
}