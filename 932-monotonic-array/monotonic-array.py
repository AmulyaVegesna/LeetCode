class Solution:
    def isMonotonic(self, nums: List[int]) -> bool:
        c1, c2 = 0, 0
        for i in range(len(nums)-1):
            j = i+1
            if nums[i] <= nums[j]:
                c1+=1
            if nums[i] >= nums[j]:
                c2+=1
        if c1 == (len(nums)-1) or c2 == (len(nums)-1):
            return True
        else:
            return False
        # return c1,c2