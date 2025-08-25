class Solution:
    def sortArrayByParity(self, nums: List[int]) -> List[int]:
        nums.sort()
        e = []
        o = []
        for i in nums:
            if i%2==0:
                e.append(i)
            else:
                o.append(i)
        ans = e+o
        return ans