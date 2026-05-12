# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def partition(self, head: Optional[ListNode], x: int) -> Optional[ListNode]:
        d1 = ListNode(0)
        d2 = ListNode(0)
        p = d1
        q = d2
        while(head is not None):
            if head.val < x:
                p.next = head
                p = head
            elif head.val >= x:
                q.next = head
                q = head
            head = head.next
        q.next = None
        p.next = d2.next
        return d1.next