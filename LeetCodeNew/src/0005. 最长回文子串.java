/**
 * @Author Jacky Zou
 * @Date 2024/6/25 19:07
 * @Version 1.0
 */
class Solution0005 {

    public static void main(String[] args) {
        Solution0005 solution0005 = new Solution0005();
        String babad = solution0005.longestPalindrome("abbc");
        System.out.println(babad);

    }


    //双指针对比
    public String longestPalindrome(String s) {

        if(s.length() <= 1) return s;
        String str = "" +  s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            int start = i;
            int j = s.length() - 1;
            boolean b = false;
            int end = j;
            int head = i;
            while (start < j){
                if(s.charAt(start) == s.charAt(j)){
                    if(!b) {
                        end = j + 1;
                        head = start;
                    }
                    b = true;
                    start++;
                    j--;
                }else {
                    if(b) j = end - 1;
                    b = false;
                    start = head;
                    j--;
                }
            }
            if(b){
                String temp = s.substring(head,end);
                if(temp.length() > str.length()) str = temp;
            }

        }
        return str;
    }

    //双指针
    public String search(String s){

        if(s.length() <= 1) return s;
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            int start = i;
            int j = s.length() - 1;
            boolean b = false;
            int end = j;
            while (start < j){
                if(s.charAt(start) == s.charAt(j)){
                    if(b) end = j;
                    b = true;
                    start++;
                    j--;
                }else {
                    b = false;
                    j--;
                }
            }
            String temp = s.substring(start,end);
            if(temp.length() > str.length()) str = temp;
        }
        return str;
    }

}