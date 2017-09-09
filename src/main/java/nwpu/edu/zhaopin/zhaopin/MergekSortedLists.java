package nwpu.edu.zhaopin.zhaopin;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chunk on 2017/8/21.
 */
public class MergekSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {

        if (lists.length==0){
            return null;
        }
        if (lists.length==1){
            return lists[0];
        }
        List<ListNode> listNodes = new ArrayList<ListNode>();
        for (int i = 0; i<lists.length ;i ++){
            listNodes.add(lists[i]);
        }
        while (listNodes.size()>2){
            listNodes = mergeKListsErFen(listNodes);
        }
        return mergeTwoLists(listNodes.get(0),listNodes.get(1));
    }

    public List<ListNode> mergeKListsErFen(List<ListNode> lists) {
        ArrayList<ListNode> listNodes = new ArrayList<ListNode>();
        if (lists.size()==0){
            return null;
        }
        for (int i=0; i<lists.size()-1 ; i=i+2){
            listNodes.add(mergeTwoLists(lists.get(i), lists.get(i+1)));
            if (i+2 == lists.size()-1){
                listNodes.add(lists.get(i+2));
            }
        }
        return listNodes;
    }


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
