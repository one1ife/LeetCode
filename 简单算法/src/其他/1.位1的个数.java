package 其他;

class demo01 {
    public static void main(String[] args) {
        Solution01 solution01 = new Solution01();
        int i = solution01.hammingWeight(5);
        System.out.println(i);
    }
}
class Solution01 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1') count++;
        }
        return count;
    }
}