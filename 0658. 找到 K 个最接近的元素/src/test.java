/**
 * @Author Jacky Zou
 * @Date 2022/8/25 8:46
 * @Version 1.0
 */
import java.util.ArrayList;
import java.util.List;

public class test {
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= x) index = i + 1;
        }
        if(index <= 0){
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < k; i++) {
                list.add(arr[i]);
            }
            return list;
        }
        if(index >= arr.length){
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = arr.length - k - 1; i < arr.length; i++) {
                list.add(arr[i]);
            }
            return list;
        }
        ArrayList<Integer> list = new ArrayList<>();
        int left = index - 1;
        int right = index;
        while (list.size() <= k){
            if()
        }

    }
}
