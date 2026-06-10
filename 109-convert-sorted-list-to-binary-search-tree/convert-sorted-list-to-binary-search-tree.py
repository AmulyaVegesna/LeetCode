# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sortedListToBST(self, head: Optional[ListNode]) -> Optional[TreeNode]:

        n = 0
        temp = head
        while temp:
            n += 1
            temp = temp.next

        current = head

        def build(left, right):
            nonlocal current

            if left > right:
                return None

            mid = (left + right) // 2

            leftSubtree = build(left, mid - 1)

            root = TreeNode(current.val)
            current = current.next

            root.left = leftSubtree
            root.right = build(mid + 1, right)

            return root

        return build(0, n - 1)