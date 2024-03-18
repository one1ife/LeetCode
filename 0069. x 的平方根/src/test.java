/**
 * @Author Jacky Zou
 * @Date 2024/3/8 9:25
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        test test = new test();
        int i = test.mySqrt2(37);
        System.out.println(i);
    }

    //二分查找
    public int mySqrt(int x) {

        if(x == 0) return 0;
        if(x == 1) return 1;

        int start = 1;
        int end = x / 2;
        while (start < end){
            if(end * end > x) {
                end--;
            }else {
                return end;
            }
            if((start + 1) *  (start + 1) > x){
                return start;
            }
        }

        return start;

    }

    public int mySqrt1(int x) {
        int start = 1;
        int end = x;
        //乘法溢出
        while (start <= end){
            int mid = (start + end) / 2;
            if(mid * mid > x){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }

        return end;

    }

    public int mySqrt2(int x) {
        int start = 1;
        int end = x;
        //乘法溢出
        while (start <= end){
            int mid = (start + end) / 2;
            if(x / mid < mid){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }

        return end;

    }
}
