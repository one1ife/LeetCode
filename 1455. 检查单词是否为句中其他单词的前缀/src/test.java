public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int prefixOfWord = solution.isPrefixOfWord("this problem is an easy problem", "pro");
        System.out.println(prefixOfWord);
    }
}
class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] strs = sentence.split(" ");
        for (int i = 0; i < strs.length; i++) {
            if(strs[i].length() >= searchWord.length()){
                if(strs[i].substring(0,searchWord.length()).equals(searchWord)){
                    return i + 1;
                }
            }
        }
        return -1;
    }
}