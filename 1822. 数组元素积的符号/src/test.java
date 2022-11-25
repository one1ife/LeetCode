/**
 * @Author Jacky Zou
 * @Date 2022/10/27 11:19
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.arraySign(new int[]{1,5,0,2,-3});
        System.out.println(i);
    }
}
class Solution {
    public int arraySign(int[] nums) {
        int num = 1;
        for(int i : nums){
            if(i == 0){
                return 0;
            }else if(i < 0){
                num = -num;
            }
        }
        return num;
    }
}