class Solution:
    def numOfUnplacedFruits(self, f: List[int], b: List[int]) -> int:
        ans=0
        for i in f:
            for j in range(len(b)):
                if b[j]>=i:
                    b.pop(j)
                    break
            else:
                ans+=1
        return ans