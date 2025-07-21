package Stack_AND_Queue.Infix_Prifix_Postfix;

import java.util.Stack;

public class S03_PostfixToInfix {
    public static void main(String[] args) {

        String s = "AB-DE+F*/";

        System.out.println(postfixToInfix(s));
    }

    public static String postfixToInfix(String s){
        Stack<String>  st = new Stack<>();
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);

            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                st.push(""+c);
            } else {
                String sec = st.pop();
                String first = st.pop();

                String str = "(" + first + c + sec + ")";
                st.push(str);
            }
        }
        return st.peek();
    }
}
