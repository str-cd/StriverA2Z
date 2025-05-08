package Bit_Manipulation;

public class B5_CheckIfTheNumberIsOddOrEven {
    public static void main(String[] args) {

        int n=7; //101

        if((n&1) ==0){ //101&1 == 001  which is 1 so odd
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

    }
}
