import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author Jacky Zou
 * @Date 2024/7/2 18:31
 * @Version 1.0
 */
class Solution3115 {
    public static void main(String[] args) {

        Solution3115 solution3115 = new Solution3115();
        int i1 = solution3115.maximumPrimeDifference(new int[]{4, 2, 9, 5, 3});
        System.out.println(i1);

    }
    public int maximumPrimeDifference1(int[] nums) {
       int i = 0;
       int j = nums.length - 1;
       boolean ib = false;
       boolean jb = false;
       while (i < j){
           if(!ib){
               if(isPrime(nums[i])){
                   ib = true;
               }else {
                   i++;
               }
           }

           if(!jb) {
               if(isPrime(nums[j])){
                   jb = true;
               }else {
                   j--;
               }
           }

           if(jb && ib) return j - i;

       }

       return 0;
    }

    public boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        int sqrt = (int) Math.sqrt(number);
        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int maximumPrimeDifference(int[] nums) {
        Set<Integer> primes = new HashSet<>(Arrays.asList(
                2, 3, 5, 7, 11,
                13, 17, 19, 23, 29,
                31, 37, 41, 43, 47,
                53, 59, 61, 67, 71,
                73, 79, 83, 89, 97
        ));

        int n = nums.length;
        int first = -1, ans = 0;
        for (int i = 0; i < n; ++i) {
            if (primes.contains(nums[i])) {
                if (first != -1) {
                    ans = Math.max(ans, i - first);
                } else {
                    first = i;
                }
            }
        }
        return ans;
    }





}

