import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @Author Jacky Zou
 * @Date 2022/8/12 8:18
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        List<List<Integer>> lists = solution.groupThePeople(new int[]{2,1,3,3,3,2});
        lists.forEach(System.out::println);
    }
}
class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> lists = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i : groupSizes) {
            set.add(i);
        }
        for (int i : set){
            List<Integer> count = count(i, groupSizes);
            if (count.size() == i){
                lists.add(count);
            }else {
                ArrayList<Integer> list1 = new ArrayList<>();
                for (int j = 0; j < count.size(); j++) {

                    list1.add(count.get(j));
                    if((j + 1) % i == 0 ) {
                        ArrayList<Integer> list2 = new ArrayList<>();
                        list2.addAll(list1);
                        lists.add(list2);
                        list1.clear();
                    }
                }
            }
        }
        return lists;
    }

    public List<Integer> count(int i,int[] ints){
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j < ints.length; j++) {
            if (i == ints[j]) list.add(j);
        }
        return list;
    }

}

//HashMap
class Solution1 {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> lists = new ArrayList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            if(map.get(groupSizes[i]) == null){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(groupSizes[i],list);
            }else {
                map.get(groupSizes[i]).add(i);
            }
            if (map.get(groupSizes[i]).size() == groupSizes[i]){
                ArrayList<Integer> list1 = new ArrayList<>();
                list1.addAll(map.get(groupSizes[i]));
                lists.add(list1);
                map.get(groupSizes[i]).clear();
            }
        }
        return lists;
    }
}