import java.util.Arrays;

public class test {
}
class Solution {
    public int heightChecker(int[] heights) {
        int count = 0;
        int[] ints = new int[heights.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = heights[i];
        }
        Arrays.sort(heights);
        for (int i = 0; i < ints.length; i++) {
            if(heights[i] != ints[i]) count++;
        }
        return count;
    }
}
