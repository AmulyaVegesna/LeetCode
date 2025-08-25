class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        s = ""
        for i in range(len(nums)):
            s += str(nums[i])
        s = s.split("0")
        l = []
        for i in s:
            l.append(len(i))
        return max(l)
