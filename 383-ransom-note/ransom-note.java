class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> dict = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            dict.put(c, dict.getOrDefault(c, 0) + 1);
        }
        for(char c : ransomNote.toCharArray()){
            if(!dict.containsKey(c)){
                return false;
            }
            else if(dict.get(c) == 0){
                return false;
            }
            else {
                dict.put(c, dict.get(c) - 1);
            }
        }
        return true;
    }
}