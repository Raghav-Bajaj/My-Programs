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

    public static ListNode segregate012(ListNode head) {
       if(head == null || head.next == null)
       return head ;
       ListNode dum_1 = new ListNode(-1);
       ListNode dum_0 = new ListNode(-1);
       ListNode itr_1 = dum_1 ;
       ListNode dum_2 = new ListNode(-1);
       ListNode itr_2 = dum_2 ;
       ListNode itr_0 = dum_0 ;
       ListNode curr = head ;
       while(curr != null)
       {
           if(curr.val == 0)
           {
               itr_0.next = new ListNode(0);
               itr_0 = itr_0.next ;
           }else if(curr.val == 1){
                itr_1.next = new ListNode(1);
               itr_1 = itr_1.next ;
           }else{
                itr_2.next = new ListNode(2);
               itr_2 = itr_2.next ;
           }
           curr = curr.next ;
       }
        itr_1.next = dum_2.next ;
        itr_0.next = dum_1.next ;
       
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
        h1 = segregate012(h1);
        printList(h1);
    }
}
