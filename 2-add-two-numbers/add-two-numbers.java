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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = new ListNode(0);
        ListNode q = p;
        int c = 0;
        while(l1 != null || l2!=null || c !=0){
            int d1 = l1!=null?l1.val:0;
            int d2 = l2!=null?l2.val:0;
            int s = d1+d2+c;
            ListNode r = new ListNode(s%10);
            c = s/10;
            q.next = r;
            q = q.next;
            l1 = l1!=null?l1.next:null;
            l2 = l2!=null?l2.next:null;
        }
        return p.next;
    }
}