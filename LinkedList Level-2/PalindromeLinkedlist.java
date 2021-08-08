import java.util.*;

class Main {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static boolean isPalindrome(ListNode head) {
    if(head == null || head.next == null)
        return true ;
    // ListNode curr = head ;
    // ListNode pre = null ;
    // ListNode next = null ;
    ListNode fast = head ;
    ListNode slow = head ;
    while(fast.next != null && fast.next.next != null)
    {
      fast = fast.next.next ;
      slow = slow.next ;
    }
    
    ListNode n_head = slow.next ;
        ListNode curr = n_head ;
        ListNode pre = null ;
        ListNode next = null ;
        while(curr != null)
        {
            next = curr.next ;
            curr.next = pre ;
            pre = curr ;
            curr = next ;
        }
       n_head = pre ;
    while(n_head != null)
    {
        if(n_head.val != head.val)
            return false ;
        head = head.next ;
        n_head = n_head.next ;
    }
        return true;
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

        System.out.println(isPalindrome(dummy.next));
    }
}
