import java.util.HashSet;

class test009 {
    public static void main(String[] args) {
        Solution009_1 s = new Solution009_1();
        int i = s.numSubarrayProductLessThanK(new int[]{10,9,10,4,3,8,3,3,6,2,10,10,9,3},
        19);
        System.out.println(i);
    }
}

class Solution009 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length, ret = 0;
        int prod = 1, i = 0;
        for (int j = 0; j < n; j++) {
            prod *= nums[j];
            while (i <= j && prod >= k) {
                prod /= nums[i];
                i++;
            }
            ret += j - i + 1;
        }
        return ret;

    }
}
class Solution009_1 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            int sum = 1;
            while (start < nums.length && sum < k){
                sum *= nums[start];
                if(sum < k) {
                    count++;
                }
                start++;
            }
        }
        return count;
    }
}