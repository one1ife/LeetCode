/**
 * @Author Jacky Zou
 * @Date 2024/3/16 8:44
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {

    }

    public String reverseWords(String s) {
        // 根据空格转为数组
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String i : arr) {
            // 当前字符串长度
            int l = i.length();
            char[] as = i.toCharArray();
            // 双指针替换
            for (int j = 0; j < l / 2; j++) {
                char t = as[j];
                as[j] = as[l - j - 1];
                as[l - j - 1] = t;
            }
            sb.append(as);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
