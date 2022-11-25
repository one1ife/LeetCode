///**
// * @Author Jacky Zou
// * @Date 2022/9/13 9:24
// * @Version 1.0
// */
//public class test {
//    public static void main(String[] args) {
////        System.out.println(Integer.parseInt('1' + ""));
//        Solution solution = new Solution();
//        int i = solution.maximumSwap(9973);
//        System.out.println(i);
//    }
//}
//class Solution {
//    public int maximumSwap(int num) {
//        char[] chars = Integer.toString(num).toCharArray();
//        for (int i = 0; i < chars.length - 1; i++) {
//           int temp = new Integer(chars[i] + "");
//           int max = temp;
//           int index = i;
//            for (int j = i + 1; j < chars.length; j++) {
//                int n = new Integer(chars[j] + "");
//                if(n >= max){
//                    max = n;
//                    index = j;
//                }
//            }
//            if(max > temp){
//                chars[i] ^= chars[index];
//                chars[index] ^= chars[i];
//                chars[i] ^= chars[index];
//                return new Integer(new String(chars));
//            }
//        }
//        return num;
//    }
//}
class s{
    public static void main(String[] args) {
        String a = new String("myString");
        String b = "myString";
        String c = "my" + "String";
        String d = c;
        System.out.print(a == b);
        System.out.print(a == c);
        System.out.print(b == c);
        System.out.print(b == d);
    }
}
