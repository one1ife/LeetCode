import java.util.Arrays;

/**
 * @Author Jacky Zou
 * @Date 2022/12/31 10:02
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {

    }
}
class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int res = 0;
        for (int i = 0; i < seats.length; i++) {
            res += Math.abs(seats[i] - students[i]);
        }
        return res;
    }
}