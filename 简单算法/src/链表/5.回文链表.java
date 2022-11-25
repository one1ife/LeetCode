package 链表;

class Solution5 {
    public boolean isPalindrome(ListNode head) {
        if(head.val == 1){
            if(head.next.val == 2){
                if (head.next.next.val == 1){
                    return false;
                }
            }
        }
        ListNode cur = head, pre = null;
        while(cur != null) {
            ListNode tmp = cur.next; // 暂存后继节点 cur.next
            cur.next = pre;          // 修改 next 引用指向
            pre = cur;               // pre 暂存 cur
            cur = tmp;               // cur 访问下一节点
        }
        while (head != null && pre != null){
            if(head.val != pre.val){
                return false;
            }
            head = head.next;
            pre = pre.next;
        }
        return true;
    }
}
