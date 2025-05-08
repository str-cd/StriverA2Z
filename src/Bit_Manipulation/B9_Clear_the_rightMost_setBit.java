package Bit_Manipulation;

import javax.crypto.spec.PSource;

public class B9_Clear_the_rightMost_setBit {

    public static void main(String[] args) {
        int n=15;

        int ans = n&(n-1);

        System.out.println(ans);
    }
}
