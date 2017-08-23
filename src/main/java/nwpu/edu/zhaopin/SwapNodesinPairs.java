package nwpu.edu.zhaopin;

/**
 * Created by chunk on 2017/8/21.
 */
public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode listNode;
        listNode  = head.next;
        head.next = swapPairs(head.next.next);
        listNode.next = head;
        return listNode;
    }
}
