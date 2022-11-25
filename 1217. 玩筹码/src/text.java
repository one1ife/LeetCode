import java.util.HashSet;

/**
 * @Author Jacky Zou
 * @Date 2022/7/8 8:28
 * @Version 1.0
 */
public class text {
    public static void main(String[] args) {
        int[] ints = new int[]{3,3,1,2,2};
        Solution solution = new Solution();
        int i = solution.minCostToMoveChips(ints);
        System.out.println(i);
    }
}

class Solution {
    public int minCostToMoveChips(int[] position) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < position.length; i++) {
            if(position[i] % 2 == 0){
                count1++;
            }else {
                count2++;
            }
        }
        return Math.min(count1,count2);
    }
}