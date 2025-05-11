package Bit_Manipulation;

public class B12_CountNumberOfBitsToCovertAtoB {
    public static void main(String[] args) {
        int a =10; //1010
        int b =7;  //0111

        int xor=a^b;

        int count =0;
        while(xor>0){
            count+=xor&1;
            xor=xor>>1;
        }

        System.out.println(count);
    }

}
