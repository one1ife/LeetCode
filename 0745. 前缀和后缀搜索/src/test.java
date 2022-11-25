/**
 * @Author Jacky Zou
 * @Date 2022/7/14 8:18
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        WordFilter wordFilter = new WordFilter(new String[]{"apple"});
        int f = wordFilter.f("a", "e");
        System.out.println(f);
    }
}
class WordFilter {

    private String[] strs;

    public WordFilter(String[] words) {
        strs=words;
    }

    public int f(String pref, String suff) {
        for (int i = strs.length - 1; i >= 0; i--) {
            if(strs[i].startsWith(pref) && strs[i].endsWith(suff)){
                return i;
            }
        }
        return -1;
    }
}

/**
 * Your WordFilter object will be instantiated and called as such:
 * WordFilter obj = new WordFilter(words);
 * int param_1 = obj.f(pref,suff);
 */
