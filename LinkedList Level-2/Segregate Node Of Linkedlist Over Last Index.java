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

    public static ListNode segregateOnLastIndex(ListNode head) {
      if(head == null || head.next == null)
        return head ;
        ListNode val = head ;
        while(val.next != null) val = val.next ;
        int temp = val.val ;
        ListNode dum_2 = new ListNode(-1);
        ListNode dum_0 = new ListNode(-1);
       ListNode itr_2 = dum_2 ;
       ListNode itr_0 = dum_0 ;
      ListNode curr = head ;
       while(curr != null)
       {
           if(curr.val > temp)
           {
                itr_2.next = new ListNode(curr.val);
               itr_2 = itr_2.next ;
           }
           curr = curr.next ;
       }
        
        itr_0.next = val  ;
        itr_0 = itr_0.next ;
        itr_0.next = dum_2.next ;
       
        return dum_0.next ;
        
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static ListNode createList(int n) {
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        ListNode h1 = createList(n);
        h1 = segregateOnLastIndex(h1);
        printList(h1);
    }
}
