import java.util.ArrayList;
import java.util.List;

/**
 * @Author Jacky Zou
 * @Date 2022/7/7 8:23
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
//        dictionary = ["cat","bat","rat"], sentence = "the cattle was rattled by the battery"
        ArrayList<String> list = new ArrayList<>();
        list.add("cat");
        list.add("bat");
        list.add("rat");
        String s = "the cattle was rattled by the battery";
        Solution solution = new Solution();
        String s1 = solution.replaceWords(list, s);
        System.out.println(s1);
    }
}
class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        StringBuffer str = null;
        String[] strings = sentence.split(" ");
        for (int i = 0; i < strings.length; i++) {
            for(String s : dictionary){
                if(strings[i].indexOf(s) == 0 && s.length() <= strings[i].length()) {
                    strings[i] = s;
                }
            }
            if(str == null){
                str = new StringBuffer(strings[i]);
            }else {
                str.append(" " + strings[i]);
            }

        }
        return str.toString();
    }
}
