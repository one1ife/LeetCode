/**
 * @Author Jacky Zou
 * @Date 2022/6/17 8:33
 * @Version 1.0
 */
package 数学;

import java.util.ArrayList;
import java.util.List;

class demo01 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> list = solution.fizzBuzz(5);
        list.forEach(System.out::println);
    }
}

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            if(i % 15 == 0){
                list.add("FizzBuzz");
            }else if(i % 5 == 0){
                list.add("Buzz");
            }else if (i % 3 == 0){
                list.add("Fizz");
            }else {
                list.add("" + i);
            }
        }

        return list;
    }
}
