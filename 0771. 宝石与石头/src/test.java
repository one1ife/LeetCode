import java.util.HashSet;

public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.numJewelsInStones("z", "ZZ");
        System.out.println(i);
    }
}
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (!set.add(stones.charAt(i))){
                count++;
            }else {
                set.remove(stones.charAt(i));
            }
        }
        return count;
    }
}
