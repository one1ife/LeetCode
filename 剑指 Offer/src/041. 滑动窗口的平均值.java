import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author Jacky Zou
 * @Date 2022/7/16 9:24
 * @Version 1.0
 */
class test041 {
    public static void main(String[] args) {
        MovingAverage movingAverage = new MovingAverage(3);
        double next = movingAverage.next(1);
        System.out.println(next);
        double next1 = movingAverage.next(10);
        System.out.println(next1);
        double next2 = movingAverage.next(3);
        System.out.println(next2);
        double next3 = movingAverage.next(5);
        System.out.println(next3);
    }

}

class MovingAverage {

    private List<Integer> list;
    int size = 0;
    int start = 0;

    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        this.size = size;
        list = new ArrayList<>();
    }

    public double next(int val) {
        if(list.size() < size){
            list.add(val);
        }else {
            list.add(val);
            start++;
        }
        double sum = 0;
        for(int i = start;i < list.size();i++){
            sum += list.get(i);
        }
        return sum / (list.size() - start);
    }


}

class MovingAverage1 {

    private int sum;
    private int elementSize;
    private int[] temp;

    public MovingAverage1(int size) {
        this.temp = new int[size];
    }

    public double next(int val) {
        elementSize++;
        sum += val;
        int pos = (elementSize - 1) % temp.length;
        if (elementSize > temp.length) {
            sum -= temp[pos];
        }
        temp[pos] = val;
        return (double) sum / (elementSize > temp.length ? temp.length : elementSize);

    }


}

