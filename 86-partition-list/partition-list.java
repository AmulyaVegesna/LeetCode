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
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode p = new ListNode(0);
        ListNode q = new ListNode(0);
        ListNode pp = p, qp = q;
        while(head != null){
            if (head.val < x){
                pp.next = head;
                pp = pp.next;
            }
            else if(head.val >= x){
                qp.next = head;
                qp = qp.next;
            }
            head = head.next;
        }
        pp.next = q.next;
        qp.next = null;
        return p.next;
    }
}