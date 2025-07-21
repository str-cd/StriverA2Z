package Stack_AND_Queue.Infix_Prifix_Postfix;

import java.util.Stack;

public class S01_InfixToPostfix {

    public static void main(String[] args) {
        String s = "a+b*(c^d-e)^(f+g*h)-i";

        String ans = infixToPostfix(s);

        System.out.println(ans); //abcd^e-fgh*+^*+i-
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
                while (!st.isEmpty() && precedence(c) <= precedence(st.peek()) ) {
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
