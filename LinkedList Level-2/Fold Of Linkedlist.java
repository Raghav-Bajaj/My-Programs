import java.util.*;

class Main {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void fold(ListNode head) {
           if(head == null || head.next == null)
            return  ;
    ListNode mid = middle(head);
    ListNode hh = mid.next ;
    mid.next = null ;
    hh = reverse(hh);
    ListNode c1 = head ;
     ListNode c2 = hh ;
      ListNode f1 = null ;
       ListNode f2 = null ;
       while(c2 != null)
       {
           f1 = c1.next ;
           f2 = c2.next ;
           c1.next = c2 ;
           c2.next = f1 ;
           c1 = f1 ;
           c2 = f2 ;
       }
    
    
   
    
    }
    public static ListNode middle(ListNode head)
    {
                if(head == null || head.next == null)
            return head ;
    ListNode slow = head ;
    ListNode fast = head ;
    while(fast.next != null && fast.next.next != null)
    {
        fast = fast.next.next ;
        slow = slow.next ;
    }
    return slow ;
    
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
        fold(head);
        printList(head);
    }
}
