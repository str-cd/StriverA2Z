package Recursion;

public class R9_CountSay {
    public static void main(String[] args) {
        countSay(4321);

    }

    public static void countSay(int n){

        if(n==0){
            return;
        }

        String [] arr  = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};

        int say = n%10;
        n=n/10;



        countSay(n);

        System.out.print(arr[say]+" ");

    }

}
