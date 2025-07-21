package Stack_AND_Queue.Infix_Prifix_Postfix;

import java.util.Stack;

public class S04_PrefixToInfix {
    public static void main(String[] args) {

        String s = "*+PQ-MN";

        System.out.println(prefixToInfix(s));
    }

    public static String prefixToInfix(String s){
        Stack<String> st = new Stack<>();

        for(int i=s.length()-1;i>=0;i--){
            char c = s.charAt(i);

            if((c>='A'&&c<='Z')||(c>='a'&&c<='z')||(c>='0'&&c<='9')){
                st.push(""+c);
            }

            else{
                String first = st.pop();
                String sec = st.pop();

                String toPush ="("+first+c+sec+")";
                st.push(toPush);
            }
        }

        return  st.peek();
    }
}
