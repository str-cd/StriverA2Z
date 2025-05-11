package Bit_Manipulation;

public class B16_XORFromLtoR {

    public static void main(String[] args) {

        int l =3;
        int r =7;

        //bruteforce
        int res = 0;

        for(int i=l;i<=r;i++){
            res^=i;
        }
        System.out.println(res);

        //optimal

        System.out.println(find(l-1)^find(r));



    }

    public static int find(int n){
        if(n%4==0){
            return n;
        }
        if(n%4==1){
            return 1;
        }
        if(n%4==2){
            return n+1;
        }
        return 0;
    }
}
