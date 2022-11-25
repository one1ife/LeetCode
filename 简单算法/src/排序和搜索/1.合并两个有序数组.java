/**
 * @Author Jacky Zou
 * @Date 2022/6/13 8:47
 * @Version 1.0
 */
package 排序和搜索;

import java.util.Arrays;

class Demo01 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        Solution solution = new Solution();
        solution.merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }
}

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m == 0){
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }else if (n == 0){
            return;
        }
        int j = (m + n - 1);
        m--;
        n--;
        boolean b = true;
        while (j >= 0){
            if(nums1[m] > nums2[n] && b){
                nums1[j] = nums1[m];
                j--;
                if (m != 0) {
                    m--;
                }else {
                    b = false;
                }
            }else if(nums1[m] <= nums2[n] || m == 0){
                nums1[j] = nums2[n];
                j--;
                n--;
                if (n == -1) return;
            }
        }
    }
}