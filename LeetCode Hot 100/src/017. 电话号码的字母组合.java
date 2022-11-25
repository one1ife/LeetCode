import java.util.ArrayList;
import java.util.List;

class test017 {
    public static void main(String[] args) {
        Solution017 solution017 = new Solution017();
        List<String> list = solution017.letterCombinations("");
        list.forEach(System.out::println);
    }
}
class Solution017 {

    char[][] chars = new char[][]{{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
    public List<String> letterCombinations(String digits) {
        int[] ints = new int[digits.length()];
        for (int i = 0; i < digits.length(); i++) {
                ints[i] = digits.charAt(i) - 49;
        }
        ArrayList<String> list = new ArrayList<>();
        if(digits.equals("")) return list;
        List<StringBuffer> sb = demo(ints[ints.length - 1], null);
        for (int i = ints.length - 2; i >= 0; i--) {
            sb = demo(ints[i], sb);
        }
        for (StringBuffer s : sb){
            list.add(s.toString());
        }
        return list;
    }

    public List<StringBuffer> demo(int index,List<StringBuffer> sb) {
        ArrayList<StringBuffer> strs = new ArrayList<>();
        for (int i = 0; i < chars[index].length; i++) {
            if (sb != null) {
                for (int j = 0; j < sb.size(); j++) {
                    strs.add(new StringBuffer().append(chars[index][i]).append(sb.get(j)));
                }
            } else {
                    strs.add(new StringBuffer().append(chars[index][i]));
            }

        }
        return strs;
    }

}
