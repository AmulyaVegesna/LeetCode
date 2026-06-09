# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def __sortedArrayToBST(self, nums, left, right):
        if left > right:
            return None
        mid = (left + right)//2
        n = TreeNode(nums[mid])
        n.left = self.__sortedArrayToBST(nums, left, mid-1)
        n.right = self.__sortedArrayToBST(nums, mid+1, right)
        return n
    def sortedArrayToBST(self, nums: List[int]) -> Optional[TreeNode]:
        return self.__sortedArrayToBST(nums, 0, len(nums)-1)
    