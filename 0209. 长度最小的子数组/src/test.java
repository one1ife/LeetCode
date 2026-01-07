import java.util.Arrays;

/*
 * @author: zouzy
 * @date: 2026/1/6 17:21
 **/
public class test {
	public static void main(String[] args) {
		// 测试用例
		int result = new test().minSubArrayLen(213, new int[]{12,28,83,4,25,26,25,2,25,25,25,12});
		System.out.println(result);
	}

	public int minSubArrayLen(int target, int[] nums) {
		int start = 0;
		int sum = 0;
		
	
		int end = 0;
		while (sum > target) {
			sum += nums[end];
			end++;
		}
		return end - start + 1;
	}
}
