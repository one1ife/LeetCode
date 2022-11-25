import java.util.Arrays;

/**
 * @Author Jacky Zou
 * @Date 2022/7/6 8:32
 * @Version 1.0
 */
class test006 {
    public static void main(String[] args) {
        Solution006 solution = new Solution006();
        int[] ints = solution.twoSum(new int[]{0,0,3,4}, 0);
        System.out.println(Arrays.toString(ints));
    }
}
class Solution006 {
    public int[] twoSum(int[] numbers, int target) {
        for(int i = 0;i < numbers.length - 1;i++){
            for (int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] + numbers[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}


