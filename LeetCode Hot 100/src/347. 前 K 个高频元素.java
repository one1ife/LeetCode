import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/**
 * @Author Jacky Zou
 * @Date 2022/8/17 21:27
 * @Version 1.0
 */


class test347 {
    public static void main(String[] args) {
        Solution347 solution338 = new Solution347();
        int[] ints = solution338.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
        System.out.println(Arrays.toString(ints));
    }
}
class Solution347 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums){
            if(map.get(i) == null){
                map.put(i,1);
            }else {
                map.put(i,map.get(i) + 1);
            }
        }
        Collection<Integer> values = map.values();
        int index = 0;
        Integer[] arr = new Integer[values.size()];
        for (Integer i : values){
            arr[index] = i;
            index++;
        }
        index = 0;

        Arrays.sort(arr);
        int[] ints = new int[k];

        for (int i = arr.length - 1;i >= arr.length - k;i--){
            Set<Integer> keys = map.keySet();
            for (Integer key : keys) {
                //通过每一个键key，来获取到对应的值
                if (map.get(key) == arr[i]){

                    ints[index] = key;
                    map.remove(key);
                    index++;
                    break;
                }


            }
        }
        return ints;

    }
}
