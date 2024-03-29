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

    public static ListNode IntersectionNodeInTwoLL(ListNode headA, ListNode headB) {
        ListNode curr = headA ;
        while(curr.next != null)
            curr = curr.next ;
        curr.next = headB ;
        ListNode head = headA ;
    ListNode fast = head ;
    ListNode slow = head ;
    while(fast.next != null && fast.next.next != null)
    {
        fast = fast.next.next ;
        slow = slow.next ;
        if(fast == slow)
            break ;
            
    }
    slow = head ;
    while(fast != null)
    {
        if(fast == slow)
        {
            return slow ;
        }
        fast = fast.next ;
        slow = slow.next ;
    }
        return new ListNode(-1);
    }

    // Input_code===================================================

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

        int idx = scn.nextInt();

        ListNode head2 = makeList(scn.nextInt());

        if (idx >= 0) {
            ListNode curr = head1;
            while (idx-- > 0)
                curr = curr.next;

            ListNode prev = head2;
            while (prev.next != null)
                prev = prev.next;

            prev.next = curr;
        }

        ListNode ans = IntersectionNodeInTwoLL(head1, head2);
        System.out.println(ans != null ? ans.val : -1);
    }
}
