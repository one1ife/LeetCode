//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import static javax.print.attribute.standard.MediaSizeName.A;
//
//class test056 {
//    public static void main(String[] args) {
//        Solution056 solution056 = new Solution056();
//        int[][] merge = solution056.merge(new int[][]{{1,4},{0,1}});
//        for (int i = 0; i < merge.length; i++) {
//            for (int j = 0; j < merge[i].length; j++) {
//                System.out.println(merge[i][j]);
//            }
//            System.out.println();
//        }
//    }
//}
////class Solution056 {
////    public int[][] merge(int[][] intervals) {
////        ArrayList<int[]> list = new ArrayList<>();
////        int[] ints = new int[2];
////        ints[0] = intervals[0][0];
////        boolean b = true;
////        for (int i = 1; i < intervals.length; i++) {
////             ints[1] = intervals[i - 1][1];
////            if(intervals[i][0] <= ints[1]){
////                if(intervals[i][0] < ints[0]) ints[0]=intervals[i][0];
////                if(ints[1] > intervals[i][1]){
////                    b=false;
////                }else {
////                    ints[1] = intervals[i][1];
////                }
////            }else {
////                int[] ints1 = new int[]{ints[0],ints[1]};
////                ints[0] = intervals[i][0];
////                list.add(ints1);
////                b = true;
////            }
////
////        }
////        if(b) ints[1] = intervals[intervals.length - 1][1];
////        list.add(ints);
////        int[][] i = new int[list.size()][2];
////        for (int j = 0; j < list.size(); j++) {
////            i[j] = list.get(j);
////        }
////        return i;
////    }
////}
//class Solution {
//    public int[][] merge(int[][] intervals) {
//        ArrayList<int[]> list = new ArrayList<>();
//        int[] ints = new int[2];
//        int[] ints1 = new int[intervals.length * 2];
//        int start = 0;
//        int end = 1;
//        for (int i = 1; i < ints1.length; i = i + 2) {
//            if(ints1[i] > ints[i + 1]){
//                end = i + 1;
//            }else {
//                Arrays.
//                start=i+1;
//            }
//        }
//    }
//
//}