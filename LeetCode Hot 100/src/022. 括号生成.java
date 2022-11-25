import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class test02 {
    public static void main(String[] args) {
        Solution022 solution022 = new Solution022();
        HashSet<String> test = solution022.test(7);
        test.forEach(System.out::println);
    }
}
class Solution022 {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        list.addAll(test(n));
        return list;
    }

    public HashSet<String> test(int n){
        HashSet<String> set = new HashSet<>();
        if (n == 1) {
            set.add("()");
            return set;
        }

        HashSet<String> set1 = test(n - 1);
        for (String s : set1){
            for (int i = 0; i < s.length(); i++) {
                StringBuffer sb = new StringBuffer(s);
                sb.insert(i,"()");
                set.add(sb.toString());
            }
        }
        return set;
    }
}
