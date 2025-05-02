package Recursion;

public class R4_SumOfN_Numbers {

    public static void main(String[] args) {
        System.out.println(sum(3));
    }

    public static int sum(int n){
        if(n==1){
            return 1;
        }

        int value = sum(n-1);

        return n+value;
    }

}
