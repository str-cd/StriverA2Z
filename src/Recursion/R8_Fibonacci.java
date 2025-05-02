package Recursion;

public class R8_Fibonacci {

    public static void main(String[] args) {
        System.out.println(fab(5));
    }

    public static int fab(int  n){

        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }

        int last = fab(n-1);
        int slast =fab(n-2);

        return last+slast;
    }
}
