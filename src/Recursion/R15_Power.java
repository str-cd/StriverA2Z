package Recursion;

public class R15_Power {

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println(power(a,b));
    }

    public static int power(int a ,int b){

        if(b==0){
            return 1;
        }
        if(b==1){
            return a;
        }

        int res = power(a,b/2);

        if(b%2==0){
            return res*res;
        }
        else{
            return a*res*res;
        }

    }
}
