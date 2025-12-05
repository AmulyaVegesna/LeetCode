class Solution:
    def canThreePartsEqualSum(self, arr: List[int]) -> bool:
        tot = sum(arr)
        if tot%3 != 0:
            return False

        tar = tot // 3
        count = 0
        curr_sum = 0

        for i in range(len(arr)):
            curr_sum += arr[i]
            if curr_sum == tar:
                count += 1
                curr_sum = 0

        return count >= 3