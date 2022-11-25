import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class test075 {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }
}

class Solution75 {
    public void sortColors(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i : nums){
            if(i == 0) {
                list.add(i);
            }else if(i == 1) {
                list1.add(i);
            }else {
                list2.add(i);
            }
        }

        list.addAll(list1);
        list.addAll(list2);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
        }

        System.out.println(Arrays.toString(nums));
    }
}