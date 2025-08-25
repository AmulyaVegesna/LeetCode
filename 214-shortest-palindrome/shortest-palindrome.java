class Solution {
    public String shortestPalindrome(String s) {
        if(s.length()==0)return s;
        int l=0;
        for(int r = s.length()-1;r>=0;r--){
            if(s.charAt(r)==s.charAt(l))l++;
        }
        if(l==s.length())return s;
        String suffix = s.substring(l);
        StringBuilder res = new StringBuilder(suffix);
        return res.reverse().append(shortestPalindrome(s.substring(0,l))).append(suffix).toString();

    }
}