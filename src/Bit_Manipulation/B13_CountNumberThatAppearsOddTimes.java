package Bit_Manipulation;

public class B13_CountNumberThatAppearsOddTimes {

    public static void main(String[] args) {

        int [] arr ={1,1,2,3,3};

        int ans =0;
        for(int i:arr){
            ans=ans^i;
        }

        System.out.println(ans);

    }
}
