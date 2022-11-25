import java.util.*;

class test075 {
    public static void main(String[] args) {
        Solution075 solution075 = new Solution075();
        int[] ints = solution075.relativeSortArray(new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19},
                new int[]{2, 1, 4, 3, 9, 6});
        System.out.println(Arrays.toString(ints));
    }

}
class Solution075 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] ints = new int[arr1.length];
        Map<Integer,Integer>  map = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i],1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            if(map.get(arr1[i]) == null){
                list.add(arr1[i]);
            }else {
                map.put(arr1[i],map.get(arr1[i]) + 1);
            }
        }
        int index = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int count = map.get(arr2[i]); count > 1; count--) {
                ints[index] = arr2[i];
                index++;
            }
        }
        Collections.sort(list);
        for (Integer i : list){
            ints[index] = i;
            index++;
        }
        return ints;
    }
}