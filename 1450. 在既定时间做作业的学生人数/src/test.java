public class test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.busyStudent(new int[]{9,8,7,6,5,4,3,2,1},
                new int[]{10,10,10,10,10,10,10,10,10}, 5);
        System.out.println(i);
    }
}
class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            if(startTime[i] <= queryTime){
                if(queryTime <= endTime[i] ){
                    count++;
                }
            }
        }
        return count;
    }
}