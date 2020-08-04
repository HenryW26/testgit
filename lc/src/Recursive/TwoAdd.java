package Recursive;

public class TwoAdd {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode head = new ListNode(0);
       ListNode cur = head,p=l1,q=l2;
       int carry = 0;
       while(p!=null||q!=null){
           int x = p==null?0:p.val;
           int y = q==null?0:q.val;
           int sum = x+y+carry;
           carry = sum/10;
           int val = sum%10;
           cur.next = new ListNode(val);
           cur=cur.next;
           if(p!=null){
               p=p.next;
           }
           if(q!=null){
               q=q.next;
           }
       }
       if(carry==1){
           cur.next = new ListNode(1);
       }
       return head.next;
    }
}
