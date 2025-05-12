package Bit_Manipulation;

import java.util.ArrayList;

public class B19_PrimeFactorOfANumber {

    public static void main(String[] args) {

        int n=780;

        //bruteforce
        ArrayList<Integer> li = new ArrayList<>();

        for(int i=2;i<=n;i++){
            if(n%i==0){
                li.add(i);
                while(n%i==0){
                    n=n/i;
                }
            }
        }

        System.out.println(li);

        int n2=780;
        //optimal
        ArrayList<Integer> li2 = new ArrayList<>();
        for(int i=2;i<=Math.sqrt(n2);i++){
            if(n2%i==0){
                li2.add(i);
                while(n2%i==0){
                    n2=n2/i;
                }
            }
        }

        if(n2!=1){
            li2.add(n2);
        }

        System.out.println(li2);
    }
}
