package 数组;

/**
 * @Author Jacky Zou
 * @Date 2022/3/16 16:33
 * @Version 1.0
 */
class demo8 {
    public static void main(String[] args) {
        Solution8 test = new Solution8();
        int[] ints = {0,1,0,3,12};
        test.moveZeroes(ints);

        Solution8_1 test1 = new Solution8_1();
        int[] ints1 = {0,1,0,3,12};
        test1.moveZeroes(ints1);
    }
}
class Solution8 {
    public void moveZeroes(int[] nums) {
        //用来记录非零元素的个数
        int count = 0;
        //遍历数组
        for(int i:nums){
            //如果为非零元素从头开始赋值
            if(i != 0) {
                nums[count] = i;
                count++;
            }
        }
        //将0赋值到数组的末尾
        for(int i = count;i < nums.length;i++){
            nums[i] = 0;
        }
    }
}

class Solution8_1 {
    public void moveZeroes(int[] nums) {
        // 双指针
        int j = 0 ;
        for(int i = 0 ; i< nums.length; i ++){
            if(nums[i] != 0){
                if( j < i ){
                    nums[j] = nums[i];
                    nums[i] = 0 ;
                }
                j++;
            }
        }
    }
}


