/**
 * @Author Jacky Zou
 * @Date 2022/7/24 9:06
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.distanceBetweenBusStops(new int[]{1,2,3,4}, 0, 1);
        System.out.println(i);
    }
}
class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int count1 = 0;
        int count2 = 0;
        boolean b = false;
        for (int i = 0; i < distance.length; i++) {
            int index = (start+ i) % distance.length;
            if(index == destination){
                b=true;
            }
            if(!b){
                count1 += distance[index];
            }
            if(b){
                count2 += distance[index];
            }
        }
        return Math.min(count1,count2);
    }
}
