public class test {
    public static void main(String[] args) {

    }
}
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ints = new int[nums.length];
        int index = 0;
        for (int i = 0; i < n; i++) {
            ints[index] = nums[i];
            index++;
            ints[index] = nums[n + i];
            index++;
        }
        return ints;
    }
}

