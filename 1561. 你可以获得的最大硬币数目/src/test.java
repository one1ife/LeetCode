import java.util.Arrays;

/*
 * @author: zouzy
 * @date: 2026/1/7 14:43
 * @description: 1561.你可以获得的最大硬币数目
 * @url: https://leetcode.cn/problems/maximum-number-of-coins-you-can-get/
 * 
 **/
public class test {
	public static void main(String[] args) {
		// 测试用例
		int result = new test().maxCoins(new int[]{9,8,7,6,5,1,2,3,4});
		System.out.println(result);
	}

	public int maxCoins(int[] piles) {
		Arrays.sort(piles); // 先排序，方便从大到小拿堆顶
		int sum = 0;
		int n = piles.length / 3; // 每轮三堆：最大给队友，次大给自己，最小给对手
		for (int i = 0; i < n; i++) {
			// 从末尾往前跳两步，依次拿每轮的次大值
			sum += piles[piles.length - 2 - i * 2];
		}
		return sum;
	}
}
