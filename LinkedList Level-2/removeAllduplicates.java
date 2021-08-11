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

    public static ListNode removeDuplicates(ListNode head) {
              ListNode curr =  head.next ;
              ListNode dummy = new ListNode(-1);
              
              ListNode itr = dummy ;
              itr.next = head ;
       while(curr != null)
       {
           boolean check = false ;
           while(curr != null && curr.val == itr.next.val)
           {
             curr = curr.next ;
             check =  true ;
           }
           
           if(check)
           {
           itr.next = curr ;
           }else{
               itr = itr.next ;
           }
           if(curr != null) curr = curr.next ;
       }
       return dummy.next;
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
        ListNode head = makeList(scn.nextInt());

        ListNode ans = removeDuplicates(head);
        printList(ans);
    }

}
