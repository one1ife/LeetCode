/**
 * @Author Jacky Zou
 * @Date 2024/3/18 8:16
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {

    }


}

//前缀和
class NumArray {
    int[] sum;

    public NumArray(int[] nums) {
        sum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            sum[i + 1] = nums[i] + sum[i];
        }

    }

    public int sumRange(int left, int right) {
        return sum[right + 1] - sum[left];
    }
}

