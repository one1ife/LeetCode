package 动态规划;

import java.util.Arrays;

class 买卖股票的最佳时机 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,3,6,4};
        Solution2 solution2 = new Solution2();
        int i = solution2.maxProfit(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(i);


    }
}
class Solution2 {
    public int maxProfit(int[] prices) {
        int min = 0;
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] >= prices[i - 1]){
                if((prices[i] - prices[min]) > sum){
                    sum = (prices[i] - prices[min]);
                }
            }
            if(prices[i] < prices[i - 1]) {
                if(prices[min] >= prices[i])
                min = i;
            }
        }
        return sum;
    }

}
