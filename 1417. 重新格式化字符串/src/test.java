public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String a0b1c2 = solution.reformat("a0b1c2");
        System.out.println(a0b1c2);
    }
}
class Solution {
    public String reformat(String s) {
        StringBuffer sbNum = new StringBuffer();
        StringBuffer sbLet = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if ('0' <= s.charAt(i) && s.charAt(i) <= '9') {
                sbNum.append(s.charAt(i));
            } else {
                sbLet.append(s.charAt(i));
            }
        }
        String letStr = sbLet.toString();
        String numStr = sbNum.toString();
        StringBuffer sb = new StringBuffer();
        if (letStr.length() > numStr.length()) {
            if (letStr.length() - numStr.length() > 1) return "";
            sb.append(letStr.substring(0, 1));
            letStr = letStr.substring(1);
            for (int i = 0; i < numStr.length(); i++) {
                sb.append(numStr.charAt(i) + "" + letStr.charAt(i));
            }
            return sb.toString();
        }
        if (letStr.length() < numStr.length()) {
            if (numStr.length() - letStr.length() > 1) return "";
            sb.append(numStr.substring(0, 1));
            numStr = numStr.substring(1);
            for (int i = 0; i < numStr.length(); i++) {
                sb.append(letStr.charAt(i) + "" + numStr.charAt(i));
            }
            return sb.toString();
        }

        if (letStr.length() == numStr.length()) {
            for (int i = 0; i < numStr.length(); i++) {
                sb.append(numStr.charAt(i) + "" + letStr.charAt(i));
            }
        }
        return sb.toString();
    }
}
//双指针
//class Solution1 {
//    public String reformat(String s) {
//        int num = 0;
//    }
//}