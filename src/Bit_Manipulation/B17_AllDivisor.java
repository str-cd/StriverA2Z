package Bit_Manipulation;

import java.util.ArrayList;

public class B17_AllDivisor {

    public static void main(String[] args) {

        ArrayList<Integer> li = new ArrayList<>();
        int n=36;
        for(int i=1;i*i<=36;i++){

            if(n%i==0){
                li.add(i);
                if(n/i!=i){
                    li.add(n/i);
                }
            }
        }

        System.out.println(li);

    }
}
