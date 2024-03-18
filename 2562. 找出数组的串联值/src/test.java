/**
 * @Author Jacky Zou
 * @Date 2023/10/12 21:43
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        int[] ints = {5,14,13,8,12};
        test test = new test();
        long theArrayConcVal = test.findTheArrayConcVal(ints);
        System.out.println(theArrayConcVal);
    }

    public long findTheArrayConcVal(int[] nums) {
        long sum = 0;
        String sb = new String();
        for (int i = 0; i < nums.length / 2; i++) {
            sb = nums[i] + "" + nums[nums.length - 1 - i];
            sum += Integer.parseInt(sb);
        }
        if(nums.length % 2 == 1) sum += nums[nums.length / 2];
        return sum;
    }
}
