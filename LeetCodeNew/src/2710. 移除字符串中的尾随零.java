/**
 * @Author Jacky Zou
 * @Date 2024/6/29 10:09
 * @Version 1.0
 */

class Solution2710 {

    public String removeTrailingZeros(String num) {
        int index = num.length() - 1;
        for (int i = index; i >= 0 ; i--) {
            if(num.charAt(i) != '0') break;
            index--;

        }

        return num.substring(0,index + 1);
    }
}