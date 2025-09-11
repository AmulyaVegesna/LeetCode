class Solution {
    public int calculate(String s) {
        int res=0,n=0,sign=1;
        Stack<Integer> st = new Stack<>();
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch))n = n*10+(ch-'0');
            else if(ch=='+' || ch=='-'){
                res += n*sign;
                n=0;
                sign = (ch=='-')?-1:1;
            }
             else if(ch=='('){
                st.push(res);
                st.push(sign);
                res=0;sign=1;
             }
             else if(ch==')'){
                res = res+n*sign;
                n=0;
                res *= st.pop();
                res += st.pop();
             }
         }
        return res+n*sign;
    }
}