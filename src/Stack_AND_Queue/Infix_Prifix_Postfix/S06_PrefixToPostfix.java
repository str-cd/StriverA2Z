package Stack_AND_Queue.Infix_Prifix_Postfix;
import java.util.Stack;

public class S06_PrefixToPostfix {

    public static void main(String[] args) {

        String str = "/-AB*+DEF";
        System.out.println(PrefixToPostfix(str));

    }

    public static String PrefixToPostfix(String s){

        Stack<String> st = new Stack<>();

        for(int i=s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            if((c>='A'&&c<='Z')||(c>='a'&&c<='z')||(c>='0'&&c<='9')){
                st.push(""+c);
            }

            else {
                String t1 = st.pop();
                String t2 = st.pop();
                String toPush = "" + t1+t2+c;
                st.push(toPush);
            }
        }
        return st.peek();
    }
}
