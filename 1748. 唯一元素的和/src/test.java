import java.util.HashSet;

public class test {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        int i = solution.sumOfUnique(new int[]{1,2,3,4,5});
        System.out.println(i);
    }

}
class Solution {
    public int sumOfUnique(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int sum = 0;
        for(int i : nums){
            sum += i;
            if(!set.add(i)){
                set2.add(i);
                sum -= i;
            }
        }
        for(int i : set2){
            sum -= i;
        }
        return sum;
    }
}
//计数数组
class Solution1 {
    public int sumOfUnique(int[] nums) {
        int[] ints = new int[101];
        for (int i = 0; i < nums.length; i++) {
            ints[nums[i]]++;
        }
        int sum = 0;
        for (int i = 0; i < 101; i++) {
            if(ints[i] == 1) sum += i;
        }
        return sum;
    }
}