import java.util.Arrays;

class test012{
    public static void main(String[] args) {
        Solution12_1 solution12 = new Solution12_1();
        int index = solution12.pivotIndex(new int[]{-1,-1,-1,-1,-1,-1});
        System.out.println(index);
    }

}
class Solution12 {
    public int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int left = 0;
            int right = 0;
            int j = i - 1;
            while (j >= 0){
                left += nums[j];
                j--;
            }
            j = i + 1;
            while(j < nums.length){
                right += nums[j];
                j++;
            }
            if(right == left) return i;
        }
        return -1;
    }
}

class Solution12_1 {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            left += nums[i];
            if((left - nums[i]) == (sum - left)){
                return i;
            }
        }
        return -1;
    }
}