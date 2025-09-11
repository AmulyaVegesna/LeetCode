class Solution {
    public boolean backspaceCompare(String s, String t) {
        return evaluate(s).equals(evaluate(t));
    }
    public String evaluate(String s){
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch!='#')sb.append(ch);
            else{
                if(sb.length()!=0)sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.toString();
    }
}