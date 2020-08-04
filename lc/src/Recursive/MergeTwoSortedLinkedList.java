package Recursive;

public class MergeTwoSortedLinkedList {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        else if(l2 == null){
            return l1;
        }
        else if(l1.val<l2.val){
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }
        else{
            l2.next=mergeTwoLists(l2.next,l1);
            return l2;
        }
    }

    public static void main(String[] args) {
        ListNode node0 = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        node0.next=node2;
        node2.next=node4;
        node1.next=node3;
        ListNode node = mergeTwoLists(node0,node1);
        while(node!=null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
