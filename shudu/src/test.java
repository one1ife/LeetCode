import java.util.Arrays;

/**
 * @Author Jacky Zou
 * @Date 2022/8/26 9:28
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        int[][] demo = demo();
        for (int [] i : demo){
            System.out.println(Arrays.toString(i));
        }


    }
    public static int[][] demo(){
        return new int[][]{
                {1, 5, 6, 4, 3, 2},
                {2, 3, 1, 6, 5, 4},
                {4, 1, 5, 2, 6, 3},
                {3, 4, 2, 5, 1, 6},
                {6, 2, 3, 1, 4, 5},
                {5, 6, 4, 3, 2, 1}
        };
    }
}


