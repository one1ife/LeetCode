/**
 * @Author Jacky Zou
 * @Date 2022/7/19 17:43
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        MyCalendarTwo myCalendarTwo = new MyCalendarTwo();
        System.out.println(myCalendarTwo.book(10,20));
        System.out.println(myCalendarTwo.book(50,60));
        System.out.println(myCalendarTwo.book(10,40));
        System.out.println(myCalendarTwo.book(5,15));
        System.out.println(myCalendarTwo.book(5,10));
        System.out.println(myCalendarTwo.book(25,55));
    }

}
class MyCalendarTwo {
    private int[] ints = new int[100001];

    public MyCalendarTwo() {

    }

    public boolean book(int start, int end) {
        int index = start;
        while (index < end){
            if(ints[index] == 2) {
                while (index > start){
                    index--;
                    ints[index]--;
                }
                return false;
            }
            ints[index]++;
            index++;
        }
        return true;
    }
}

