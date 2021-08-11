import java.util.*;

class Main {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void unfold(ListNode head) {
    ListNode a = head ;
    ListNode b = head.next ;
    ListNode pre1 = a ;
    ListNode pre2 = b ;
    ListNode f = b.next ;
    while(f != null&& f.next != null)
    {
        pre1.next = f ;
        pre2.next = f.next ;
        pre1 = pre1.next ;
        pre2 = pre2.next ;
        f = f.next.next ;
        
    }
    b = reverse(b);
    pre1.next = b ;
    
    
    }
     public static ListNode reverse(ListNode hh)
    {     if(hh == null || hh.next == null)
            return hh ;
        ListNode curr = hh ;
    ListNode next = null ;
    ListNode pre = null ;
    while(curr != null)
    {
        next = curr.next ;
        curr.next = pre ;
        pre = curr ;
        curr = next ;
    }
    hh = pre ;
    return hh ;
    }
    static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
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

        ListNode head = dummy.next;
        unfold(head);
        printList(head);
    }
}
