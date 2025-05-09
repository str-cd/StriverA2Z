package Bit_Manipulation;

public class B11_CountNumberOfSetBits {

    public static void main(String[] args) {
        int n=7;

        int count=0;

        while(n>0){
            count+=n&1;
            n=n>>1;
        }

        System.out.println(count);
    }
    
}
