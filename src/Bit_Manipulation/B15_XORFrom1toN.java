package Bit_Manipulation;

public class B15_XORFrom1toN {

    public static void main(String[] args) {

        int n=5;

        //bruteforce
        int xor=0;
        for(int i=1;i<=n;i++){
            xor=xor^i;
        }

        System.out.println(xor);


        //optimal

        if(n%4==0){
            System.out.println(n);
        }
        else if(n%4==1){
            System.out.println(1);
        }
        else if(n%4==2){
            System.out.println(n+1);
        }
        else{
            System.out.println(0);
        }
    }
}
