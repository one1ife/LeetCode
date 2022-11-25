package 其他;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class demo04 {
    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        List<List<Integer>> generate = solution4.generate(5);
        List<Integer> list = new ArrayList<>();
        generate.forEach(System.out::println);
    }
}
class Solution4 {
    public List<List<Integer>> generate(int numRows) {
        //1.声明并初始化二维数组
        ArrayList<List<Integer>> list = new ArrayList<>();
        int[][] arr = new int[numRows][];
        //2.给数组的元素赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];
            ArrayList<Integer> integers = new ArrayList<>(i + 1);
            //2.1给首末元素赋值
            arr[i][0] = arr[i][i] = 1;
            integers.add(0, 1);
            //2.2给中间元素赋值
            if (i >= 2) {
                for (int j = 1; j < i; j++) {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                    integers.add(arr[i][j]);
                }
            }
            if(i > 0) integers.add(1);
            list.add(integers);
        }
        return list;
    }
}
