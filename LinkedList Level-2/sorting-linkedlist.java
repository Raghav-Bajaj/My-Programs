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
      public static ListNode merger2lists(ListNode l1 , ListNode l2)
      {
          if(l1 == null) return l2 ;
          if(l2 == null)  return l1 ;
          ListNode dummy = new ListNode(-1);
          ListNode pre = dummy ;
          ListNode c1 = l1 ;
          ListNode c2 = l2 ;
          while(c1 != null && c2 != null)
          {
              if(c1.val < c2.val)
              {
                  pre.next = c1 ;
                  c1 = c1.next ;
              }else{
                  pre.next = c2 ;
                  c2 = c2.next ;
              }
              pre = pre.next ;
          }
          if(c1 != null)
          {
              pre.next = c1 ;
          }
          if(c2 != null)
          {
              pre.next = c2 ;
          }
          return dummy.next ;
      }
    public static ListNode mergeSort(ListNode head) {
        if(head == null || head.next == null)
            return head ;
        ListNode mid = middle(head);
        ListNode nhead = mid.next ;
        mid.next = null ;
        ListNode l1 = mergeSort(head);
        ListNode l2 = mergeSort(nhead);
        return merger2lists(l1 , l2);
        
        
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

        ListNode head = mergeSort(h1);
        printList(head);
    }
}
