/**
 * @Author Jacky Zou
 * @Date 2022/6/22 8:49
 * @Version 1.0
 */
package 其他;

import java.util.ArrayList;

class test05 {
    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        boolean valid = solution5.isValid("]");
        System.out.println(valid);

    }
}
class Solution5 {
    public boolean isValid(String s) {
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '{' || c == '[' || c == '('){
                list.add(c);
            }
            if (list.size() == 0) {
                return false;
            }
            switch (c){
                case '}':
                    if(list.get(list.size() - 1) != '{'){
                        return false;
                    }else {
                        list.remove(list.size() - 1);
                    }
                    break;
                case ']':
                    if(list.get(list.size() - 1) != '['){
                        return false;
                    }else {
                        list.remove(list.size() - 1);
                    }
                    break;
                case ')':
                    if(list.get(list.size() - 1) != '('){
                        return false;
                    }else {
                        list.remove(list.size() - 1);
                    }
                break;
            }
        }
        if (list.size() >= 1) return false;
        return true;
    }
}

