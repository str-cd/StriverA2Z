package Recursion;

import java.util.Stack;

public class R19_ReverseAStack {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(4);
        s.push(8);
        s.push(5);
        s.push(9);
        s.push(1);
        s.push(2);

        System.out.println(s);

        reverse(s);
        System.out.println(s);
    }

    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }

        int num = s.pop();
        reverse(s);
        insertAtBottom(s,num);
    }

    public static void insertAtBottom(Stack<Integer> s , int n){
        if(s.isEmpty()){
            s.push(n);
            return;
        }

        int top = s.pop();
        insertAtBottom(s,n);
        s.push(top);
    }

}
