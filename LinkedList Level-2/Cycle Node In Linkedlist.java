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

    public static ListNode CycleNode(ListNode head) {
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

    public static ListNode takeInput() {
        int n = scn.nextInt();
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }
        int idx = scn.nextInt();
        if (idx >= 0) {
            ListNode curr = dummy.next;
            while (idx-- > 0) {
                curr = curr.next;
            }
            prev.next = curr;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = takeInput();
        ListNode ans = CycleNode(head);
        System.out.println(ans!=null?ans.val:-1);
    }
}
