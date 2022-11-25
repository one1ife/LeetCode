import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        List<String> list = solution.stringMatching(new String[]{"leetcode","et","code"});
        list.forEach(System.out::println);
    }
}
class Solution {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        for(String s : words){
            lable : for (String t : words){
                if(s.length() < t.length()) {
                    for (int i = 0; i <= t.length() - s.length(); i++) {
                        if (t.substring(i,i + s.length()).equals(s)){
                            list.add(s);
                            break lable;
                        }
                    }
                }

            }
        }
        return list;
    }
}
class Solution1 {
    public List<String> stringMatching(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            int index = i;
            while (index > 0) {
                index--;
                if (words[i].length() < words[index].length()) {
                    for (int j = 0; j <= words[index].length() - words[i].length(); j++) {
                        if (words[index].substring(j, j + words[i].length()).equals(words[i])) {
                            list.add(words[i]);
                            index = -1;
                            break;
                        }
                    }
                }
            }
                if (index == -1) index = words.length;
                while (index < words.length - 1) {
                    index++;
                    if (words[i].length() < words[index].length()) {
                        for (int j = 0; j <= words[index].length() - words[i].length(); j++) {
                            if (words[index].substring(j, j + words[i].length()).equals(words[i])) {
                                list.add(words[i]);
                                index = words.length;
                                break;
                            }
                        }
                    }
                }

            }

            return list;
        }
}
