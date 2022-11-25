package 链表;

/**
 * @Author Jacky Zou
 * @Date 2022/4/7 16:09
 * @Version 1.0
 */
class demo1{
    public static void main(String[] args) {

    }
}

class Solution1 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}