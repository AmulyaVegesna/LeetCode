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
    public ListNode mergeNodes(ListNode head) {
        ListNode p = new ListNode(0);
        ListNode q = p;
        head = head.next;
        int s = 0;
        while (head != null) {
            if(head.val != 0){
                s = s+head.val;
            }
            else {
                q.next = new ListNode(s);
                s = 0;
                q = q.next;
            }
            head = head.next;
        }
        return p.next;
    }
}