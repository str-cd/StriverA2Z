package Stack_AND_Queue.MonotonicStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class MS_03_NextSmallerElement {

    public static void main(String[] args) {

        int [] arr ={4, 8, 5, 2, 25};
        int [] nse = new int [arr.length];

        Arrays.fill(nse,-1);

        //bruteFOrce
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    nse[i]=arr[j];
                    break;
                  }
            }
        }

        for(int i:nse){
            System.out.println(i);
        }


        //optimal
        ArrayList<Integer> li = new ArrayList<>();

        Stack<Integer> st = new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
            while(!st.empty() && arr[i]<=st.peek()){
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
