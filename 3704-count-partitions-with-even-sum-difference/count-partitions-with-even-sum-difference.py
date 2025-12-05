class Solution:
    def countPartitions(self, arr: List[int]) -> int:
        tot = sum(arr)
        count = 0
        curr = 0
        for i in range(len(arr)-1):
            curr += arr[i]
            if (curr - (tot - curr))%2 == 0:
                count += 1
        return count