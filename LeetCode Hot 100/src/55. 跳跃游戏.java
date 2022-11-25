/**
 * @Author Jacky Zou
 * @Date 2022/8/22 8:21
 * @Version 1.0
 */
class test055{
    public static void main(String[] args) {
        Solution055 solution = new Solution055();
        boolean b = solution.canJump(new int[]{3,2,1,0,4});
        System.out.println(b);
    }
}
class Solution055 {
    public boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; ++i) {
            if(max >= i){
                max = Math.max(max,i + nums[i]);
                if(max >= nums.length - 1){
                    return true;
                }
            }
        }
        return false;
    }
}