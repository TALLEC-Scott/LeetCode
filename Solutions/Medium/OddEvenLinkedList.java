package Medium;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {

        var odd = head;
        if (head == null)
            return head;
        var even_start = head.next;
        var even = even_start;
        if (even == null)
            return head;
        while (true) {
            odd.next = even.next;
            if(odd.next == null)
                break;
            odd = odd.next;
            even.next = odd.next;
            if (even.next == null)
                break;
            even = even.next;
            }
        odd.next = even_start;
        return head;
    }
}
