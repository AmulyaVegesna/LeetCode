class Solution {
    public int minAddToMakeValid(String s) 
    {
        Stack<Integer> stack=new Stack<>();
        StringBuilder str=new StringBuilder(s);
        int count =0;
        for(int i=0;i<str.length();i++){
             char ch=str.charAt(i);
             if(ch=='(')stack.push(i);
             else{
                if(ch==')'){
                    if(!stack.isEmpty())stack.pop();
                    else{
                        str.deleteCharAt(i);
                        i--;count += 1;
                    }
                }
             }
        }
        while(!stack.isEmpty()) {
            str.deleteCharAt(stack.pop());
            count ++;
        }
        return count;
    }
}