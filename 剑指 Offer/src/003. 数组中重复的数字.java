import java.util.HashSet;

class demo1{
    public static void main(String[] args) {
        Solution test = new Solution();
        int i = test.findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5, 3});
        System.out.println(i);
    }
}
class Solution {
    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            if (!set.add(i)){
                return i;
            }
        }
        return 0;
    }
}