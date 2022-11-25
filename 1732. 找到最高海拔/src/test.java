/**
 * @Author Jacky Zou
 * @Date 2022/11/19 16:12
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {

    }
}
class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int temp = 0;
        for(int i : gain){
            temp += i;
            if(temp > max){
            max = temp;
                }
        }
        return max;
    }
}
