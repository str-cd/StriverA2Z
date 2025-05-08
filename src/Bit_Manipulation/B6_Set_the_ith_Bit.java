package Bit_Manipulation;

public class B6_Set_the_ith_Bit {
    public static void main(String[] args) {

        int n = 9; //1001

        int i=2;

        int value =1<<i; //1<<2 = 100;

        n=(n|value); //1001|100 =1101

        System.out.println(n);


    }
}
