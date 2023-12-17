class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stk=new Stack<>();
        int c=0;
        char a[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(a[i]=='('){
                stk.push('(');
            }
            else if(stk.size()!=0&&stk.peek()=='('){
                stk.pop();
            }
            else c++;
        }
        return c+stk.size();
    }
}