package Recursion;

public class R7_StringIsPalindrome {

    public static void main(String[] args) {
        String str ="vikas";
        System.out.println(palin(str,0,str.length()-1));
    }

    public static boolean palin(String str , int l, int r){

        if(l>r){
            return true;
        }

        if(str.charAt(l)!=str.charAt(r)){
            return false;
        }

        l++;
        r--;

        return palin(str,l,r);


    }

}
