class Solution:
    def minSwaps(self, s: str) -> int:
        balance = 0
        maxImbalance = 0
        
        for ch in s:
            if ch == "[":
                balance += 1
            else:
                balance -= 1
            maxImbalance = min(maxImbalance, balance)
        return (-maxImbalance + 1) // 2