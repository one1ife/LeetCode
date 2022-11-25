import java.util.ArrayList;
import java.util.List;

class test078 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3};
        Solution078 solution078 = new Solution078();
        List<List<Integer>> subsets = solution078.subsets(ints);
        subsets.forEach(System.out::println);
    }
}
class Solution078 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<Integer>());
        return null;
    }


}
