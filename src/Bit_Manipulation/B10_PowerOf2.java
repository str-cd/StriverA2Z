package Bit_Manipulation;

public class B10_PowerOf2 {
    public static void main(String[] args) {

        int n =5;

        if(n>0 && (n&(n-1))==0){
            System.out.println("true");
        }
        else{
            System.out.println("False");
        }
    }
}
