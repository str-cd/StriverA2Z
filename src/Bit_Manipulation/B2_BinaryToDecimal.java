package Bit_Manipulation;

public class B2_BinaryToDecimal {

    public static void main(String[] args) {
        System.out.println(binaryToString("1010"));
    }
    public static int binaryToString(String str){

        int ans =0;
        int mul=0;
        for(int i=str.length()-1;i>=0;i--){
            int value = Integer.parseInt(""+ str.charAt(i));
            double res =value*Math.pow(2,mul);
            mul++;
            ans+=(int)res;
        }
        return ans;
    }
}
