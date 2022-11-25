/**
 * @Author Jacky Zou
 * @Date 2022/6/21 16:52
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = solution.defangIPaddr("255.100.50.0");
        System.out.println(s);
    }
}
class Solution {
    public String defangIPaddr(String address) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.'){
                stringBuffer.append("[.]");
            }else {
                stringBuffer.append(address.charAt(i));
            }

        }
        return stringBuffer.toString();
    }
}
