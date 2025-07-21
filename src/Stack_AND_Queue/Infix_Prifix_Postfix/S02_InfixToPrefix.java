package Stack_AND_Queue.Infix_Prifix_Postfix;

import java.util.Stack;

public class S02_InfixToPrefix {

    public static void main(String[] args) {

        String str = "(A+B)*C-D+F";

        System.out.println(infixToPrefix(str));
    }

    public static String infixToPrefix(String s){

        StringBuilder str =new StringBuilder();

        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='('){
                str.append(')');
            }
            else if(s.charAt(i)==')'){
                str.append('(');
            }
            else{
                str.append(s.charAt(i));
            }

        }

        String res = infixToPostfix(str.toString());

        StringBuilder ret = new StringBuilder(res);

        return ret.reverse().toString();

    }
    public static String infixToPostfix(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                ans.append(c);
            } else if (c == '(') {
                st.push(c);
            } else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans.append(st.pop());
                }
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                }
            } else {
                while (!st.isEmpty() && precedence(c) < precedence(st.peek()) ) {
                    ans.append(st.pop());
                }
                st.push(c);
            }
        }

        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.toString();
    }

    private static int precedence(char c) {
        return switch (c) {
            case '^' -> 3;
            case '*', '/' -> 2;
            case '+', '-' -> 1;
            default -> -1;
        };
    }
}
