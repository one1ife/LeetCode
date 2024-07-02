/**
 * @Author Jacky Zou
 * @Date 2022/9/21 9:16
 * @Version 1.0
 */

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author Jacky Zou
 * @Date 2024/6/27 18:58
 * @Version 1.1
 */
public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        String multiply = solution.multiply("123", "456");
        solution.multiply("2", "3");

        System.out.println(1);


    }
}
class Solution {
    public String multiply(String num1, String num2) {
        List<StringBuilder> sList = new ArrayList<StringBuilder>();
        int tem = 0;
        int count = -1;
        for (int i = num1.length() - 1; i >= 0; i--) {
            StringBuilder sb = new StringBuilder("");
            for (int j = num2.length() - 1; j >= 0; j--) {
                int n = num1.charAt(i) - '0';
                int m = num2.charAt(j) - '0';
                //转换
                String s =(tem +  m * n) % 10 + "";
                tem = m * n / 10;
                sb.append(s);
            }
            count++;
            sb = sb.append(tem);

            tem = 0;
            for (int j = 0; j < count; j++) {
                sb = new StringBuilder("0" + sb);
            }
            sList.add(sb.reverse());



        }

        BigInteger b = new BigInteger("0");

        for(StringBuilder s : sList){
            b= b.add(new BigInteger(s.toString()));
        }

        return b.toString();

    }

    // BigInteger
    public String multiply1(String num1, String num2) {

        BigInteger b = new BigInteger(num1);
        BigInteger b2 = new BigInteger(num2);


        return b.multiply(b2).toString();
    }
}
