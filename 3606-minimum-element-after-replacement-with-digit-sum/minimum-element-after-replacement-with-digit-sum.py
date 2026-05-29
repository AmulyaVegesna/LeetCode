class Solution:
    def minElement(self, nums: list[int]) -> int:
        num_s = [str(num) for num in nums]
        digit_sums = []
        for num in num_s:
            digit_sum = sum(int(digit) for digit in num)
            digit_sums.append(digit_sum)
        return min(digit_sums)
