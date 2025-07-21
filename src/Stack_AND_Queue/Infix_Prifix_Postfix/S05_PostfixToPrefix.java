package Stack_AND_Queue.Infix_Prifix_Postfix;

import java.util.Stack;

public class S05_PostfixToPrefix {
    public static void main(String[] args) {
        String s ="AB-DE+F*/";
        System.out.println(postfixToPrefix(s));
    }

    public static String postfixToPrefix(String s){
        Stack<String> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if((c>='A'&&c<='Z')||(c>='a'&&c<='z')||(c>='0'&&c<='9')){
                st.push(""+c);
            }

            else {
                String t1 = st.pop();
                String t2 = st.pop();
                String toPush = "" + c + t2 + t1;
                st.push(toPush);
            }
        }

        return st.peek();
    }
}
