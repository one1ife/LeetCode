public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = solution.generateTheString(5);
        System.out.println(s);
    }
}
class Solution {
    public String generateTheString(int n) {
        StringBuffer sb = new StringBuffer();
        if(n % 2 == 0){
            sb.append('a');
            for (int i = 1; i < n; i++) {
                sb.append('b');
            }
            return sb.toString();
        }
        for (int i = 0; i < n; i++) {
            sb.append('a');
        }
        return sb.toString();

    }
}
class Solution1 {
    public String generateTheString(int n) {
        return (n & 1) > 0 ? "a".repeat(n) : "a".repeat(n - 1) + "b";
    }
}
