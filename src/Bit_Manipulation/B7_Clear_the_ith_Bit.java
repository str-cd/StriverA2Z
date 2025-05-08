package Bit_Manipulation;

public class B7_Clear_the_ith_Bit {
    public static void main(String[] args) {
        int n = 9; // 1001
        int i = 3;

        int mask = ~(1 << i); // Inverts 1000 to 0111
        n = n & mask;         // 1001 & 0111 = 0001

        System.out.println(n);

    }
}
