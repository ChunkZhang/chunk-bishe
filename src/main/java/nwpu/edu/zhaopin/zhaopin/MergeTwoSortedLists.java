package nwpu.edu.zhaopin.zhaopin;

/**
 * Created by chunk on 2017/8/18.
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null){
            return l2;
        }
        if (l2==null){
            return l1;
        }
        ListNode listNode ;
        if (l1.val < l2.val){
            listNode = l1;
            listNode.next = mergeTwoLists(l1.next,l2);
        }else {
            listNode = l2;
            listNode.next = mergeTwoLists(l1, l2.next);
        }
        return listNode;
    }
}


//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }
