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

  public static ListNode subtractTwoNumbers(ListNode l1, ListNode l2) {
    if(l1 == null) return l2 ;
       if(l2 == null) return l1 ;
       l1 = reverse(l1);
       l2 = reverse(l2);
       ListNode dummy  = new ListNode(-1);
       ListNode pre = dummy ;
       ListNode c1 = l1 ;
       ListNode c2 = l2 ;
       int borrow = 0 ;
       while(c1 != null && c2 != null)
       {
           int num = c1.val - c2.val + borrow;
           if(num < 0)
           {
               num += 10 ;
               borrow = -1 ;
               
           }else{
               borrow = 0 ;
           }
           pre.next = new ListNode(num);
           pre = pre.next ;
           c1 = c1.next ;
           c2 = c2.next ;
       }
        boolean  check = true ;
       if(borrow != 0)
       {
           check = false ;
           
       }
       while(c1 != null && check == false)
       {
           int num = c1.val  - 1;
           if(num < 0)
           {
               num += 10 ;
           }else{
               check = true ;
           }
           pre.next = new ListNode(num);
           pre = pre.next ;
           c1 = c1.next ;
       }
       if(c1 != null)
       {
            pre.next = c1 ;
           pre = pre.next ;
       }


       dummy = reverse(dummy.next);
       while(dummy != null && dummy.next != null && dummy.val == 0)
       {
           dummy = dummy.next ;
       }
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

    ListNode ans = subtractTwoNumbers(head1, head2);
    printList(ans);
  }

}
