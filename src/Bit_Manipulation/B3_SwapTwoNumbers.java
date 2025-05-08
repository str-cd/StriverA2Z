package Bit_Manipulation;

public class B3_SwapTwoNumbers {

    public static void main(String[] args) {
        int a =2;
        int b =3;

        a = a^b;
        b = a^b; //b=a^b ^b
        a = a^b; //a=a^b ^a

        System.out.println(a);
        System.out.println(b);
    }
}
