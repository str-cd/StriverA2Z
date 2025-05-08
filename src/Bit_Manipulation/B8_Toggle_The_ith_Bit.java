package Bit_Manipulation;

public class B8_Toggle_The_ith_Bit {
    public static void main(String[] args) {
        int n =9;
        int i =2;

        n = n^(1<<2);

        System.out.println(n);
    }
}
