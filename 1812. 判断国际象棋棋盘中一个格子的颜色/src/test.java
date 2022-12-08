/**
 * @Author Jacky Zou
 * @Date 2022/12/8 10:04
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {

    }
}
class Solution {
    public boolean squareIsWhite(String coordinates) {
        // 计算坐标的横坐标和纵坐标，以字母的 ASCII 码作为横坐标
        int x = coordinates.charAt(0) - 'a' + 1;
        int y = coordinates.charAt(1) - '0';
        // 如果横坐标和纵坐标同奇或同偶，返回 true，否则返回 false
        return (x % 2 != y % 2);
    }
}