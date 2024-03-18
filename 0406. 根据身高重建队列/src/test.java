import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class test {
    public static void main(String[] args) {
        test test = new test();
        int[][] ints = new int[][]{{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        int[][] ints1 = test.reconstructQueue(ints);

    }

    // 先排序后插队
    // 核心思想：高个子先站好位，矮个子插入到K位置上，前面肯定有K个高个子，矮个子再插到前面也满足K的要求
    public int[][] reconstructQueue(int[][] people) {
        /*
        如果返回的数据等于0，那么说明两个数据相等；
        如果返回的数据小于0，那么说明左边数据比右边数据小；
        如果返回的数据大于0，那么说明左边数据比右边数据大；
         */
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] != o2[0]) {
                    return o2[0] - o1[0];
                }else {
                    return  o1[1] - o2[1];
                }
            }
        });

        LinkedList<int[]> list = new LinkedList<>();
        for (int[] i : people) {
            list.add(i[1], i);
        }

        return list.toArray(new int[list.size()][2]);
    }
}
