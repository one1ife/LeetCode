import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * @Author Jacky Zou
 * @Date 2022/11/23 9:37
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.countBalls(19, 28);
        System.out.println(i);
    }
}
class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = lowLimit;i <= highLimit;i++){
            String s = new Integer(i).toString();
            int value = 0;
            for (int j = 0; j < s.length(); j++) {
                value += s.charAt(j) - '0';
            }
            if(map.get(value) == null){
                map.put(value,1);
            }else {
                map.put(value,map.get(value) + 1);
            }

        }

        return Collections.max(map.values());

    }
}

