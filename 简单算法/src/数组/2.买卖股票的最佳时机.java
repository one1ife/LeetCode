package 数组;

import java.util.Arrays;

class Demo2 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};
        Solution2 solution2 = new Solution2();
        int i = solution2.maxProfit(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(i);


    }
}
class Solution2 {
    public int maxProfit(int[] prices) {
        int p = 0;
        int q = 1;
        int sum = 0;
        while (q < prices.length){
            if(prices[q] >= prices[q - 1]){
                q++;
            }
            if(q == prices.length || (prices[q] < prices[q - 1])){
                sum += prices[q - 1] - prices[p];
                p = q;
                q++;
            }

        }
        return sum;
    }
}