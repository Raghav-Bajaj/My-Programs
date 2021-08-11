import java.util.*;

class Main {
    public static Scanner scn = new Scanner(System.in);

    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       if(l1 == null) return l2 ;
       if(l2 == null) return l1 ;
       l1 = reverse(l1);
       l2 = reverse(l2);
       ListNode dummy  = new ListNode(-1);
       ListNode pre = dummy ;
       ListNode c1 = l1 ;
       ListNode c2 = l2 ;
       int carry = 0 ;
       while(c1 != null && c2 != null)
       {
           int num = c1.val + c2.val + carry ;
           carry = num / 10 ;
           pre.next = new ListNode(num%10);
           pre = pre.next ;
           c1 = c1.next ;
           c2 = c2.next ;
       }
       while(c1 != null)
       {
             int num = c1.val + carry ;
           carry = num / 10 ;
           pre.next = new ListNode(num%10);
           pre = pre.next ;
           c1 = c1.next ; 
       }
       while(c2 != null)
       {
             int num =  c2.val + carry ;
           carry = num / 10 ;
           pre.next = new ListNode(num%10);
           pre = pre.next ;
           c2 = c2.next ;
       }
       dummy = reverse(dummy.next);
       return dummy ;
    }
      public static ListNode reverse(ListNode head) {
      if(head == null || head.next == null)
            return head ;
        ListNode curr = head ;
        ListNode pre = null ;
        ListNode next = null ;
        while(curr != null)
        {
            next = curr.next ;
            curr.next = pre ;
            pre = curr ;
            curr = next ;
        }
        return pre;
    }

    // InFput_code===================================================

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static ListNode makeList(int n) {
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head1 = makeList(scn.nextInt());
        ListNode head2 = makeList(scn.nextInt());

        ListNode ans = addTwoNumbers(head1, head2);
        printList(ans);
    }

}
