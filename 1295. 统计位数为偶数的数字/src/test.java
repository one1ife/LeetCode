/**
 * @Author Jacky Zou
 * @Date 2022/8/4 20:17
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int numbers = solution.findNumbers(new int[]{555, 901, 482, 1771});
        System.out.println(numbers);
    }
}
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums){
            if (i == 100000) return 1;
            if(i - 10000 < 0 && i - 1000 >= 0 ){
                count++;
            }else if(i-100 < 0 && i - 10 >= 0){
                count++;
            }
        }
        return count;
    }
}
