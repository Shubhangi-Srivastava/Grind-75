/*
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.Stack;

public class ValidParentheses {
    public static void main(String args[]){
        String s = "()[]{}";
        ValidParentheses obj = new ValidParentheses();
        boolean ans = obj.isValidParentheses(s);
        System.out.println(ans);
    }

public boolean isValidParentheses(String s) { 
            Stack<Character> st = new Stack<>();
            for(int i = 0 ; i < s.length(); i++){
                char ch = s.charAt(i);
                if(ch == '(' || ch == '[' || ch == '{'){
                    st.push(ch);
                } else if(ch == ']'){
                    if(st.isEmpty())
                    return false;
                    if(st.peek() != '[') return false;
                    else 
                    st.pop();
                }else if(ch == '}'){
                    if(st.isEmpty())
                    return false;
                    if(st.peek() != '{') return false;
                    else 
                    st.pop();
                }
                else if(ch == ')'){
                    if(st.isEmpty())
                    return false;
                    if(st.peek() != '(') return false;
                    else 
                    st.pop();
                }
            }
            if(st.isEmpty())
            return true;
            else return false;
}
}