package Recursion;

import java.util.Stack;

public class R18_SortStack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(4);
        s.push(8);
        s.push(5);
        s.push(9);
        s.push(1);
        s.push(2);

        System.out.println(s);

        Stack<Integer> stack = sort(s);
        System.out.println(stack);
    }
    public static Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        if(s.isEmpty()){
            return s;
        }

        int num = s.peek();
        s.pop();

        sort(s);

        sortedInsert(s,num);
        return s;

    }

    public static void sortedInsert(Stack<Integer> s ,int n){

        if(s.isEmpty() || (!s.isEmpty() && s.peek()<n)){
            s.push(n);
            return;
        }

        int num = s.peek();
        s.pop();

        sortedInsert(s,n);

        s.push(num);
    }
}
