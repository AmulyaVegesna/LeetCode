class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        n = len(cost)
        dp = dp1 = dp2 = 0
        for i in range(2, n+1):
            oneS = dp1+cost[i-1]
            twoS = dp2+cost[i-2]
            dp = min(oneS, twoS)
            dp2=dp1
            dp1=dp
        return dp1