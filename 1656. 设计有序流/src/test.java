import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class test {
}
class OrderedStream {

    String[] strs;
    int index = 0;

    public OrderedStream(int n) {
        strs = new String[n];
    }

    public List<String> insert(int idKey, String value) {
        strs[idKey - 1] = value;
        List<String> list = new ArrayList<>();
        for (int i = index;i < strs.length;i++){
            if (strs[i] == null){
                return list;
            }
            list.add(strs[i]);
            index = i + 1;
        }
        return list;
    }
}
