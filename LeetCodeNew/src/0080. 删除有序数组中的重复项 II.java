import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @Author Jacky Zou
 * @Date 2024/6/26 18:57
 * @Version 1.0
 */
class Solution0080 {
    public static void main(String[] args) {
        System.out.println("wp是sb");

        Solution0080 solution0080 = new Solution0080();
        int[] ints = new int[]{0,0,1,1,1,1,2,3,3};
        int i = solution0080.removeDuplicates1(ints);

        System.out.println(i + "   " + Arrays.toString(ints));
    }

    //额外空间
    public int removeDuplicates(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        int index = 0;
        boolean b = false;
        for (int i : nums){
            if(set.add(i)){
                nums[index] = i;
                index++;
                b = true;
            }else if(b){
                nums[index] = i;
                b =false;
                index++;
            }
        }
        return index;
    }


    //双指针
    public int removeDuplicates1(int[] nums) {

        int temp = -2;
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int j = i + 1;
            if(temp != nums[i] ){

                if (nums[i]== nums[j]){
                        nums[count++] = nums[i];
                        nums[count++] = nums[j];
                        i++;
                        temp = nums[i];
                    }else {
                        nums[count++] = nums[i];
                    }
                }
            }
        if(temp != nums[nums.length - 1]) nums[count++] = nums[nums.length - 1];
        return count;
    }
}