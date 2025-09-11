class Solution:
    def sortVowels(self, s: str) -> str:
        vowel = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']
        l = []
        for i in range(len(s)):
            if s[i] in vowel:
                l.append(s[i])
        l.sort()
        result = []
        for c in s:
            if c in vowel:
                result.append(l.pop(0))
            else:
                result.append(c)
    
        return ''.join(result)