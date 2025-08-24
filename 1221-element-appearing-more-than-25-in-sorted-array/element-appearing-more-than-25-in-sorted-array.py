class Solution:
    def findSpecialInteger(self, arr: List[int]) -> int:
        n = len(arr)
        count = 0
        ans = 0
        for i in range(len(arr)):
            a = arr.count(arr[i])
            if a > (25/100)*n:
                ans = arr[i]
        return ans