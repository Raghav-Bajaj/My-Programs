import java.util.*;

class Main {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode segregateEvenOdd(ListNode head) {
        if(head == null || head.next == null)
            return head ;
        ListNode even = new ListNode(-1);
        ListNode odd = new ListNode(-1);
        ListNode even_pre = even ;
        ListNode odd_pre = odd ;
        ListNode curr = head ;
        while(curr != null)
        {
            if(curr.val % 2 == 0 )
            {
             
               even_pre.next = new ListNode(curr.val) ;
               even_pre = even_pre.next ;
            }else{
                odd_pre.next = new ListNode(curr.val);
                odd_pre = odd_pre.next ;
            }
            curr = curr.next ;
        }
      
        even_pre.next = odd.next ;
        return even.next ;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        ListNode head = segregateEvenOdd(dummy.next);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
