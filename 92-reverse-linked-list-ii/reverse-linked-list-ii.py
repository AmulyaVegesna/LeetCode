# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseBetween(self, head: Optional[ListNode], left: int, right: int) -> Optional[ListNode]:
        d = ListNode(0)
        d.next = head
        Lprev = d
        for _ in range(left-1):
            Lprev = Lprev.next
        curr = Lprev.next
        for _ in range(right - left):
            to_move = curr.next
            curr.next = to_move.next
            to_move.next = Lprev.next
            Lprev.next = to_move
        
        return d.next