class Solution:
    def findContentChildren(self, g: List[int], s: List[int]) -> int:
        # count  = 0
        # for i in range(len(g)):
        #     for j in range(len(s)):
        #         if g[i] <= s[j]:
        #             count+=1

        # return count
        g.sort()
        s.sort()
        i, j = 0, 0
        while i < len(g) and j < len(s):
            if g[i] <= s[j]:
                i+=1
            j+=1
        return i