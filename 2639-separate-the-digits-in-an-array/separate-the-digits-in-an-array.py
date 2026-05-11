class Solution:
    def separateDigits(self, nums: List[int]) -> List[int]:
        ans = []
        t = []
        for i in nums:
            t.append(str(i))

            for j in str(i):
                ans.append(str(j))
        answer = []
        for i in ans:
            answer.append(int(i))
        return answer