import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        HashMap<String, Long> map = new HashMap<>();

        map.put("语文",new Long(99));
        map.put("数学",new Long(100));
        map.put("英语",new Long(60));

        Map[] maps = new Map[3];
        maps[0] = map;
        maps[1] = map;
        maps[2] = map;

        System.out.println(Arrays.toString(maps));
    }
}
class Student {

    long math = 11L;

    long english  = 12L;

    @Override
    public String toString() {
        return "Student{" +
                "math=" + math +
                ", english=" + english +
                '}';
    }
}
