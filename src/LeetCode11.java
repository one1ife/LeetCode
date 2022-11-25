///**
// * @Author Jacky Zou
// * @Date 2022/1/11 16:49
// * @Version 1.0
// */
//
////11. 盛最多水的容器
//public class LeetCode11 {
//    public static void main(String[] args) {
//        Solution1 test = new Solution1();
//        int[] arr = new int[]{1,2,3,4};
//        System.out.println(test.maxArea1(arr));
//    }
//}
//
////双循环遍历：超时
//class Solution {
//    public int maxArea(int[] height) {
//        int area = 0;
//        int temp = 0;
//        for(int i = 0;i < height.length - 1;i++){
//            for(int j = i + 1;j < height.length;j++){
//
//                if(height[j] <= height[i]){
//                    area = (j - i) * height[j];
//                }else {
//                    area = (j - i) * height[i];
//                }
//
//                if(area > temp){
//                    temp = area;
//                }
//            }
//        }
//        return temp;
//    }
//}
//
////双指针
//class Solution1 {
//    public int maxArea1(int[] height) {
//        int l = 0, r = height.length - 1;
//        int ans = 0;
//        while (l < r) {
//            int area = Math.min(height[l], height[r]) * (r - l);
//            ans = Math.max(ans, area);
//            if (height[l] <= height[r]) {
//                ++l;
//            }
//            else {
//                --r;
//            }
//        }
//        return ans;
//    }
//}
