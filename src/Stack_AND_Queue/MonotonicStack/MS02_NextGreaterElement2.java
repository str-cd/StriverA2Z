package Stack_AND_Queue.MonotonicStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class MS02_NextGreaterElement2 {
    public static void main(String[] args) {

        int[] arr = {2,10,12,1,11};

        int [] nge = new int [arr.length];

        Arrays.fill(nge,-1);
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<i+n-1;j++){
                if(arr[j%n]>arr[i]){
                    nge[i]=arr[j%n];
                    break;
                }
            }
        }

        for(int i:nge){
            System.out.println(i);
        }


        ArrayList<Integer> li = new ArrayList<>();
        Stack<Integer> st  = new Stack<>();
        for(int i=2*n-1;i>=0;i--){

            while(!st.empty() && st.peek()<=arr[i%n]){
                st.pop();
            }

            if(i<n){
                li.add(0,st.isEmpty() ? -1:st.peek());
            }

            st.push(arr[i%n]);
        }

        System.out.println(li);

    }
}
