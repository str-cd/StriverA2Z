package Bit_Manipulation;

public class B21_XPowerN {
    public static void main(String[] args) {
        int x =2;
        int n =3;

        //brute force
        /* int ans =1;
        for(int i=1;i<=n;i++){
            ans*=x;
        }

        System.out.println(ans);*/

        // Optimal Solution
        int ans =1;
        while(n>0){
            if(n%2!=0){
                ans*=x;
                n=n-1;
            }

            else{
                x=x*x;
                n=n/2;
            }

        }

        System.out.println(ans);

    }
}
