/**
 * @Author Jacky Zou
 * @Date 2022/7/11 8:34
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        MagicDictionary magicDictionary = new MagicDictionary();
        String[] dictionary  = new String[]{"hello", "leetcode"};
    }

}
class MagicDictionary {
    private String[] strs;

    public MagicDictionary() {
    }

    public void buildDict(String[] dictionary) {
        strs = new String[dictionary.length];
        for (int i = 0; i < dictionary.length; i++) {
            strs[i] = dictionary[i];
        }
    }

    public boolean search(String searchWord) {
        int count = 0;
        for(String s : strs){
            if(s.length() == searchWord.length() && !s.equals(searchWord)){
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) != searchWord.charAt(i)){
                        count++;
                    }
                    if (count == 2) break;
                }
                if(count == 1) return true;
                count = 0;
            }
        }
        return false;
    }
}
