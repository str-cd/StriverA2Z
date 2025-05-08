package Bit_Manipulation;

public class B4_Check_If_ith_bit_isSetOrNot {

    public static void main(String[] args) {
        int n=7;// 111
        int i=2;

        //1st way

        int value = 1<<i;// 1<<2 == 100

        if((n&value)>0){ //111&100  = 100
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }



    }
}
