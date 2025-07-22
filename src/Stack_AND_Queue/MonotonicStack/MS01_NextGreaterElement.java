package Stack_AND_Queue.MonotonicStack;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class MS01_NextGreaterElement {

    public static void main(String[] args) {

        int [] arr = {6,0,8,1,3};

        //brute force
        int [] nge = new int [arr.length];
        Arrays.fill(nge,-1);

        for(int i=0;i<arr.length;i++) {
            int count = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    nge[i] = arr[j];
                    count++;
                    break;
                }
            }
        }


        for(int i:nge){
            System.out.print(i+" ");
        }

// optimal Solution

        ArrayList<Integer> li = new ArrayList<>();

        Stack<Integer> st = new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
            while(!st.empty() && st.peek()<=arr[i]){
                st.pop();
            }

            if(st.empty()){
                li.addFirst(-1);
            }
            else{
                li.addFirst(st.peek());
            }

            st.push(arr[i]);
        }

        System.out.println(li);
    }
}
