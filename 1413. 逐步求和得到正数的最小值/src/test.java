public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.minStartValue(new int[]{1,2});
        System.out.println(i);
    }
}
class Solution {
    public int minStartValue(int[] nums) {
        int min = 0;
        int sum = 0;
        for(int i : nums){
            sum += i;
            if (sum < min) min = sum;
        }
        return 1 - min;
    }
}
