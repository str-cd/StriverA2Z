package Recursion;

public class R5_Factorial {

    public static void main(String[] args) {
        System.out.println(fact(5));

    }

    public static int fact(int n){
        if(n==1){
            return 1;
        }

        int value = fact(n-1);

        return n*value;
    }

}
