class Solution:
    def maxSum(self, nums: List[int]) -> int:
        l=list(set(nums))
        ans=[]
        for i in l:
            if i>0:
                ans.append(i)
        if not ans:
            return max(l)
        return sum(ans)