/**
 * 两数之和
 * @Author Jacky Zou
 * @Date 2023/1/2 8:58
 * @Version 1.0
 */


//1.按位求和
//2.进位
public class  test {
    public static void main(String[] args) {

    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode n1 = l1;
        ListNode n2 = l2;

        //遍历链表
        while (n1 != null){
            if(n2 != null){
                n1.val += n2.val;
                n2 = n2.next;
            }

            if(n1.val >= 10){
                if(n1.next == null){
                    n1.next = new ListNode(0);
                }

                n1.val = n1.val % 10;
                n1.next.val++;

            }
            if(n1.next == null && n2 != null){
                n1.next = n2;
                break;
            }

            n1 = n1.next;
        }

        return l1;
    }
}