import java.util.HashSet;
import java.util.Set;

/**
 * @Author Jacky Zou
 * @Date 2024/2/28 9:36
 * @Version 1.0
 */

public class test {
    public static void main(String[] args) {

    }
}

//哈希表
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<ListNode>();
        while (head != null) {
            if (!seen.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}

class ListNode {
    int val;
 ListNode next;
 ListNode(int x) {
     val = x;
 next = null;
 }
}
