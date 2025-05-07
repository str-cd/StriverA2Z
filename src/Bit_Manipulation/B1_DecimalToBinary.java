package Bit_Manipulation;

public class B1_DecimalToBinary {

    public static void main(String[] args) {
        int decimal = 10;

        String ans = decimalToBinary(decimal);
        System.out.println(ans);
    }

    public static String decimalToBinary(int x){

        StringBuilder str = new StringBuilder();

        while(x>0){
            str.append(x%2);
            x=x/2;
        }

        str.reverse();

        return str.toString();

    }
}
